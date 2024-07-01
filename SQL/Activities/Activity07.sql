-- Create salesman table
CREATE TABLE salesman (
    salesman_id int,
    salesman_name varchar2(32),
    salesman_city varchar2(32),
    commission int
);

-- Insert one row
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

-- Insert multiple rows at once
INSERT ALL
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

-- View data from all columns
SELECT * FROM salesman;


-- Activity 07_1: find the total purchase amount of all orders.

Select sum(purchase_amount) from orders;

-- Activity 07_2: find the average purchase amount of all orders.

Select avg(purchase_amount) from orders;

-- Activity 07_03: get the maximum purchase amount of all the orders.

Select max(purchase_amount) from orders;

-- Activity 07_04: get the minimum purchase amount of all the orders.

Select min(purchase_amount) from orders;

-- Select 07_05: find the number of salesmen listed in the table.

Select count(salesman_id) from orders;