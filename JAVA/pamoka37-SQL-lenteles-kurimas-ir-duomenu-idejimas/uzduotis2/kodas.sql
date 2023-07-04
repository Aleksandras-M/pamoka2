CREATE TABLE prekes(
    id INT UNSIGNED ZEROFILL AUTO_INCREMENT,
    pavadinimas VARCHAR(200) NOT NULL,
    kaina DECIMAL(10, 2) UNSIGNED,
    kiekis_sandelyje INT UNSIGNED DEFAULT 0,
    kategorija VARCHAR(100),
    PRIMARY KEY(id)
);

INSERT INTO prekes(
    id,
    pavadinimas,
    kaina,
    kiekis_sandelyje,
    kategorija
)
VALUES(
    null,
    'Kėdė',
    29.99,
    32,
    'Baldai'
);

INSERT INTO prekes(
    id,
    pavadinimas,
    kaina,
    kiekis_sandelyje,
    kategorija
)
VALUES(
    null,
    'Stalas',
    99.99,
    12,
    'Baldai'
);