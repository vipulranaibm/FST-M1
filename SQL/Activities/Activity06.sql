REM   Script: Activity06
REM   Activity 06

Create table salesman ( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
    commission int 
);

INSERT INTO SALESMAN VALUES(5001, James Hoog, New York, 15);

INSERT INTO SALESMAN VALUES(5001,James Hoog,New York,15);

INSERT INTO SALESMAN VALUES(5001,'James Hoog','New York',15);

SELECT * FROM SALESMAN;

INSERT ALL  
    INTO SALESMAN VALUES (5002,'Nail Knite','Paris',13 ) 
    INTO SALESMAN VALUES (5005, 'Pit Alex', 'London'11) 
	INTO SALESMAN VALUES (5006, 'McLyon','Paris',14) 
	INTO SALESMAN VALUES (5007, 'Paul Adam','Rom',13) 
	INTO SALESMAN VALUES (5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM Dual;

INSERT ALL  
    INTO SALESMAN VALUES (5002,'Nail Knite','Paris',13 ) 
    INTO SALESMAN VALUES (5005, 'Pit Alex', 'London',11) 
	INTO SALESMAN VALUES (5006, 'McLyon','Paris',14) 
	INTO SALESMAN VALUES (5007, 'Paul Adam','Rom',13) 
	INTO SALESMAN VALUES (5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM Dual;

Select * from SALESMAN;

Select * from SALESMAN;

Select salesman_id, salesman_city from salesman;

select * from salesman where salesman_city = 'Paris';

Seect selesman_id, commission from salesman where salesman_name = 'Paul Adam';


Select selesman_id, commission from salesman where salesman_name = 'Paul Adam';

Select salesman_id, commission from salesman where salesman_name = 'Paul Adam';

Alter table salesman add grade int;

select * from salesman;

update salesman set grade = 100;

select * from salesman;

Update salesman set grade = 200 where salesman_city = 'Rome';

select * from Salesman;

update salesman set salesman_city = 'Rome' where salesman_name = 'Paul Adam';

Update salesman set grade = 200 where salesman_city = 'Rome';

select * from Salesman;

Update salesman set grade = 300 where salesman_name = 'James Hoog';

update salesman set salesman_name = 'Pierre' where salesman_name = 'McLyon';

select * from Salesman;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select distinct salesman_id from orders;

select order_no from orders order by order date;

select order_no from orders order by order_date;

Select order_no, purchase_amount from orders order by purchase_amount desc;

Select * from orders where purchase_amount < 500;

Select * from orders where purchase_amount > 1000 and purchase_amount < 2000 ;

