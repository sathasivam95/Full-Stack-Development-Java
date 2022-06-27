DROP DATABASE IF EXISTS TrackIt;

CREATE DATABASE TrackIt;
-- Make sure we're in the correct database before we add schema.
USE TrackIt;

CREATE TABLE Project (
    ProjectId CHAR(50) PRIMARY KEY,
    `Name` VARCHAR(100) NOT NULL,
    Summary VARCHAR(2000) NULL,
    DueDate DATE NOT NULL,
    IsActive BOOL NOT NULL DEFAULT 1
);

CREATE TABLE Worker (
    WorkerId INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL
);

CREATE TABLE ProjectWorker (
    ProjectId CHAR(50) NOT NULL,
    WorkerId INT NOT NULL,
    PRIMARY KEY pk_ProjectWorker (ProjectId, WorkerId),
    FOREIGN KEY fk_ProjectWorker_Project (ProjectId)
        REFERENCES Project(ProjectId),
    FOREIGN KEY fk_ProjectWorker_Worker (WorkerId)
        REFERENCES Worker(WorkerId)
);

CREATE TABLE Task (
    TaskId INT PRIMARY KEY AUTO_INCREMENT,
    Title VARCHAR(100) NOT NULL,
    Details TEXT NULL,
    DueDate DATE NOT NULL,
    EstimatedHours DECIMAL(5, 2) NULL,
    ProjectId CHAR(50) NOT NULL,
    WorkerId INT NOT NULL,
    FOREIGN KEY fk_Task_ProjectWorker (ProjectId, WorkerId)
        REFERENCES ProjectWorker(ProjectId, WorkerId)
);

show databases;
use trackit;
show tables;

create table Sandwich (
	Sandwich_Id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	SandwichName VARCHAR(100) NOT NULL,
	Cheese CHAR(50) NULL,
	IsFried Bool NOT NULL 
);

INSERT INTO Sandwich VALUES (1,'Monte Cristo', 'Emmental', 1);
INSERT INTO Sandwich VALUES (2,'PB&J', '', 0);
INSERT INTO Sandwich VALUES (2,'PB&J', '', 0);

select * from Sandwich;
drop table Sandwich;

select * from worker;
INSERT INTO Worker (WorkerId, FirstName, LastName)
    VALUES (1, 'Rosemonde', 'Featherbie');
INSERT INTO Worker (FirstName, LastName)
    VALUES ('Kingsly', 'Besantie'); #Auto-Increments to 2
    
INSERT INTO Worker (FirstName, LastName) VALUES
    ('Goldi','Pilipets'),
    ('Dorey','Rulf'),
    ('Panchito','Ashtonhurst');
INSERT INTO Worker (WorkerId, FirstName, LastName)
    VALUES (50, 'Valentino', 'Newvill');
INSERT INTO Worker (FirstName, LastName)
    VALUES ('Violet', 'Mercado');
    
select * from project;
INSERT INTO Project (ProjectId, `Name`, DueDate)
    VALUES ('db-milestone', 'Database Material', '2018-12-31'); 
INSERT INTO ProjectWorker (ProjectId, WorkerId)
    VALUES ('db-milestone', 2);    
    
INSERT INTO Project (ProjectId, `Name`, DueDate)
	VALUES ('kitchen', 'Kitchen Remodel', '2025-07-15'); 
    
SELECT * FROM ProjectWorker;   
INSERT INTO ProjectWorker (ProjectId, WorkerId) VALUES 
    ('db-milestone', 1), -- Rosemonde, Database
    ('kitchen', 2),      -- Kingsly, Kitchen
    ('db-milestone', 3), -- Goldi, Database
    ('db-milestone', 4); -- Dorey, Database    

-- Provide a Project Summary and change the DueDate.
UPDATE Project SET
    Summary = 'All lessons and exercises for the relational database milestone.',
    DueDate = '2018-10-15'
WHERE ProjectId = 'db-milestone';

-- Change Kingsly's LastName to 'Oaks'.
UPDATE Worker SET
    LastName = 'Oaks'
WHERE WorkerId = 2;
    
UPDATE ProjectWorker SET
    WorkerID = '5'
WHERE WorkerId = 2;
SET SQL_SAFE_UPDATES = 0;
-- Deactivate active Projects from 2017.
UPDATE Project SET
    IsActive = 0
WHERE DueDate BETWEEN '2017-01-01' AND '2017-12-31'
AND IsActive = 1;

-- Enable safe updates.
SET SQL_SAFE_UPDATES = 1;

-- Do you need safe updates disabled?

-- Update all of Kingsly's Task estimates to include 25% more time.
UPDATE Task SET
    EstimatedHours = EstimatedHours * 1.25
WHERE WorkerId = 2;

DELETE FROM Worker
WHERE WorkerId = 50;

DELETE FROM Worker
where WorkerId =5;
SET SQL_SAFE_UPDATES = 0;

-- Delete Tasks first because Task references ProjectWorker.
DELETE FROM Task
WHERE WorkerId = 5;

-- Delete ProjectWorker next. 
-- That removes Kingsly from all Projects.
DELETE FROM ProjectWorker
WHERE WorkerId = 5;

-- Finally, remove Panchito.
DELETE FROM Worker
WHERE WorkerId = 5;

SET SQL_SAFE_UPDATES = 1;

SELECT * 
FROM Task;

SELECT * 
FROM ProjectWorker;

SELECT * 
FROM Worker;


