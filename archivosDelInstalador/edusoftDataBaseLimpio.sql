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
	
