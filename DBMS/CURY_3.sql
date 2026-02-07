-- use ecommerce;
select * from user;
alter table user ADD status varchar(50) not null;
alter table user ADD  salary int8 not null;
Update orders set productid=3 where order_id=3;
Update user set salary=30000 where user_id=15;
Update user set status ="InActive" where user_id=155;
Update user set status ="Active" where  NOT user_id=1;
Update user set password="123" where user_id=1;

Create view Activeuser as select * from user where status='Inactive';
select * from ActiveUser;

select * from employee;
select * from user;
DROP view Nadaid_people;
Create view Nadaid_people as select * from user where address ='Nadiad';
Select * from  Nadaid_people;
Update  Nadaid_people set password="1235" where user_id=15;
SHOW FULL TABLES; 
Show FULL Tables where table_type="VIEW";

Select * from user;

-- Create Procedure 
DELIMITER //
Create procedure addnewuser(
	in id int,
    in name varchar(50), 
    in gender varchar(50),
    in pincode int8, 
    in email varchar(100),
    in phonenumber int8,
    in address varchar(250),
    in password varchar(250),
    in salary int8,
    in status varchar(50)
)
begin
	INSERT INTO USER(user_id,user_name,gender,pincode,email,phonenumber,address,password,salary,status)
    values (id,name,gender,pincode,email,phonenumber,address,password,salary,status);
END;
//
DELIMITER ;
DROP procedure addnewuser;
CALL addnewuser(2,"Divyam","Female",359825,"divyam@company.com",9023945445445,"Surendranagar","456",5000,"Inactive");

Insert Into  user values(3,"Hetvi","Female",2343343,"Hetvilp@gmail.com",123456789,"PHert","pard",324999,"Active");

SELECT * FROM USER;

DELIMITER //
	Create procedure Countgender(
	in p_gender varchar(50),
    out p_count int
)
Begin 
	Select count(*) into p_count from user where gender=p_gender;
end
//
DELIMITER ;
DROP procedure Countgender;
Call Countgender("Female",@gender);
Call Countgender("Male",@gender1);
Select @gender,@gender1;


-- User defined Functions in SQL:
DELIMITER //
CREATE function MultiplyNumber(a int8, b int8)
returns int8
deterministic 
Begin
	return a*b;
END;
// DELIMITER ;

Select MultiplyNumber(4,5) Multiply ,MultiplyNumber(-4,5) as Multiply;



DELIMITER //
	Create function getEmailDomain(userEmail varchar(100))
    Returns varchar(100)
    deterministic
    begin
		return substring_index(userEmail,'@',-1);
    end
//DELIMITER ;
DROP FUNCTION getEmailDomain;
Select email, getEmailDomain(email) as EMAILDOMAIN from user;

DELIMITER //
	Create function GetUserSatus(p_status varchar(100))
    Returns varchar(100)
    deterministic
    BEGIN
		DECLARE label varchar(50);
		SET label = CASE
		WHEN p_status ='active' then 'User is active'
		WHEN p_status ='Inactive' then 'User is Inactive'
        ELSE 'Unknown Status'
    end;
    return label;
END ;
//DELIMITER ;
Select status, GetUserSatus(status) as StatusCheck from user;




-- Triggers:

DELIMITER //
	Create trigger before_user_input
    before Insert on User
    for each row
    begin
		SET new.user_name=UPPER(new.user_name);
    end;
// DELIMITER ;

DELIMITER //
	Create trigger Updatestatus
    before Insert on User
    for each row
    begin
		IF OLD.status !=NEW.status THEN
        UPDATE into User()
        Values
    end;
// DELIMITER ;

CALL addnewuser(4,"Dhruv","Male",3459825,"angel@company.com",90423445445,"Nadiad","parv",67000,"Active");
delete from user where user_id=4;

select * from user;