CREATE TABLE prekes(
    id INT UNSIGNED AUTO_INCREMENT NOT NULL,
    pavadinimas VARCHAR(100),
    kaina VARCHAR(20),
    kiekis INT UNSIGNED DEFAULT 0,
    leidėjas VARCHAR(100),
    trukmė INT UNSIGNED,
    PRIMARY KEY(id)
);

ALTER TABLE
    prekes MODIFY COLUMN kaina DECIMAL(10, 2) UNSIGNED;

ALTER TABLE
    prekes
DROP COLUMN
    trukmė;

ALTER TABLE
    prekes
DROP COLUMN
    leidėjas;

ALTER TABLE
    prekes ADD COLUMN gamintojas VARCHAR(100);

ALTER TABLE
    prekes MODIFY COLUMN kiekis INT UNSIGNED DEFAULT 0 NOT NULL;

ALTER TABLE
    prekes ADD COLUMN kategorija VARCHAR(50) NOT NULL;

    