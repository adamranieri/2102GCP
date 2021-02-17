
-- Tables should be named in the singular
-- The name of the table is what a single record in the table represents
-- a lot of SQL is written in all caps (optional)
create table employee(
employee_id int primary key generated always as identity, -- Primary key is constraint. This column must be unique and not null
first_name varchar(50), 
last_name varchar(50), 
salary int);

drop table employee;

select * from employee;

insert into employee (first_name,last_name,salary) values ('Tim','Jones',300000);
insert into employee (first_name,last_name,salary) values ('Mike','Smith',70000);
insert into employee (first_name,last_name,salary) values ('Anna','Johnson',500000);
insert into employee (first_name,last_name,salary) values ('Tim','Jones',300000);
insert into employee (first_name,last_name,salary) values ('John','Snow',800000);

-- any good database each record should be unqiue
-- this unique identifer for a record is called the Primary Key

-- DQL Data Query Language Any statement that starts with a select

-- select {columns that you want} from {table} where {filters what records you get}

select * from employee where first_name = 'Tim';

select last_name,salary from employee where first_name = 'Tim';

select first_name from employee where salary > 400000;

-- DML (Data Manipulation Language)
-- SQL statements that add remove or modify data in your able
insert into employee (first_name,last_name,salary) values ('John','Snow',800000); -- insertion/add

delete from employee; -- really important to have a where clause because otherwise it will delete everyting
-- the table still exists. just no records in it

delete from employee where employee_id = 7;

-- update and set to modify data
update employee set last_name = 'stark' where employee_id = 10;

-- be careful of the where clause
update employee set last_name = 'stark';






