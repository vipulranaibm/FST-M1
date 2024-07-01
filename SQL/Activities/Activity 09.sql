-- Activity 09_01: SQL statement to know which salesman are working for which customer.

select c.customer_name, s.salesman_name from customers c INNER JOIN salesman s ON c.salesman_id= s.salesman_id

-- Activity 09_02: SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman

SELECT c.customer_name, s.salesman_name, c.grade, c.city FROM customers c 
LEFT OUTER JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<300 
ORDER BY c.customer_id;

-- Activity 09_03: SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.
SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id 
WHERE b.commission>12;

-- Activity 09_04: SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that customer and commission rate he gets for an order.

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.salesman_name AS "Salesman", c.commission FROM orders a 
INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;