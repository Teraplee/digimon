--DROP FUNCTION IF EXISTS check_db_status();

CREATE OR REPLACE FUNCTION check_db_status() RETURNS boolean AS $$
    BEGIN
        RETURN (SELECT value = 'success' FROM digimon.sys_setting WHERE name = 'db_status');
    END
$$ LANGUAGE plpgsql;

--SELECT check_db_status();

--DROP FUNCTION IF EXISTS digimon_migration_function();
--DROP TRIGGER IF EXISTS digimon_updated_trigger ON digimon.digimon;
--DROP TRIGGER IF EXISTS duel_updated_trigger ON digimon.duel;
--DROP TRIGGER IF EXISTS players_updated_trigger ON digimon.players;
--DROP TRIGGER IF EXISTS classes_dictionary_updated_trigger ON digimon.classes_dictionary;
--DROP TRIGGER IF EXISTS families_dictionary_updated_trigger ON digimon.families_dictionary;
--DROP TRIGGER IF EXISTS groups_dictionary_updated_trigger ON digimon.groups_dictionary;
--DROP TRIGGER IF EXISTS types_dictionary_updated_trigger ON digimon.types_dictionary;
--DROP TRIGGER IF EXISTS sys_setting_updated_trigger ON digimon.sys_setting;

DROP FUNCTION IF EXISTS updated_trigger_function();

CREATE OR REPLACE FUNCTION digimon_migration_function() RETURNS boolean AS $digimon_migration_function$
    BEGIN
        IF check_db_status() THEN
            --if db_status success
            CREATE OR REPLACE FUNCTION updated_trigger_function() RETURNS TRIGGER AS $trigger_function$
            BEGIN
                NEW.updated_at := current_timestamp;
                NEW.updated_by := 'digimon_system'; -- current_user;
                RETURN NEW;
            END
            $trigger_function$ LANGUAGE plpgsql;

            CREATE TRIGGER digimon_updated_trigger
                BEFORE INSERT OR UPDATE ON digimon.digimon
                FOR EACH ROW EXECUTE FUNCTION updated_trigger_function();

            CREATE TRIGGER players_updated_trigger
                BEFORE INSERT OR UPDATE ON digimon.players
                FOR EACH ROW EXECUTE FUNCTION updated_trigger_function();

            --CREATE TRIGGER duel_updated_trigger
                --BEFORE INSERT OR UPDATE ON digimon.duel
                --FOR EACH ROW EXECUTE FUNCTION updated_trigger_function();

            CREATE TRIGGER classes_dictionary_updated_trigger
                BEFORE INSERT OR UPDATE ON digimon.classes_dictionary
                FOR EACH ROW EXECUTE FUNCTION updated_trigger_function();

            CREATE TRIGGER families_dictionary_updated_trigger
                BEFORE INSERT OR UPDATE ON digimon.families_dictionary
                FOR EACH ROW EXECUTE FUNCTION updated_trigger_function();

            CREATE TRIGGER groups_dictionary_updated_trigger
                BEFORE INSERT OR UPDATE ON digimon.groups_dictionary
                FOR EACH ROW EXECUTE FUNCTION updated_trigger_function();

            CREATE TRIGGER types_dictionary_updated_trigger
                BEFORE INSERT OR UPDATE ON digimon.types_dictionary
                FOR EACH ROW EXECUTE FUNCTION updated_trigger_function();

            CREATE TRIGGER sys_setting_updated_trigger
                BEFORE INSERT OR UPDATE ON digimon.sys_setting
                FOR EACH ROW EXECUTE FUNCTION updated_trigger_function();

            UPDATE digimon.sys_setting SET value = current_timestamp WHERE name = 'last_db_modify';
            UPDATE digimon.sys_setting SET value = '1.01.00' WHERE name = 'db_version';
            UPDATE digimon.sys_setting SET value = 'success' WHERE name = 'db_status';

            RETURN true;
        ELSE
            --if db_status not success
            RETURN false;
        END IF;
    EXCEPTION
        WHEN OTHERS THEN
        --if exception
    END;
$digimon_migration_function$ LANGUAGE plpgsql;

SELECT digimon_migration_function();

