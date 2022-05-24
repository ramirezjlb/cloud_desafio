-- CREATE TABLE PERSON(ID INT PRIMARY KEY, NOME VARCHAR(255));
INSERT INTO Person(id, nome) VALUES(nextval('hibernate_sequence'),'Hello');
INSERT INTO Person(id, nome) VALUES(nextval('hibernate_sequence'),'World');