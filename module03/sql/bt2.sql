SELECT * FROM classicmodels.customers;
select productCode, productName, buyprice, quantityInStock from products
where buyprice > 56.76 and quantityInStock > 7913;
SELECT productCode,productName, buyprice, textDescription
FROM products
INNER JOIN productlines
ON products.productline = productlines.productline
WHERE buyprice > 56.76 AND buyprice < 95.59;
select productCode, productName, buyprice, quantityInStock, productVendor, productLine 
from products 
where productLine = 'Classic Cars'and productVendor = 'Min Lin Diecast';
select status from orders 
group by status