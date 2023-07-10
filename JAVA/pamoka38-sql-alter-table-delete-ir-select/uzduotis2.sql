CREATE table darbuotojas(
	id int unsigned NOT NULL AUTO_INCREMENT,
    vardas varchar(50) NOT NULL,
    pavardė varchar(50) NOT NULL,
    telefono_numeris varchar(10),
    pareigos varchar(50) NOT NULL,
    bazinė_alga decimal(10,2)  unsigned NOT NULL,
    stažas decimal(5,2) unsigned default 0 NOT NULL,
    etatas decimal(3,2) unsigned default 1 NOT NULL,
    primary key (id)
);

INSERT INTO darbuotojas(
    id,
    vardas,
    pavardė,
    telefono_numeris,
    pareigos,
    bazinė_alga,
    stažas,
    etatas
)
VALUES(
    1,
    'Vardinis',
    'Pavardinis',
    '868686868',
    'vadovas',
    2000,
    1.75,
    1
),(
    2,
    'Arvydas',
    'Arvydauskas',
    '865554545',
    'vadovas',
    2000,
    3,
    1
),(
    3,
    'Vytautas',
    'Vytautauskas',
    '868686642',
    'vairuotojas',
    1200,
    1.75,
    1
),(
    4,
    'Karolis',
    'Karolinis',
    '868686123',
    'vairuotojas',
    1200,
    0.5,
    0.25
),(
    5,
    'Mantas',
    'Mantauskas',
    '865656545',
    'sandėlio operatorius',
    800,
    1,
    1
);

SELECT
    id,
    vardas,
    pavardė,
    pareigos
FROM
    darbuotojas
WHERE
    1;

SELECT * FROM `darbuotojas` WHERE 1;

SELECT
    id,
    vardas,
    pavardė
FROM
    darbuotojas
WHERE
    bazinė_alga > 1300;

    SELECT
    *
FROM
    darbuotojas
WHERE
    vardas = 'Karolis';

SELECT
    id,
    bazinė_alga,
    stažas,
    etatas
FROM
    darbuotojas
WHERE
    stažas < 2;

UPDATE
    darbuotojas
SET
    etatas = 0.5
WHERE
    id = 3;

UPDATE
    darbuotojas
SET
    bazinė_alga = 1000
WHERE
    bazinė_alga < 1000;

DELETE
FROM
    darbuotojas
WHERE
    pavardė = 'Vytautauskas';

