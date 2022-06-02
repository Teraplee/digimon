DO
$$
    BEGIN
        CALL digimon.check_version_db('1.01.00');

        UPDATE digimon.sys_setting SET value = 'Loading' WHERE name = 'db_status';

        --
        ALTER TABLE IF EXISTS digimon.duel ADD COLUMN IF NOT EXISTS updated_at TIMESTAMP;
        ALTER TABLE IF EXISTS digimon.duel ADD COLUMN IF NOT EXISTS updated_by VARCHAR;
        ALTER TABLE IF EXISTS digimon.players ADD CONSTRAINT unique_username UNIQUE (username);

        CREATE TRIGGER duel_updated_trigger
            BEFORE INSERT OR UPDATE ON digimon.duel
            FOR EACH ROW EXECUTE PROCEDURE digimon.updated_trigger_function();

        CREATE OR REPLACE FUNCTION digimon.updated_trigger_function() RETURNS TRIGGER AS $updated_trigger_function$
        BEGIN
            NEW.updated_at := current_timestamp;
            NEW.updated_by := (SELECT value FROM digimon.settings WHERE id = 1);
            RETURN NEW;
        END
        $updated_trigger_function$ LANGUAGE plpgsql;

        CREATE SEQUENCE IF NOT EXISTS digimon.roles_seq START 1;

        CREATE TABLE IF NOT EXISTS digimon.roles
        (
            id            BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('digimon.roles_seq'),
            name          VARCHAR            NOT NULL,
            value         VARCHAR            NOT NULL,
            updated_at    TIMESTAMP          NOT NULL,
            updated_by    VARCHAR            NOT NULL
        );

        CREATE TRIGGER roles_updated_trigger
            BEFORE INSERT OR UPDATE ON digimon.roles
            FOR EACH ROW EXECUTE PROCEDURE digimon.updated_trigger_function();

        INSERT INTO digimon.roles(id, name, value, updated_at, updated_by) VALUES (1, 'Пользователь', 'ROLE_USER', current_timestamp, 'digimon_system');

        ALTER SEQUENCE digimon.roles_seq RESTART WITH 2;

        CREATE TABLE IF NOT EXISTS digimon.players_roles
        (
          player_id BIGINT NOT NULL,
          role_id   BIGINT NOT NULL,
          FOREIGN KEY (player_id) REFERENCES digimon.players (id),
          FOREIGN KEY (role_id) REFERENCES digimon.roles (id)
        );

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