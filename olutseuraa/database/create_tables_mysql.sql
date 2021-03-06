CREATE TABLE Henkilo (
	id SMALLINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	etunimi VARCHAR(255) NOT NULL,
	sukunimi VARCHAR(255) NOT NULL,
	sahkoposti VARCHAR(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE Tapahtuma (
	id SMALLINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nimi VARCHAR(255) NOT NULL,
	pvm VARCHAR(255) NOT NULL,
	aika VARCHAR(255) NOT NULL,
	paikka VARCHAR(255) NOT NULL,
	teema VARCHAR(255) NOT NULL,
	osallistujat INT NOT NULL,
	isanta VARCHAR(255) NOT NULL,
	kuvaus VARCHAR(255) NOT NULL,
	maxOsallistujamaara INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tapOsallistuja (
	id SMALLINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	henkiloId SMALLINT NOT NULL,
	tapahtumaId SMALLINT NOT NULL,
	FOREIGN KEY (henkiloId) REFERENCES Henkilo(id) ON DELETE CASCADE,
	FOREIGN KEY (tapahtumaId) REFERENCES Tapahtuma(id) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE palaute (
id INT NOT NULL AUTO_INCREMENT,
nimi VARCHAR (50),
sposti VARCHAR (50),
otsikko VARCHAR (30),
palaute VARCHAR (500) NOT NULL,
luettu BOOLEAN DEFAULT false,
aikaleima TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (id)
)ENGINE=InnoDB;
