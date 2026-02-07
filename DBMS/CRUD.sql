-- Create Table Product(
-- 	product_id int auto_increment,
--     product_name varchar(50) not null,
--     product_detail varchar(100),
--     stock int not null,
--     price int not null,
--     primary key(product_id)
-- );
-- Create Table User(
-- 	user_id int auto_increment,
--     user_name varchar(50) not null,
--     gender varchar(50),
--     pincode int not null,
--     email varchar(50) not null,
--     phonenumber int8,
--     address varchar(500) not null,
--     primary key(user_id)
-- );

-- Not run /Error
-- Create Table Orders(
-- 	order_id int auto_increment ,
--     userid int not null,
--     productid int not null,
--     amount int not null,
--     address varchar(500),
--     primary key (order_id),
--     foreign key (userid,address) references user(user_id,address),
--     foreign key (product_id) references product(product_id)
-- );

-- Create Table Orders(
-- 	order_id int auto_increment ,
--     userid int not null,
--     productid int not null,
--     amount int not null,
--     address varchar(500),
--     primary key (order_id),
--     foreign key (userid,address) references user(user_id,address),
--     foreign key (productid) references Product(product_id)
----  );

-- -- Error Code: 1822. Failed to add the foreign key constraint. Missing index for constraint 'orders_ibfk_2' in the referenced table 'user'
-- -- Solution: Creating Index.
-- -- The address column in the User table is not unique—it's just a regular column. Therefore, it cannot be used as a foreign key target.

-- Create Table Orders(
-- 	order_id int auto_increment ,
--     userid int not null ,
--     productid int not null,
--     amount int not null,
--     address varchar(500),
--     primary key (order_id),
--     foreign key (userid)references user(user_id),
--     foreign key (productid) references Product(product_id)
-- );
Select * from orders;
Select * from product;
	Insert into product values(1,"Tshirt","White,Colar,Cotton",100,1000);
    Insert into product values(2,"Shirt","Blue,Colar,Silk",40,2000);
    Insert into product values(3,"Tie","Blue,Strip,Cotton",40,500);
    Insert into product values(4,"Tie","Red,Plain,Cotton",40,300);
    Select * from user;
    Insert into orders values (2,1,2,4000,"Surat",2);
    Insert into orders values (3,12,2,3000,"Daman",3);
Update orders set productid=3 where order_id=3;
-- Insert into User values(0,'Meetraj','Male',395009,"meetraj556@gmail.com",9023977227,"Surat");
-- alter table User ADD password varchar(250) not null;
alter table orders ADD quantity int  not null;
-- Insert into User values(12,'Vraj','Male',395009,"vraj@gmail.com",9023977237,"Surat","vraj123");

-- Select * from User

-- Error Code: 1175. You are using safe update mode and you tried to update a table without a WHERE that uses a KEY column. 
--  To disable safe mode, toggle the option in Preferences -> SQL Editor and reconnect.
-- Update User set user_id=12 where user_name='Vraj';
