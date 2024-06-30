REM   Script: Activity3
REM   Activity 03

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

