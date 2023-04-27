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
                        
create table employee(emp_id numeric(5) primary key,
						emp_name varchar(50),
						email varchar(50),
                        job varchar(30),
						salary numeric(10,2),
                        hiredate date);
                        
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

-- viewing all the data
select * from employee;

insert into employee values(1001,'Suraj',
						'suraj@yahoo.com','Clerk',65000,'2020-04-27');
insert into employee values(1002,'Mohit','mohit@gmail.com','Salesname',52000 , '2021-04-20');
insert into employee values(1003,'Gaurav','gaurav@yahoo.com','Analyst',55000, '2020-10-15');                        
insert into employee values(1004,'Harsh','harsh@gmail.com','Clerk',68000 ,'2019-02-10');
insert into employee values(1005,'Javed','javed@yahoo.com','Manager',85000 ,'2015-05-20');
insert into employee values(2001,'Priyanka','priyanka@yahoo.com','Analyst',75000 ,'2018-05-20');
insert into employee values(2002,'Karan','karan@yahoo.com','Analyst',72000 ,'2019-10-20');

-- find an employee by ID

select * from employee where emp_id=1002;

-- find an employee by name

-- find employees based on salary

-- find an employee with salary between 60k to 70k

select * from employee where salary>=60000 AND salary<=70000;

select * from employee where salary between 60000 and 70000;

-- show the details of the employees with employee id 1002, 1005, 1003 

select * from employee where emp_id=1001 OR emp_id=1003 OR emp_id=1005;

select * from employee where emp_id IN(1001,1005,1003);

-- Find the unique jobs available in the employee table

select distinct job from employee;

-- Find the annual salary of each employee

select emp_name,salary, salary*12 as "annual salary" from employee;



-- Ordering/Sorting data

select * from employee order by salary asc;

select * from employee order by salary desc;


-- display the employee id, name and salary

select emp_id,emp_name,salary from employee;

-- Adding 

-- Grouping Data

-- Exercises

-- Find all the salesman

-- find the analysts earning more than 60000

-- update the salary of each employee by 15%

-- increase salary of each clerk by 2000 Rs

-- add a new coulmn dept with data-type numeric(3)

-- insert data for dept coulumn for each employee.

-- (3 Depts - 10,20,30)

-- find all the employees belonging to dept 10

-- find the analysts is dept 20

-- find all the employees who are either clerk or analyst

-- sort the employees based on dept no asc and salary desc





