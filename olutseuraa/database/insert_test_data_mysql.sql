-- MUISTA! console encoding latin1

INSERT INTO Henkilo
	(etunimi, sukunimi, sahkoposti)
VALUES
	('Matti', 'Meik�l�inen', 'mattimeikalainen@roskaposti.fi'),
	('Mikko', 'Mallikas', 'mikkomallikas@roskaposti.fi'),
	('Outi', 'Opiskelija', 'outi69@roskaposti.fi'),
	('Tiina', 'Tikolainen', 'touhutiina@roskaposti.fi');
	
INSERT INTO Tapahtuma
	(nimi, pvm, aika, paikka, teema, osallistujat, isanta, kuvaus)
VALUES
	('Korjaussarja', '22.9.2016', '13:00', 'Nurkka', 'IT', 0, 'Joonas Heikkinen', 'Sill� se l�htee mill� se on tulluki');
