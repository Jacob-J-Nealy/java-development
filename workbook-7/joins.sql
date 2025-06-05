-- Question 1: List the product id, product name, unit price and category name of all
-- 				products. Order by category name and within that, by product name.
select ProductID, ProductName, UnitPrice, CategoryName
from products
inner join categories on products.CategoryID = categories.CategoryID
order by CategoryName, ProductName;

-- Question 2: List the product id, product name, unit price and supplier name of all
-- 				products that cost more than $75. Order by product name.
select ProductID, ProductName, UnitPrice, CompanyName
from products
inner join suppliers on products.SupplierID = suppliers.SupplierID
where UnitPrice > 75.00
order by ProductName;

-- Question 3: . List the product id, product name, unit price, category name, and supplier
-- 					name of every product. Order by product name.
select ProductID, ProductName, UnitPrice, CategoryName, CompanyName
from products
inner join categories on products.CategoryID = categories.CategoryID
join suppliers on suppliers.SupplierID = products.SupplierID
order by ProductName;

-- Question 4: What is the product name(s) and categories of the most expensive
-- 				products? HINT: Find the max price in a subquery and then use that in
-- 				your more complex query that joins products with categories.
select ProductName, CategoryName
from products p
inner join categories c on p.CategoryID = c.CategoryID
where p.UnitPrice = ( select max(UnitPrice)
from products
);

-- Question 5: List the order id, ship name, ship address, and shipping company name of
-- 						every order that shipped to Germany.
select OrderID, ShipName, ShipAddress, CompanyName
from orders o
join shippers s on o.ShipVia = s.ShipperID
where o.ShipCountry = "Germany";

-- Question 6: List the order id, order date, ship name, ship address of all orders that
-- 								ordered "Sasquatch Ale"? 
select OrderID, OrderDate, ShipName, ShipAddress
from orders o
join  'order details' od on o.OrderID = od.OrderID
join products p on od.ProductID = p.ProductID
where p.ProductName = "Sasquatch Ale";