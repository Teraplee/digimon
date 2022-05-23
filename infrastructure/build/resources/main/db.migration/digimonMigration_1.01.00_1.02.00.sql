DO
$$
    BEGIN
        CALL digimon.check_version_db('1.01.00');

        UPDATE digimon.sys_setting SET value = 'Loading' WHERE name = 'db_status';

        --
        ALTER TABLE IF EXISTS digimon.duel ADD COLUMN IF NOT EXISTS updated_at TIMESTAMP NOT NULL DEFAULT current_timestamp;
        ALTER TABLE IF EXISTS digimon.duel ADD COLUMN IF NOT EXISTS updated_by VARCHAR NOT NULL DEFAULT 'digimon_system';

        CREATE TRIGGER duel_updated_trigger
            BEFORE INSERT OR UPDATE ON digimon.duel
            FOR EACH ROW EXECUTE PROCEDURE digimon.updated_trigger_function();

        CREATE OR REPLACE FUNCTION digimon.updated_trigger_function() RETURNS TRIGGER AS $trigger_function$
        BEGIN
            NEW.updated_at := current_timestamp;
            NEW.updated_by := (SELECT value FROM digimon.settings WHERE name = 'system_user');
            RETURN NEW;
        END
        $trigger_function$ LANGUAGE plpgsql;

        UPDATE digimon.sys_setting SET value = current_timestamp WHERE name = 'last_db_modify';
        UPDATE digimon.sys_setting SET value = '1.02.00' WHERE name = 'db_version';
        UPDATE digimon.sys_setting SET value = 'success' WHERE name = 'db_status';

    EXCEPTION
        WHEN OTHERS THEN
            UPDATE digimon.sys_setting SET value = current_timestamp WHERE name = 'last_db_modify';
            UPDATE digimon.sys_setting SET value = SQLERRM::varchar WHERE name = 'db_status';
            RAISE NOTICE '%', SQLERRM;
    END;
$$ LANGUAGE plpgsql;