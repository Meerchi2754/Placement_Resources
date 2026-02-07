-- avg return Average value
-- For Json and DateTime
-- Use ecommerce
Select avg(user_id)  from User; 
Select * from user;
Select sum(user_id) from User;
Select min(user_name) from User;
Select count(password) from User;
Select Max(pincode) from User;
Select Min(pincode) from user;
Select user_id as id from user;
-- Select id from user;
Insert into User values(15,'Parv','Male',395809,"parv@gmail.com",9024977237,"Nadiad","parv123");
Insert into User values(155,'Ayush','Male',595809,"ayush@gmail.com",4524977237,"Nadiad","123");
Select count(*), address from user group by address;
Select min(user_id), address from user group by address;
-- Error
Select *, address from user group by address having address=''; 

Select count(*), address from user group by address having address='Surat';

Select * from user,orders,product;


-- joins
Select user_name,amount from User Inner join orders on orders.userid=user.user_id;
Select user_name,amount from User Left join orders on orders.userid=user.user_id;
Select user_name,amount from User Right join orders on orders.userid=user.user_id;
Select user_name from user full   join orders on orders.userid=user.user_id where amount>=1000;


Create Table Employee (
	emp_id int auto_increment not null,
    emp_name varchar(50) not null, 
    manager_id int not null,
    primary key(emp_id)
);
Insert into  employee Values(1,"Divyam",2);
Insert into employee values(2,"Meetraj",1);
Insert into employee values(3,"Rahul",2);
Insert into employee values(4,"Hiren",0);

Select * from employee;


SELECT e1.emp_name AS Employee_name, e2.emp_name AS manager_name 
FROM Employee e1 
LEFT JOIN Employee e2 ON e1.manager_id = e2.emp_id;


Select manager_id,count(emp_id) from Employee where manager_id=1;


SELECT
    e1.manager_id,
    COUNT(e2.emp_id) AS employee_count
FROM
    Employee e1
LEFT JOIN
    Employee e2 ON e1.manager_id = e2.emp_id
GROUP BY
    e1.manager_id;
 

-- Subquery:
Select * from product;
select avg(price) from product;
Select product_name,stock from product where stock>=(select max(stock) from product);
Select product_name,price from product where price>=(select avg(price) from product);
Select * from Employee; 

select * from employee;

alter table employee ADD salary int  not null;
alter table employee ADD depart_id int not null;


Update employee set salary=30000 where emp_id=4;

Update employee set depart_id=3 where emp_id=1;

Select depart_id, avg(salary) from Employee group by (depart_id); 


-- Correlated Query
Select emp_name, salary from Employee e1 where salary>=(select avg(salary) from employee where depart_id=e1.depart_id); 

select * from employee;
Select emp_name, salary,depart_id from Employee e1 where salary>=(select max(salary) from employee where depart_id=e1.depart_id); 


insert into employee values(5,"Zenil",4,30000,3);
Select * from orders;
Select product_name from product where exists (select product_id from orders where orders.productid=product.product_id);

-- Department_name , department_id whose salary is more than average of depart salary.

Select depart_id from employee e1 where salary>=(Select avg(salary) from employee where depart_id=e1.depart_id);

select * from employee;

Select * from Employee where depart_id=5;
Select manager_id from Employee;
Select * from Employee where  emp_id  in (Select manager_id from Employee);
Select * from Employee e where EXISTS (Select manager_id from Employee where manager_id=e.emp_id);

Select * from Employee where  emp_id  = any	 (Select manager_id from Employee);

SELECT * FROM Employee WHERE salary >= all (SELECT salary FROM Employee WHERE depart_id = 1);

SELECT * FROM Employee
WHERE salary >= ALL (SELECT salary FROM Employee WHERE depart_id = 3);

Select emp_name, salary,depart_id from Employee e1 where salary>=(select max(salary) from employee where depart_id=e1.depart_id); 

SELECT * FROM Employee WHERE emp_name LIKE '%E%';