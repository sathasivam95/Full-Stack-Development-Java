show databases;

use mysql;
show tables;

use hr;
show tables;
select * from employees;
 
select * from employees where first_name = "Nancy";
select * from employees where first_name like "N%";
select * from employees where department_id = 90;
select * from employees where department_id = 60 order by department_id desc; 
select * from employees where first_name like '%n' or department_id = 30;
select * from employees where department_id = 60 order by salary asc;

select * from employees where department_id = 60 order by first_name desc;

select * from employees where department_id = (select department_id from employees where first_name like 'Bruce');

# In --> for options
select * from employees where department_id in (select department_id from employees where first_name like 'David');

# Join --> displaying data from multiple tables
select employees.first_name, departments.department_name 
from employees,departments
where employees.department_id = departments.department_id;

# Alias
select e.first_name as Name, d.department_name 
from employees e,departments d
where e.department_id = d.department_id;

#Aggregate Data
# Number of people in department 60
# count, sum, average, min, max

select department_id,count(*) as counting 
from employees 
where department_id = 60
group by department_id;

select department_id,count(*) as counting 
from employees 
where department_id
group by department_id
having counting > 5;

select department_id,count(*) as counting 
from employees 
where department_id in (50,80,100,20)
group by department_id
having counting > 5
order by counting,department_id;

################################################################
select * from locations;
select * from employees;
select * from departments;

# WAQ to display each employee name with location.
SELECT employees.first_name, locations.city, locations.street_address
FROM employees, departments, locations
WHERE employees.department_id = departments.department_id #mapping
AND departments.location_id = locations.location_id;

# WAQ to display employee information who joined in 2000
select * from employees
where YEAR(hire_date) = '2000';

# WAQ to display maximum salary department wise.
select department_id, max(salary) as "Max Salary"
from employees
group by department_id;

# WAQ to display employees who joined before Bruce.
SELECT *
FROM employees
WHERE hire_date < (SELECT hire_date FROM employees WHERE first_name = 'Bruce');
					# essentially selecting bruce hire date

# WAQ to display employees who joined from June 2000 to December 2000.
SELECT * 
FROM employees
WHERE hire_date
BETWEEN '2000-06-01' AND '2000-12-31';

# WAQ to display each employee name with location
SELECT employees.first_name, locations.city, locations.street_address
FROM employees, departments, locations
WHERE employees.department_id = departments.department_id
AND departments.location_id = locations.location_id;

