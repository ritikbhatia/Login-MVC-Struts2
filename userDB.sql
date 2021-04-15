CREATE DATABASE aseProject;
USE aseProject;

CREATE TABLE users(
    id INT NOT NULL PRIMARY KEY,
    username VARCHAR(255) NOT NULL, 
    password VARCHAR(255) NOT NULL
);

INSERT INTO users(id, username, password) VALUES (1, 'ritik', 'ritik123');
INSERT INTO users(id, username, password) VALUES (2, 'bryan', 'bryan123');
INSERT INTO users(id, username, password) VALUES (3, 'winson', 'winson123');