Create schema IF NOT EXISTS ToDoListDB;
use ToDoListDB;
DROP TABLE if EXISTS things_To_Do;
DROP TABLE if EXISTS Users;

CREATE TABLE things_To_Do(
    tID int NOT NULL AUTO_INCREMENT,
    tTitle VARCHAR (255) NOT NULL,
    tDesc VARCHAR (255) NOT NULL,
    tComplete BOOLEAN NOT NULL,
    PRIMARY KEY (tID)
);

INSERT INTO things_To_Do VALUES (1, 'I need to do this 1', 'This is a description of what I have to do 1', False),
                                (2, 'I need to do this 2', 'This is a description of what I have to do 2', False),
                                (3, 'I need to do this 3', 'This is a description of what I have to do 3', False),
                                (4, 'I need to do this 4', 'This is a description of what I have to do 4', False);

