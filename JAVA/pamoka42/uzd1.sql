create table klientai (
    id int unsigned not null auto_increment,
    pavadinimas varchar(100) not null,
    valstija varchar(5) not null,
    primary key(id)
) engine = innodb;

create table produktai (
    id int unsigned not null auto_increment,
    pavadinimas varchar(50) not null,
    kaina decimal(10,2) unsigned not null,
    primary key(id)
) engine = innodb;

create table uzsakymai (
    id int unsigned not null auto_increment,
    data date not null,
    kliento_id int unsigned not null,
    primary key(id),
    foreign key(kliento_id) references klientai(id)
) engine = innodb;

create table uzsakymo_produktai (
    id int unsigned not null auto_increment,
    produkto_id int unsigned not null,
    uzsakymo_id int unsigned not null,
    kiekis int unsigned not null,
    primary key(id),
    foreign key(produkto_id) references produktai(id),
    foreign key(uzsakymo_id) references uzsakymai(id)
) engine = innodb;

INSERT INTO klientai(id,pavadinimas,valstija) VALUES (2,'Apex','NC');
INSERT INTO klientai(id,pavadinimas,valstija) VALUES (6,'Acme','GA');
INSERT INTO klientai(id,pavadinimas,valstija) VALUES (7,'DHL','WA');

INSERT INTO produktai(id,pavadinimas,kaina) VALUES (4,'Kėdė',200);
INSERT INTO produktai(id,pavadinimas,kaina) VALUES (5,'Stalas',325);
INSERT INTO produktai(id,pavadinimas,kaina) VALUES (7,'Valg. stalas',800);
INSERT INTO produktai(id,pavadinimas,kaina) VALUES (11,'Spinta',500);
INSERT INTO produktai(id,pavadinimas,kaina) VALUES (17,'Kėdė',179.99);
INSERT INTO produktai(id,pavadinimas,kaina) VALUES (22,'Komoda',259.99);
INSERT INTO produktai(id,pavadinimas,kaina) VALUES (26,'Lentyna',65.59);

INSERT INTO uzsakymai(id,data,kliento_id) VALUES (1006,'2023-07-10',2);
INSERT INTO uzsakymai(id,data,kliento_id) VALUES (1007,'2023-07-11',6);
INSERT INTO uzsakymai(id,data,kliento_id) VALUES (1008,'2023-07-11',2);
INSERT INTO uzsakymai(id,data,kliento_id) VALUES (1009,'2023-07-20',7);

INSERT INTO uzsakymo_produktai(id,produkto_id,uzsakymo_id,kiekis) VALUES (1,7,1006,1);
INSERT INTO uzsakymo_produktai(id,produkto_id,uzsakymo_id,kiekis) VALUES (2,5,1006,1);
INSERT INTO uzsakymo_produktai(id,produkto_id,uzsakymo_id,kiekis) VALUES (3,4,1006,5);
INSERT INTO uzsakymo_produktai(id,produkto_id,uzsakymo_id,kiekis) VALUES (4,11,1007,4);
INSERT INTO uzsakymo_produktai(id,produkto_id,uzsakymo_id,kiekis) VALUES (5,4,1007,6);
INSERT INTO uzsakymo_produktai(id,produkto_id,uzsakymo_id,kiekis) VALUES (6,4,1008,2);
INSERT INTO uzsakymo_produktai(id,produkto_id,uzsakymo_id,kiekis) VALUES (7,5,1008,1);
INSERT INTO uzsakymo_produktai(id,produkto_id,uzsakymo_id,kiekis) VALUES (8,7,1008,5);
INSERT INTO uzsakymo_produktai(id,produkto_id,uzsakymo_id,kiekis) VALUES (9,11,1008,2);
INSERT INTO uzsakymo_produktai(id,produkto_id,uzsakymo_id,kiekis) VALUES (10,22,1008,20);
INSERT INTO uzsakymo_produktai(id,produkto_id,uzsakymo_id,kiekis) VALUES (11,11,1009,3);
INSERT INTO uzsakymo_produktai(id,produkto_id,uzsakymo_id,kiekis) VALUES (12,17,1009,4);
INSERT INTO uzsakymo_produktai(id,produkto_id,uzsakymo_id,kiekis) VALUES (13,22,1009,1);

select * from uzsakymai u
join klientai k ON u.kliento_id = k.id;

select * from uzsakymai u
join klientai k ON u.kliento_id = k.id
join uzsakymo_produktai up on u.id = up.uzsakymo_id;

select * from uzsakymai u
join klientai k ON u.kliento_id = k.id
where k.pavadinimas = 'APEX';

select u.id, u.data, u.kliento_id from uzsakymai u
join klientai k ON u.kliento_id = k.id
where k.pavadinimas = 'APEX';

select p.id, p.pavadinimas, p.kaina, up.kiekis from uzsakymai u
join uzsakymo_produktai up on u.id = up.uzsakymo_id
join produktai p ON up.produkto_id = p.id
where u.id = 1006;

select p.pavadinimas, p.kaina, up.kiekis, up.kiekis * p.kaina as bendra_kaina from uzsakymai u
join uzsakymo_produktai up on u.id = up.uzsakymo_id
join produktai p ON up.produkto_id = p.id
where u.id = 1007
ORDER BY up.kiekis ASC;

SELECT p.id, p.pavadinimas, u.data from uzsakymai u
join uzsakymo_produktai up on u.id = up.uzsakymo_id
join produktai p on up.produkto_id = p.id
where u.data = '2023-07-11';

SELECT
    p.id,
    p.pavadinimas,
    p.kaina,
    up.kiekis,
    k.pavadinimas,
    u.data,
    u.id
FROM
    klientai k
JOIN uzsakymai u ON
    k.id = u.kliento_id
JOIN uzsakymo_produktai up ON
    u.id = up.uzsakymo_id
JOIN produktai p ON
    up.produkto_id = p.id
WHERE
    k.valstija = 'WA';

SELECT
    SUM(p.kaina * up.kiekis) AS bendra_kaina
FROM
    uzsakymai u
JOIN uzsakymo_produktai up ON
    u.id = up.uzsakymo_id
JOIN produktai p ON
    up.produkto_id = p.id
WHERE
    u.id = 1006;
