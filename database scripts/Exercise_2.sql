
use hr;
show tables;
select * from employees;
describe employees;

# 1) WAQ to display number of hiring per year.
select date_format(hire_date, '%Y') as Year ,
count(employee_id) as No_of_Employees_Hired
from employees
group by date_format(hire_date, '%Y')
order by hire_date;

# 2) WAQ to display in which month MAX hiring happened?
# Main Query --> max
# Sub Query --> count #written first
# NEED TO DO AGAIN
select total.mon, max(total.num) 
from (select date_format(hire_date,'%M') as mon, count(*) as num
from employees 
group by MONTH(employees.hire_date)
order by count(*)DESC ) total ;

# 3) WAQ to display in which month MAX hiring happened in department 60?

select total.monthy,  max(total.counting), department_id
from (select date_format(hire_date, '%M') as monthy, count(*) as counting, department_id
from employees
where department_id = 60
group by month(employees.hire_date)
order by count(*) desc) total;

# 4) WAQ to display highest paid employee information in each department.
 
SELECT employees.first_name, department_id, max(salary) 
FROM employees 
GROUP BY department_id;


# 5) WAQ to calculate second highest salary.
#2 Answers
select max(salary) as Second_Highest_Salary
from employees e        #gets the second highest
where e.salary < (select max(salary) from employees);

select max(salary) as Second_Highest_Salary
from employees e        #gets the second highest
where e.salary not in (select max(salary) from employees);

# 6) WAQ to calculate second highest salary department wise

SELECT e.first_name, e.department_id, e.salary
FROM employees e
WHERE 1 = (SELECT COUNT(DISTINCT salary) 
        FROM employees b 
        WHERE b.salary > e.salary AND e.department_id = b.department_id)
group by e.department_id