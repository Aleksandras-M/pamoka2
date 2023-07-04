CREATE TABLE knyga(
    id INT UNSIGNED AUTO_INCREMENT NOT NULL,
    pavadinimas VARCHAR(150) NOT NULL,
    leidimo_metai INT UNSIGNED,
    ivertinimas DECIMAL(4, 2) UNSIGNED,
    kaina DECIMAL(10, 2) UNSIGNED NOT NULL,
    isbn varchar(13) unique NOT NULL,
    autorius VARCHAR(150),
    PRIMARY KEY(id)
);

INSERT INTO knyga(
    id,
    pavadinimas,
    leidimo_metai,
    ivertinimas,
    kaina,
    isbn,
    autorius
)
VALUES(
    NULL,
    'knyga1',
    2020,
    9.8,
    12.99,
    '1234567891234',
    'Autorius1'
),(
    NULL,
    'knyga2',
    2001,
    6.3,
    2.99,
    '1234567891235',
    'Autorius2'
),(
    NULL,
    'knyga3',
    2007,
    1.8,
    0.99,
    '1234567891236',
    'Autorius3'
);

truncate TABLE knyga;

DROP TABLE knyga

