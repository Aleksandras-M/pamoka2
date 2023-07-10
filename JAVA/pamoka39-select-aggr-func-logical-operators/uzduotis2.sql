CREATE TABLE filmai(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    pavadinimas VARCHAR(100) NOT NULL,
    zanras VARCHAR(50) NOT NULL,
    studija VARCHAR(50) NOT NULL,
    ziurovu_ivertinimas INT UNSIGNED NOT NULL,
    pelningumas DECIMAL(5, 2) NOT NULL,
    ekspertu_ivertinimas INT UNSIGNED NOT NULL,
    pajamos DECIMAL(4, 2) UNSIGNED,
    isleidimo_metai VARCHAR(4),
    PRIMARY KEY(id)
);