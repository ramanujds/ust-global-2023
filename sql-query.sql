create database ust_db;
use ust_db;

-- How to create a table --
-- Employee -
--  emp_id : numeric(5)
--  emp_name : varchar(50) 
--  email : varchar(50)
--  salary : numeric(10,2)
 
 create table employee(emp_id numeric(5) primary key,
						emp_name varchar(50),
						email varchar(50),
						salary numeric(10,2));
                        
-- How to see all the tables in a database
show tables;

-- How to see the description of a table

desc employee;

-- How to insert data

insert into employee values(1001,'Suraj',
						'suraj@yahoo.com',65000,'2020-04-27');
                        
-- How to see the data
select * from employee;

-- altering a table
-- add a coulmn hiredate to employee table

alter table employee add hiredate date;

-- Change the data type to numeric(9,2) for salary column
alter table employee modify salary numeric(9,2);

-- add a primary key
alter table employee add primary key(emp_id);

-- delete a column
alter table employee drop salary;

-- delete the table
drop table employee;

-- clear all the data
truncate table employee;

-- How to update the hiredate
update employee set hiredate='2020-04-27' where emp_id=1001;

-- how to delete a record
delete from employee where emp_id=1001;
