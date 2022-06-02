CREATE OR REPLACE PROCEDURE digimon.check_version_db(IN version text)
AS
$$
    DECLARE
        current_version text := (SELECT value FROM digimon.sys_setting WHERE name = 'db_version');
    BEGIN
        IF current_version <> version THEN
            RAISE EXCEPTION 'Incorrect DB version';
        END IF;
    END;
$$ LANGUAGE plpgsql;

DO
$$
    BEGIN
        CALL digimon.check_version_db('1.00.00');

        UPDATE digimon.sys_setting SET value = 'Loading' WHERE name = 'db_status';

        CREATE OR REPLACE FUNCTION digimon.updated_trigger_function() RETURNS TRIGGER AS $updated_trigger_function$
        BEGIN
            NEW.updated_at := current_timestamp;
            NEW.updated_by := 'digimon_system'; -- current_user;
            RETURN NEW;
        END
        $updated_trigger_function$ LANGUAGE plpgsql;

        CREATE TRIGGER digimon_updated_trigger
            BEFORE INSERT OR UPDATE ON digimon.digimon
            FOR EACH ROW EXECUTE PROCEDURE digimon.updated_trigger_function();

        CREATE TRIGGER players_updated_trigger
            BEFORE INSERT OR UPDATE ON digimon.players
            FOR EACH ROW EXECUTE PROCEDURE digimon.updated_trigger_function();

        CREATE TRIGGER classes_dictionary_updated_trigger
            BEFORE INSERT OR UPDATE ON digimon.classes_dictionary
            FOR EACH ROW EXECUTE PROCEDURE digimon.updated_trigger_function();

        CREATE TRIGGER families_dictionary_updated_trigger
            BEFORE INSERT OR UPDATE ON digimon.families_dictionary
            FOR EACH ROW EXECUTE PROCEDURE digimon.updated_trigger_function();

        CREATE TRIGGER groups_dictionary_updated_trigger
            BEFORE INSERT OR UPDATE ON digimon.groups_dictionary
            FOR EACH ROW EXECUTE PROCEDURE digimon.updated_trigger_function();

        CREATE TRIGGER types_dictionary_updated_trigger
            BEFORE INSERT OR UPDATE ON digimon.types_dictionary
            FOR EACH ROW EXECUTE PROCEDURE digimon.updated_trigger_function();

        CREATE TRIGGER sys_setting_updated_trigger
            BEFORE INSERT OR UPDATE ON digimon.sys_setting
            FOR EACH ROW EXECUTE PROCEDURE digimon.updated_trigger_function();

        CREATE SEQUENCE IF NOT EXISTS digimon.settings_seq START 1;

        CREATE TABLE IF NOT EXISTS digimon.settings
        (
            id            BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('digimon.settings_seq'),
            name          VARCHAR            NOT NULL,
            value         VARCHAR            NOT NULL,
            default_value VARCHAR            NOT NULL,
            updated_at    TIMESTAMP          NOT NULL,
            updated_by    VARCHAR            NOT NULL
        );

        CREATE TRIGGER setting_updated_trigger
            BEFORE INSERT OR UPDATE ON digimon.settings
            FOR EACH ROW EXECUTE PROCEDURE digimon.updated_trigger_function();

        INSERT INTO digimon.settings(id, name, value, default_value, updated_at, updated_by) VALUES (1, 'Системный пользователь', 'system_user', 'system_user', current_timestamp, 'digimon_system');

        ALTER SEQUENCE digimon.settings_seq RESTART WITH 2;

        UPDATE digimon.sys_setting SET value = current_timestamp WHERE name = 'last_db_modify';
        UPDATE digimon.sys_setting SET value = '1.01.00' WHERE name = 'db_version';
        UPDATE digimon.sys_setting SET value = 'success' WHERE name = 'db_status';

    EXCEPTION
        WHEN OTHERS THEN
            UPDATE digimon.sys_setting SET value = current_timestamp WHERE name = 'last_db_modify';
            UPDATE digimon.sys_setting SET value = SQLERRM::varchar WHERE name = 'db_status';
            RAISE NOTICE '%', SQLERRM;
    END
$$ LANGUAGE plpgsql;

