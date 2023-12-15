-- script de Duran
CREATE DATABASE LIBRERIA;
USE LIBRERIA;


CREATE TABLE LIBRO(
ISBN INT (10) primary key,
Titulo VARCHAR (20),
nombreAutor VARCHAR (8),
Cant_libros INT (5),
Nro_paginas INT (3),
Pais VARCHAR (20),
Editorial VARCHAR (15),
F_edicion varchar(10)
);

CREATE TABLE COPIA(
ISBN INT (10),
ISBN_copia INT (10),
Estado VARCHAR (12),
PRIMARY KEY (ISBN, ISBN_copia)
);

CREATE TABLE pide(
ISBN INT (10),
ISBN_copia INT (10),
CI INT (8),
f_prestamo varchar(10),
f_devolucion varchar(10),
PRIMARY KEY (ISBN)
);

CREATE TABLE SOCIO(
CI INT (8),
Nombre VARCHAR (15),
Direccion VARCHAR (30),
Telefono INT (9),
PRIMARY KEY (CI)
);

CREATE TABLE ALUMNO(
CI INT (8),
Fecha varchar(10),
Edad INT (3),
Grupo VARCHAR (3),
PRIMARY KEY (CI),
FOREIGN KEY (CI) REFERENCES SOCIO (CI)
);

CREATE TABLE DOCENTE(
CI INT (8),
f_ing varchar(10),
Asignatura VARCHAR (15),
PRIMARY KEY (CI),
FOREIGN KEY (CI) REFERENCES SOCIO (CI)
);

SELECT *
from pide;
select * from LIBRO ;

delete from alumno
WHERE Ci=44;
delete from socio
WHERE Ci=321;
