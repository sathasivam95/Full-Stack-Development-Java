
select c.customer_id, c.customer_first_name, c.customer_last_name, avg(co.order_total) average_order_total
FROM customer c JOIN customer_order co
ON c.customer_id GROUP BY c.order_id
HAVING avg(co.order_total) >= 1000 
ORDER BY avg(co.order_total) desc;

SELECT c.customer_id, c.customer_first_name, c.customer_last_name, AVG(co.order_total) average_order_total 
FROM customer c JOIN customer_order co 
ON c.customer_id = co.customer_id 
GROUP BY c.customer_id 
WHERE AVG(co.order_total) >= 1000 
ORDER BY AVG(co.order_total) DESC;

SELECT c.customer_id, c.customer_first_name, c.customer_last_name, AVG(co.order_total) average_order_total 
FROM customer c JOIN customer_order co ON c.customer_id 
= co.order_id GROUP BY c.customer_id 
HAVING AVG(co.order_total) >= 1000 
ORDER BY AVG(co.order_total) DESC;

SELECT c.customer_id, c.customer_first_name, c.customer_last_name, AVG(co.order_total) average_order_total 
FROM customer c JOIN customer_order co ON c.customer_id 
= co.customer_id GROUP BY c.customer_id 
HAVING AVG(co.order_total) >= 1000 
ORDER BY AVG(co.order_total) DESC;
