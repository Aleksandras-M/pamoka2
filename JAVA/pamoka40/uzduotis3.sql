CREATE TABLE departamento (
  departamento_id INT unsigned UNIQUE,
  departamento_pav VARCHAR(50)
);

CREATE TABLE darbuotojas (
  id int unsigned AUTO_INCREMENT,
  darbuotojo_id INT unsigned ,
  darbuotojo_vardas VARCHAR(50),
  departamento_id INT unsigned,
  primary key (id),
  FOREIGN KEY (departamento_id) REFERENCES departamento(departamento_id)
);

CREATE TABLE projektas (
  projekto_id INT unsigned UNIQUE,
  projekto_pav VARCHAR(50),
  projekto_laikas DECIMAL(10, 2),
  departamento_id INT unsigned,
  FOREIGN KEY (departamento_id) REFERENCES departamento(departamento_id)
);

CREATE TABLE darbuotojas_projektas (
  darbuotojo_id INT,
  projekto_id INT,
  FOREIGN KEY (darbuotojo_id) REFERENCES darbuotojas(darbuotojo_id),
  FOREIGN KEY (projekto_id) REFERENCES projektas(projekto_id)
);

INSERT INTO departamento (departamento_id, departamento_pav) VALUES
  (10, 'Finance'),
  (14, 'R&D');

INSERT INTO darbuotojas (darbuotojo_id, darbuotojo_vardas, departamento_id) VALUES
  (1, 'Huey', 10),
  (5, 'Dewey', 10),
  (11, 'Louie', 10),
  (2, 'Jack', 14),
  (4, 'Jill', 14),
  (26, 'Larry', 10);

INSERT INTO projektas (projekto_id, projekto_pav, projekto_laikas, departamento_id) VALUES
  (27, 'Alpha', 4.5, 10),
  (25, 'Beta', 3, 10),
  (22, 'Gamma', 7, 10),
  (26, 'Pail', 8, 14),
  (21, 'Hill', 9, 14);