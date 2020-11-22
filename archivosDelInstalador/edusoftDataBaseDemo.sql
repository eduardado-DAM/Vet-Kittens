-- ejecutar con root
-- Script de creación de base de datos en SQL standard aplicación Edusoft: Vet & Kittens

Drop DATABASE IF EXISTS edusoft;
DROP TABLE IF EXISTS edusoft.Cat;
DROP TABLE IF EXISTS edusoft.Vet;
DROP TABLE IF EXISTS edusoft.Login;

CREATE DATABASE edusoft;

CREATE TABLE edusoft.Login (
	ID int UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
	UserName varchar(50) UNIQUE,
	Password varchar(50)
);



CREATE TABLE edusoft.Cat (
	ID int UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
	ChipSerial bigint UNIQUE,
	Name       varchar(50),
	Weight     double,
	DOB        date,
	VaccineA   date
);

CREATE TABLE edusoft.Vet(
	ID int UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
	LicenseNumber varchar(50),
	Password varchar(50),
	Fullname varchar(50),
	Updated date
);

ALTER TABLE edusoft.Cat
	ADD CONSTRAINT PK_Cat PRIMARY KEY (ID);
	
ALTER TABLE edusoft.Vet
	ADD CONSTRAINT PK_Vet PRIMARY KEY (ID);

ALTER TABLE edusoft.Login
	ADD CONSTRAINT PK_Login PRIMARY KEY (ID);

INSERT INTO edusoft.Login (Username,Password) 
VALUES  ('Blas','1234');
	
INSERT INTO edusoft.cat (Chipserial, Name, Weight, DOB, VaccineA) 
VALUES  ( 4523154588, 'Charles'   ,3.5, '1984-08-04', '2010-02-16'),
		( 4533333588, 'Fiodor'    ,2.5, '1984-08-04', '2012-03-25'),
		( 4522122288, 'Friedrich' ,4.5, '1984-08-04', '2014-08-20'),
		( 4511131118, 'Confucius' ,2.7, '1984-08-04', '2015-04-12'),
		( 4945454588, 'Charles'   ,3.5, '1984-08-04', '2010-02-16'),
		( 4533339588, 'Fiodor'    ,2.5, '1984-08-04', '2012-03-25'),
		( 4522222298, 'Friedrich' ,4.5, '1984-08-04', '2014-08-20'),
		( 4911111118, 'Confucius' ,2.7, '1984-08-04', '2015-04-12'),
		( 4545454588, 'Charles'   ,3.5, '1984-08-04', '2010-02-16'),
		( 4933333588, 'Fiodor'    ,2.5, '1984-08-04', '2012-03-25'),
		( 4522922288, 'Friedrich' ,4.5, '1984-08-04', '2014-08-20'),
		( 4511111198, 'Confucius' ,2.7, '1984-08-04', '2015-04-12'),
		( 4664554448, 'Michel'    ,2.8, '1984-08-04', '2016-05-10');
		
INSERT INTO edusoft.Vet (LicenseNumber, Password, Fullname, Updated)
VALUES  (666666, 1234, 'Orson Scott Card', '2020-04-22' ),
		(777777, 1234, 'Aldoux Huxley'   , '2020-05-25' ),
		(555555, 1234, 'Jose Abercrombie', '2020-06-09' ),
		(444444, 1234, 'Michael Ende'    , '2020-07-08' );