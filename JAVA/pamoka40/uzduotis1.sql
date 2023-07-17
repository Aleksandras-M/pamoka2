create table fakultetai(
	fakultetas varchar(25) not null,
    fakulteto_telefonas varchar(6),
    primary key (fakultetas)
)ENGINE = INNODB;

CREATE TABLE studentai(
    studento_id INT UNSIGNED UNIQUE AUTO_INCREMENT not null,
    studento_vardas VARCHAR(100),
    PRIMARY KEY(studento_id)
) ENGINE = innodb;

create table kursai(
	kurso_id varchar(5) not null,
    kurso_pav varchar(50) NOT null,
    fakultetas varchar(25) not null,
    primary KEY (kurso_id),
    foreign KEY (fakultetas) REFERENCES fakultetai(fakultetas)
)ENGINE = innodb;

CREATE TABLE studentai_kursai(
    studento_id INT UNSIGNED UNIQUE NOT NULL,
    kurso_id VARCHAR(5) not NULL,
    sunkumas VARCHAR(1) not NULL
    PRIMARY KEY(studento_id),
    foreign KEY (studento_id) REFERENCES studentai(studento_id),
    foreign KEY (kurso_id) REFERENCES kursai(kurso_id)
) ENGINE = INNODB;


INSERT INTO studentai(studento_id, studento_vardas)
VALUES(1, 'Adams'),(2, 'Jones'),(3, 'Smith'),(4, 'Baker');

INSERT INTO fakultetai(fakultetas,fakulteto_telefonas) VALUES('Howser',60192),('Langley',45869);

INSERT INTO kursai(kurso_id,kurso_pav,fakultetas) VALUES
 ('IS318','Database','Howser')
,('IS301','Progra','Langley');
