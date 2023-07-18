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
						'suraj@yahoo.com','Clerk',65000,'2020-04-27',10);
insert into employee values(1002,'Mohit','mohit@gmail.com','Salesname',52000 , '2021-04-20',20);
insert into employee values(1003,'Gaurav','gaurav@yahoo.com','Analyst',55000, '2020-10-15',10);                        
insert into employee values(1004,'Harsh','harsh@gmail.com','Clerk',68000 ,'2019-02-10',30);
insert into employee values(1005,'Javed','javed@yahoo.com','Manager',85000 ,'2015-05-20',20);
insert into employee values(2001,'Priyanka','priyanka@yahoo.com','Analyst',75000 ,'2018-05-20',30);
insert into employee values(2002,'Karan','karan@yahoo.com','Analyst',72000 ,'2019-10-20',10);

-- find an employee by ID

truncate table employee;

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

select * from employee where job = 'salesman';

-- find the analysts earning more than 60000

select * from employee where job='Analyst' and salary>60000;

-- update the salary of each employee by 15%

update employee set salary=salary*1.15;

-- increase salary of each clerk by 2000 Rs

update employee set salary =salary+2000 where job ='clerk';

-- add a new coulmn dept with data-type numeric(3)
alter table employee add dept numeric (3);
-- insert data for dept coulumn for each employee.

-- (3 Depts - 10,20,30)update employee set dept=20 where emp_id in(1002,2002);
update employee set dept=10 where emp_id in(1001,1004,2001);
update employee set dept=20 where emp_id in(1002,2002);
update employee set dept=30 where emp_id in(1003,1005);


-- find all the employees belonging to dept 10
select * from employee where dept=10;

-- find the analysts is dept 20

select * from employee where job='analyst' and dept=20;

-- find all the employees who are either clerk or analyst

select * from employee where job='clerk' or job='analyst';

-- sort the employees based on dept no asc and salary desc

select * from employee order by dept ASC ,salary DESC;

select * from employee;

-- Grouping functions --

-- sum
-- avg
-- count
-- max
-- min

select avg(salary) as 'average salary' from employee;

-- find the total employee count

select count(*) as 'total employees' from employee;

-- find the total salary in employee table

select sum(salary) as 'total salary' from employee;

-- Find total no of employees in each dept

select dept, count(*) as 'total employees' from employee group by dept;

-- Find the average salaries based on job

select job,avg(salary) as 'average salary' from employee group by job;

-- Find the max,min,avg salaries and total employee count based on job;

select job,avg(salary) as 'average salary',
					max(salary) as 'max salary', 
					min(salary) as 'min salary',
                    count(*) as 'total employees'
					from employee group by job;

-- find the average salary of dept no 20

select dept,avg(salary) as 'average sal' from employee where dept=20;

-- find the dept with more than 3 employees

select dept,count(*) as 'total employee' 
		from employee group by dept having count(*)>=3;
        
-- Date Functions

-- find the year of joining of each employee

select emp_name, extract(year from hiredate) 
				as 'joining year' from employee;
                

-- find the total experience of each employee --

select emp_name, round(datediff(curdate(),hiredate)/365,0) as 'Years' ,
		floor(mod(datediff(now(),hiredate),365)/30) as 'months'
		from employee;
        
select emp_name, 
		extract(year from now()) - 
			extract(year from hiredate)
			as 'Total Exp.' from employee order by 2 desc;

-- Wildcards (like)

-- Find all the employees using gmail mails
-- Find employees join in 2020
-- Find employees name starts with P or J
-- Find employees joined in the month of January
-- Find employees joind in the first half of the year



-- Crate a table dept with

-- dept		deptname	location
-- 10		IT			Bangalore
-- 20		Accounts	Trivandrum
-- 30	    Sales		Chennai
-- 40		Mangement	Kolkata


create table Department (dept numeric (3) , dept_name varchar (50),
location varchar (20));
show tables;
insert into department values
			(10, 'IT', 'Bangalore'), 
            (20, 'Accounts', 'Trivandrum'), 
            (30, 'Sales', 'Chennai'), 
            (40, 'Management' , 'Kolkata');
            
select * from Department;

-- Joins

-- Inner Join 
-- selects all the common data from two tables

-- find all the employees with dept details

select emp_id,emp_name,e.dept,dept_name,location 
		from employee e join Department d on 
        e.dept = d.dept;

-- Outer Join
-- Left Join

-- find all the employees with dept details


select emp_id,emp_name,d.dept,dept_name,location 
		from employee e left join department d on 
        e.dept = d.dept;



-- Right Join

select emp_id,emp_name,d.dept,dept_name,location 
		from employee e right join department d on 
        e.dept = d.dept;
-- Full Join


        
        
        
        
-- find all the employees wrking in Trivandrum
-- display the dept information along with employee count

select d.dept, d.dept_name, count(e.dept) as 'Total Emps'
				from department d left join employee e 
                on d.dept=e.dept group by d.dept;

-- find the dept with no employees

select d.dept,dept_name,location 
		from employee e right join department d on 
        e.dept = d.dept where e.emp_id is null;

-- find the dept with highest employees

select d.dept, d.dept_name, count(e.dept) as 'Total Emps'
				from department d left join employee e 
                on d.dept=e.dept group by d.dept 
                order by 3 desc LIMIT 1;

-- Aplying constraints --

-- NOT NULL
-- UNIQUE
-- PRIMARY KEY
-- FOREIGN KEY



drop table Department;

create table department(dept numeric (3) PRIMARY KEY,
						dept_name varchar (50) UNIQUE NOT NULL,
						location varchar (20));

select * from department;

-- FOREIGN KEY

alter table employee add constraint 
		fk_dept foreign key(dept) 
			references department(dept);


insert into employee values(2005,'Umesh',
						'umesh@yahoo.com','Clerk',
							65000,'2020-04-27',80);
                            

-- Sub-query
-- (Nested Query)

select dept from department where location='Trivandrum';                            

select * from employee where dept=
	(select dept from department where location='Trivandrum');
    
    

-- DCL --

-- GRANT
-- REVOKE

-- TCL --    

-- commit

set autocommit=false;

use ust_db;

select * from department;

-- savepoint
savepoint p1;

delete from department where dept=10;

-- rollback    

rollback to p1;

-- The End --


create table customer(id int, customer_name varchar(50), email varchar(50));


select * from customer;


show tables;
select * from customer_data;

update customer_data set type=NULL;

drop table customer_data;





select e.*,d.* from employee e join department d using(dept);




-- Retrieve a list of employees along with their corresponding department names

select emp_id,emp_name,dept_name from employee e join department d on e.dept=d.dept;
select emp_id,emp_name,dept_name from employee join department using(dept);
select emp_id,emp_name,dept_name from employee join department where employee.dept=department.dept;

-- Retrieve the total number of employees in each department

select dept_name,count(e.dept) as "Total Employees" from department d left join employee e on e.dept=d.dept group by dept_name;


-- Retrieve the highest salary in each department

select dept_name,max(e.salary) as "Max Employee Salary" from department d left join employee e on e.dept=d.dept group by dept_name;


-- Retrieve the average salary for employees in each department



-- Retrieve the average salary for employees in Sales department



























