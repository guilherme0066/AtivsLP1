CREATE DATABASE timesdb;

USE timesdb;

CREATE TABLE times (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    titulos INT NOT NULL,
    alcunha VARCHAR(255) NOT NULL
);