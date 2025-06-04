-- Question 1: What is the product name(s) of the most expensive products? HINT: Find
-- 		the max price in a subquery and then use that value to find products whose
-- 		price equals that value.products
select ProductName, UnitPrice
from products
where UnitPrice = (select max(UnitPrice)
					from products);

-- Question 2: What is the order id, shipping name and shipping address of all orders
-- 		shipped via "Federal Shipping"? HINT: Find the shipper id of "Federal
-- 		Shipping" in a subquery and then use that value to find the orders that
-- 		used that shipper.

select ShipName, ShipAddress
from orders
where ShipperID in (select ShipperID
					from shippers
                    where description like "%3%");
                    


-- Question 3: What are the order ids of the orders that ordered "Sasquatch Ale"? HINT:
-- 		Find the product id of "Sasquatch Ale" in a subquery and then use that
-- 		value to find the matching orders from the `order details` table. Because
-- 		the `order details` table has a space in its name, you will need to surround
-- 		it with back ticks in the FROM clause.

-- Question 4: What is the name of the employee that sold order 10266?

-- Question 5: What is the name of the customer that bought order 10266?