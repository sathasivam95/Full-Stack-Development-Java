create database test;
use test;

create table a (
	emp_id int
    );
    create table b (
	man_id int
    );
    
drop table a;
drop table b;

# Fatal
drop database test;
    
select * from a;
insert into a (emp_id)
values (1);
insert into a (emp_id)
values (1);
insert into a (emp_id)
values (0);
insert into a (emp_id)
values (1);
insert into a (emp_id)
values (0);

select * from b;
insert into b (man_id)
values (0);
insert into b (man_id)
values (1);
insert into b (man_id)
values (1);
insert into b (man_id)
values (0);
insert into b (man_id)
values (1);


#Inner Join
select a1.emp_id, b1.man_id
from a as a1 inner join b as b1
on a1.emp_id = b1.man_id;

#Cross Join
select a1.emp_id, b1.man_id
from a as a1 cross join b as b1
on a1.emp_id = b1.man_id;

#Left join


#Self join



