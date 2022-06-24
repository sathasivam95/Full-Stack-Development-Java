#JOIN Query
use hr;

# cross-join
select e.first_name, d.department_name
from employees e, departments d;

select e.first_name, d.department_name
from employees e, departments d
where e.department_id = d.department_id;

# is null and is not null
select * from employees where department_id is null;

# innner join
select e.first_name, d.department_name
from employees e inner join departments d
on e.department_id = d.department_id;

# extra record from employees table
select e.first_name, d.department_name
from employees e left outer join departments d
on e.department_id = d.department_id;

# extra record from departments table
select e.first_name, d.department_name
from employees e right outer join departments d
on e.department_id = d.department_id;

# self-join
select e.first_name as Employee, m.first_name as Managers
from employees e join employees m
on e.manager_id = m.employee_id;
