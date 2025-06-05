-- Question 1: Add a new supplier
insert into suppliers
values (30, 
		'Year Up United', 
        'Jacob Nealy', 
        'DevOps Engineer', 
        '123 RichPeep Lane',
        'Tampa',
        'FL',
        33635,
        'U.S',
        '(813) 234-4562',
        '+1',
        'www.yearup.org'
        );

-- Question 2: Add a new product provided by that supplier
insert into products
values (78,
		'Infinite Money Glitch',
        30,
        2,
        1,
        100.00,
        1,
        0,
        25,
        0
);

-- Question 3: List all products and their suppliers.
select p.ProductName, s.CompanyName
from products p
left join suppliers s on p.SupplierID = s.SupplierID;


-- Question 4: 4. Raise the price of your new product by 15%.

-- Question 5: List the products and prices of all products from that supplier.

-- Question 6: Delete the new product.

-- Question 7: Delete the new supplier.

-- Question 8: List all products

-- Question 9: List all suppliers

