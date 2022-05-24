CREATE SCHEMA IF NOT EXISTS digimon;

CREATE SEQUENCE IF NOT EXISTS digimon.sys_setting_seq START 1;

CREATE TABLE IF NOT EXISTS digimon.sys_setting
(
    id          BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('digimon.sys_setting_seq'),
    name        VARCHAR            NOT NULL,
    value       VARCHAR            NOT NULL,
    updated_at  TIMESTAMP          NOT NULL,
    updated_by  VARCHAR            NOT NULL
);

INSERT INTO digimon.sys_setting(id, name, value, updated_at, updated_by) VALUES (1, 'last_db_modify', current_timestamp, current_timestamp, 'digimon_system');
INSERT INTO digimon.sys_setting(id, name, value, updated_at, updated_by) VALUES (2, 'db_version', '1.00.00', current_timestamp, 'digimon_system');
INSERT INTO digimon.sys_setting(id, name, value, updated_at, updated_by) VALUES (3, 'db_status', 'success', current_timestamp, 'digimon_system');

SELECT setval('digimon.sys_setting_seq', (SELECT MAX(id) FROM digimon.sys_setting));

CREATE SEQUENCE IF NOT EXISTS digimon.duel_seq START 1;

CREATE TABLE IF NOT EXISTS digimon.duel(
    id    BIGINT    PRIMARY KEY NOT NULL DEFAULT nextval('digimon.duel_seq'),
    date  TIMESTAMP             NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE SEQUENCE IF NOT EXISTS digimon.players_seq START 1;

CREATE TABLE IF NOT EXISTS digimon.players
(
    id          BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('digimon.players_seq'),
    email       VARCHAR            NOT NULL,
    first_name  VARCHAR            NOT NULL,
    middle_name VARCHAR            NOT NULL,
    last_name   VARCHAR            NOT NULL,
    phone       VARCHAR            NOT NULL,
    username    VARCHAR            NOT NULL,
    password    VARCHAR            NOT NULL,
    updated_at  TIMESTAMP          NOT NULL,
    updated_by  VARCHAR            NOT NULL
);

CREATE TABLE IF NOT EXISTS digimon.duel_players
(
    duel_id   BIGINT NOT NULL,
    player_id BIGINT NOT NULL,
    FOREIGN KEY (duel_id) REFERENCES digimon.duel (id),
    FOREIGN KEY (player_id) REFERENCES digimon.players (id)
);

CREATE SEQUENCE IF NOT EXISTS digimon.classes_dictionary_seq START 1;

CREATE TABLE IF NOT EXISTS digimon.classes_dictionary
(
    id         BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('digimon.classes_dictionary_seq'),
    value      VARCHAR            NOT NULL,
    updated_at TIMESTAMP          NOT NULL,
    updated_by VARCHAR            NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS digimon.types_dictionary_seq START 1;

CREATE TABLE IF NOT EXISTS digimon.types_dictionary
(
    id         BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('digimon.types_dictionary_seq'),
    value      VARCHAR            NOT NULL,
    updated_at TIMESTAMP          NOT NULL,
    updated_by VARCHAR            NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS digimon.groups_dictionary_seq START 1;

CREATE TABLE IF NOT EXISTS digimon.groups_dictionary
(
    id         BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('digimon.groups_dictionary_seq'),
    value      VARCHAR            NOT NULL,
    updated_at TIMESTAMP          NOT NULL,
    updated_by VARCHAR            NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS digimon.digimon_seq START 1;

CREATE TABLE IF NOT EXISTS digimon.digimon
(
    id         BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('digimon.digimon_seq'),
    name       VARCHAR            NOT NULL,
    attack     DOUBLE PRECISION   NOT NULL,
    defence    DOUBLE PRECISION   NOT NULL,
    level      VARCHAR            NOT NULL,
    image_url  VARCHAR            NOT NULL,
    type_id    BIGINT             NOT NULL,
    class_id   BIGINT             NOT NULL,
    group_id   BIGINT             NOT NULL,
    gender     VARCHAR            NOT NULL,
    updated_at TIMESTAMP          NOT NULL,
    updated_by VARCHAR            NOT NULL,
    FOREIGN KEY (type_id) REFERENCES digimon.types_dictionary (id),
    FOREIGN KEY (class_id) REFERENCES digimon.classes_dictionary (id),
    FOREIGN KEY (group_id) REFERENCES digimon.groups_dictionary (id)
);

CREATE TABLE IF NOT EXISTS digimon.players_digimon
(
    player_id  BIGINT NOT NULL,
    digimon_id BIGINT NOT NULL,
    FOREIGN KEY (player_id) REFERENCES digimon.players (id),
    FOREIGN KEY (digimon_id) REFERENCES digimon.digimon (id)
);

CREATE SEQUENCE IF NOT EXISTS digimon.families_dictionary_seq START 1;

CREATE TABLE IF NOT EXISTS digimon.families_dictionary
(
    id          BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('digimon.families_dictionary_seq'),
    value       VARCHAR            NOT NULL,
    short_value VARCHAR            NOT NULL,
    updated_at  TIMESTAMP          NOT NULL,
    updated_by  VARCHAR            NOT NULL
);

CREATE TABLE IF NOT EXISTS digimon.digimon_families_dictionary
(
    digimon_id BIGINT NOT NULL,
    family_id  BIGINT NOT NULL,
    FOREIGN KEY (digimon_id) REFERENCES digimon.digimon (id),
    FOREIGN KEY (family_id) REFERENCES digimon.families_dictionary (id)
);