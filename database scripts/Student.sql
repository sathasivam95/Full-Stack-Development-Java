use university;
CREATE TABLE student(
	std_id INT PRIMARY KEY not null,
    first_name VARCHAR(25),
    last_name VARCHAR(50),
    mathematics INT null,
    science INT null,
    english INT null
);
drop table student;
show tables;
INSERT INTO student (std_id, first_name, last_name, mathematics, science, english)
VALUES (1, 'Tom', 'Hanks', 80, 70, 50),
(2, 'Chris', 'Nolan', 100, 80, 100),
(3, 'Tom', 'Hiddle', 50, 60, 70),
(4, 'Rajesh', 'Kapoor', 70, 70, 43),
(5, 'Maverick', 'Mitchell', 95, 65, 45);

INSERT INTO student (std_id, first_name, last_name, mathematics, science, english)
VALUES (6, 'Roger', 'Hinks', 20, 25, 20),
(7, 'Charles', 'Luciano', 35, 50, 80),
(8, 'Leila', 'Anuja', 25, 30, 50),
(9, 'Hui', 'Haneef', 75, 75, 75),
(10, 'Robert', 'Lewandowski', 85, 85, 85);


UPDATE student SET
    first_name = 'William'
WHERE std_id = 3;

SELECT * FROM student;
SELECT avg(mathematics + science+ english)
FROM student
WHERE std_id=1;

