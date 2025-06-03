-- Question 1: What is the name of the table that holds the items Northwind sells?
select * from products;

-- Question 2: Write a query to list the product id, product name, and unit price of every product
select ProductID, ProductName, UnitPrice
from products;

-- Question 3: Write a query to list the product id, product name, and unit price of every product. Except this time, order then in ascending order by price.
select ProductID, ProductName, UnitPrice
from products
ORDER BY UnitPrice asc;

-- Question 4: What are the products that we carry where the unit price is $7.50 or less? 
select ProductID, ProductName, UnitPrice
from products
where UnitPrice <= 7.50;

-- Question 5
select ProductID, ProductName, UnitPrice
from products
where UnitsInStock >= 100
order by UnitPrice desc;

-- Question 6
select ProductID, ProductName, UnitPrice
from products
where UnitsInStock >= 100
order by UnitPrice desc, ProductName asc;

-- Question 7
select * 
from products
where UnitsInStock = 0 and UnitsOnOrder > 0
order by ProductName;

-- Question 9
select *
from categories;

-- Question 10
select *
from employees
where Title like "%Manager%";

-- Question 11
s

