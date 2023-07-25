--- uzklausos 219 eilute
CREATE TABLE ingridientai (
  id INT unsigned,
  pavadinimas VARCHAR(100),
  kaina DECIMAL(10, 2) unsigned,
  kalorijos_per_100g INT unsigned,
  PRIMARY KEY (id)
);


CREATE TABLE alergenai (
  id INT,
  pavadinimas VARCHAR(255),
  PRIMARY KEY (id)
);


CREATE TABLE ingridientai_alergenai (
  ingredientas_id INT,
  alergenas_id INT,
  FOREIGN KEY (ingredientas_id) REFERENCES ingridientai(id),
  FOREIGN KEY (alergenas_id) REFERENCES alergenai(id),
  PRIMARY KEY (ingredientas_id, alergenas_id)
);


CREATE TABLE receptai (
  id INT unsigned,
  pavadinimas VARCHAR(255),
  nurodymai VARCHAR(255),
  kaina DECIMAL(10, 2) unsigned,
  kalorijos_per_100g INT unsigned,
  virtuve_id INT unsigned,
  FOREIGN KEY (virtuve_id) REFERENCES Virtuves(id),
  PRIMARY KEY (id)
);


CREATE TABLE receptai_ingridientai (
  receptas_id INT,
  ingridientas_id INT,
  FOREIGN KEY (receptas_id) REFERENCES receptai(id),
  FOREIGN KEY (ingridientas_id) REFERENCES ingridientai(id),
  PRIMARY KEY (receptas_id, ingridientas_id)
);


CREATE TABLE Virtuves (
  id INT,
  pavadinimas VARCHAR(100),
  PRIMARY KEY (id)
);


CREATE TABLE dieta (
  id INT,
  patiekalai VARCHAR(255),
  skaicius_per_diena INT,
  trukme_dienomis INT,
  PRIMARY KEY (id)
);

CREATE TABLE dieta_receptai (
  dieta_id INT,
  receptas_id INT,
  FOREIGN KEY (dieta_id) REFERENCES dieta(id),
  FOREIGN KEY (receptas_id) REFERENCES receptai(id)
);

CREATE TABLE vartotojai (
  id INT,
  login VARCHAR(255),
  password VARCHAR(255),
  PRIMARY KEY (id)
);


INSERT INTO ingridientai (id, pavadinimas, kaina, kalorijos_per_100g)
VALUES
  (1, 'Vištiena', 6.12, 166),
  (2, 'Jautienos faršas', 8.55, 39),
  (3, 'Braškės', 3.53, 309),
  (4, 'Pienas', 4.53, 243),
  (5, 'Avižiniai dribsniai', 3.59, 45),
  (6, 'Svogūnas', 2.53, 72),
  (7, 'Bulvės', 9.44, 313),
  (8, 'Grietinė', 5.93, 307),
  (9, 'Teriyaki marinatas', 3.85, 134),
  (10, 'Lęšiai', 10.21, 290),
  (11, 'Avinžirniai', 6.99, 423),
  (12, 'Petražolė', 1.57, 318),
  (13, 'Pomidoras', 8.87, 311),
  (14, 'Agurkas', 3.59, 436),
  (15, 'Couscous', 2.57, 84),
  (16, 'Duona', 0.69, 44);

INSERT INTO alergenai (id, pavadinimas)
VALUES
  (1, 'glitimas'),
  (2, 'vėžiagyviai'),
  (3, 'kiaušiniai'),
  (4, 'žuvys'),
  (5, 'žemės riešutai'),
  (6, 'sojų pupelės'),
  (7, 'pienas'),
  (8, 'riešutai'),
  (9, 'salierai'),
  (10, 'garstyčios'),
  (11, 'sezamo sėklos'),
  (12, 'sieros dioksidas'),
  (13, 'lubinai'),
  (14, 'moliuskai');


INSERT INTO ingridientai_alergenai (ingredientas_id, alergenas_id)
VALUES
  (4, 7),
  (5, 1), 
  (9, 6), 
  (15, 1), 
  (16, 1); 


INSERT INTO receptai (id, pavadinimas, nurodymai, kaina, kalorijos_per_100g, virtuve_id)
VALUES
  (1, 'Tabule couscous salotos', '1. Paruošiame couscous 2. Supjaustom daržoves ir viską suberiam į vieną.', 6.85, 564, 1),
  (2, 'Tablue lebanietiškos salotos', '1. Supjaustom daržoves ir viską suberiam į vieną.', 15.03, 831, 2),
  (3, 'Jautienos faršas su svogūnais', '1. Pakepiname faršą. 2. Pakepinam svogūną. 3. Viską į vieną', 12.97, 622, 3),
  (4, 'Kepta vištiena su svogūnu ir petražolėmis', '1. Supjaustome vištieną. 2. Pakepiname vištieną 3. Pakepiname svogūną ir petražolę. 4.Viską į vieną', 26.86, 663, 3),
  (5, 'Keptos bulvės su grietine', '1. Supjaustom bulves ir svogūną. 2. Pakepinam bulves ir svogūną. 3. Sumaišome su grietine', 19.22, 754, 3),
  (6, 'Bulvių košė', '1. Supjaustyti bulves 2. Išvirti 3. Sutrinti bulves maišant su pienu', 9.52, 352, 3),
  (7, 'Teriyaki vištiena', '1. Supjaustyti juostelėmis vištieną. 2. Užmarinuoti teriyaki padaže. 3. Iškepti', 18.76, 329, 4),
  (8, 'Lęšių ir avinžirnių sriuba', '1. Supjaustyt daržoves. 2. Virti daržoves ir lęšius. 3. Sutrinti daržoves ir lęšius. 4. Įdėti avinžirnius ir truputį pavirti. 5. Pateikti su grietine', 27.23, 1410, 5),
  (9, 'Avižinė košė', '1. Išvirti dribsnius piene', 8.12, 288, 3),
  (10, 'Mutinys', '1. Sumaišyti duoną, braškes ir pieną', 8.75, 596, 6);

INSERT INTO receptai_ingridientai (receptas_id, ingridientas_id)
VALUES
  (1, 15), 
  (1, 13), 
  (1, 14), 
  (1, 6), 
  (2, 13), 
  (2, 14), 
  (2, 12), 
  (3, 2), 
  (3, 6), 
  (4, 1), 
  (4, 6), 
  (4, 12), 
  (5, 7), 
  (5, 8), 
  (5, 6), 
  (6, 7), 
  (6, 4), 
  (7, 1), 
  (7, 9), 
  (8, 6),
  (8, 8), 
  (8, 10), 
  (8, 11), 
  (8, 12), 
  (9, 5), 
  (9, 4), 
  (10, 15),
  (10, 16), 
  (10, 4); 


INSERT INTO virtuves (id, pavadinimas)
VALUES
  (1, 'Vidurio Rytų'),
  (2, 'Lebanietiška'),
  (3, 'Universali'),
  (4, 'Azijiečių'),
  (5, 'Morokietiška'),
  (6, 'Lietuviška');


INSERT INTO dieta (id, patiekalai, skaicius_per_diena, trukme_dienomis)
VALUES
  (1, 'Tabule couscous salotos, Jautienos faršas su svogūnais, Keptos bulvės su grietine, Tablue lebanietiškos salotos', 2, 2),
  (2, 'Keptos bulvės su grietine, Teriyaki vištiena, Tablue lebanietiškos salotos, Tabule couscous salotos, Bulvių košė, Lęšių ir avinžirnių sriuba, Bulvių košė, Jautienos faršas su svogūnais', 2, 4),
  (3, 'Tabule couscous salotos, Jautienos faršas su svogūnais, Teriyaki vištiena, Avižinė košė, Tabule couscous salotos, Kepta vištiena su svogūnu ir petražolėmis, Keptos bulvės su grietine, Mutinys, Teriyaki vištiena', 3, 3);


INSERT INTO dieta_receptai (dieta_id, receptas_id)
VALUES
  (1, 1),
  (1, 3),
  (1, 5),
  (1, 2),
  (2, 5),
  (2, 7),
  (2, 2),
  (2, 1),
  (2, 6),
  (2, 8),
  (2, 6),
  (2, 3),
  (3, 1),
  (3, 3),
  (3, 7),
  (3, 9),
  (3, 1),
  (3, 4),
  (3, 5),
  (3, 10),
  (3, 7);


INSERT INTO vartotojai (id, login, password)
VALUES
  (1, 'user123', 'psw123'),
  (2, 'bananas5', 'kivis27');



-- uzklausos

--Paprastos ir agregatinių funkcijų (count, sum, avg, max, min) užduotys:
SELECT kaina
FROM Ingredients;

select pavadinimas, kalorijos_per_100g
from ingridientai
where kalorijos_per_100g < 90;

select pavadinimas, kaina
from ingridientai
where kaina > 2.2 AND kaina < 5.8;

select *
from ingridientai
where id >=6 AND id <= 10;

SELECT MAX(kaina)
FROM ingridientai;

SELECT id, pavadinimas
FROM receptai;

SELECT AVG(kaina)
FROM receptai;

SELECT SUM(kaina)
FROM receptai;

SELECT id, pavadinimas
FROM receptai
WHERE id > 3 AND id < 8 AND kalorijos_per_100g > 500;

SELECT pavadinimas, nurodymai
FROM receptai
WHERE kaina < 10 AND kalorijos_per_100g < 500;

SELECT AVG(kalorijos_per_100g)
FROM receptai
WHERE id > 1 AND id < 5;

SELECT id, pavadinimas
FROM receptai
WHERE kaina = (SELECT MAX(kaina) FROM receptai);

SELECT pavadinimas, nurodymai
FROM receptai
WHERE kalorijos_per_100g = (SELECT MAX(kalorijos_per_100g) FROM receptai);

SELECT kaina
FROM receptai
ORDER BY kaina DESC
LIMIT 3;

SELECT id, pavadinimas
FROM receptai
ORDER BY kaina
LIMIT 5;

--SELECT užduotys su JOIN:

SELECT i.id, i.pavadinimas
FROM ingridientai i
JOIN receptai_ingridientai ri ON i.id = ri.ingridientas_id
WHERE ri.receptas_id = 1;

SELECT i.kaina, i.kalorijos_per_100g
FROM ingridientai i
JOIN receptai_ingridientai ri ON i.id = ri.ingridientas_id
WHERE ri.receptas_id = 2;

select SUM(i.kaina)
from ingridientai i
join receptai_ingridientai ri on i.id = ri.ingridientas_id
where ri.receptas_id = 3;
 

SELECT a.id, a.pavadinimas
FROM alergenai a
JOIN ingridientai_alergenai ia ON a.id = ia.alergenas_id
JOIN ingridientai i ON i.id = ia.ingredientas_id
JOIN receptai_ingridientai ri ON i.id = ri.ingridientas_id
WHERE ri.receptas_id = 4;

SELECT distinct a.*
FROM alergenai a
JOIN ingridientai_alergenai ia ON a.id = ia.alergenas_id
JOIN ingridientai i ON i.id = ia.ingredientas_id
JOIN receptai_ingridientai ri ON i.id = ri.ingridientas_id
JOIN receptai r ON r.id = ri.receptas_id
WHERE i.kaina < 7.20;

SELECT DISTINCT i.*
FROM ingridientai i
JOIN receptai_ingridientai ri ON i.id = ri.ingridientas_id
WHERE ri.receptas_id IN (1, 2, 3);

SELECT r.id, r.pavadinimas, r.nurodymai
FROM receptai r
JOIN virtuves v ON r.virtuve_id = v.id
WHERE v.pavadinimas = 'Universali';

SELECT a.id, a.pavadinimas
FROM alergenai a
JOIN ingridientai_alergenai ia ON a.id = ia.alergenas_id
JOIN ingridientai i ON i.id = ia.ingredientas_id
WHERE i.id = 9
ORDER BY a.pavadinimas ASC;

SELECT id, pavadinimas
FROM alergenai
WHERE pavadinimas LIKE 's%';

SELECT id
FROM alergenai
WHERE pavadinimas LIKE '%ai';

SELECT r.*
FROM receptai r
JOIN virtuves v ON r.virtuve_id = v.id
WHERE v.pavadinimas IN ('Lietuviška', 'Morokietiška', 'Vidurio Rytų');

SELECT r.kaina, r.kalorijos_per_100g
FROM receptai r
JOIN receptai_ingridientai ri ON r.id = ri.receptas_id
JOIN ingridientai i ON i.id = ri.ingridientas_id
WHERE i.id = 1;

SELECT r.*
FROM receptai r
JOIN receptai_ingridientai ri ON r.id = ri.receptas_id
JOIN ingridientai i ON i.id = ri.ingridientas_id
JOIN ingridientai_alergenai ia ON i.id = ia.ingredientas_id
JOIN alergenai a ON a.id = ia.alergenas_id
WHERE a.pavadinimas = 'glitimas';

SELECT COUNT(*) 
FROM ingridientai i
JOIN ingridientai_alergenai ia ON i.id = ia.ingredientas_id
JOIN alergenai a ON a.id = ia.alergenas_id
WHERE a.pavadinimas = 'glitimas';

SELECT count(*)
from receptai r
join receptai_ingridientai ri on r.id = ri.receptas_id
where r.id = 2;

SELECT r.*
FROM receptai r
JOIN receptai_ingridientai ri ON r.id = ri.receptas_id
GROUP BY r.id
ORDER BY COUNT(ri.ingridientas_id) DESC
LIMIT 1;
