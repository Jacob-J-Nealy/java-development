-- Question 1
SELECT COUNT(*) AS SupplierCount
FROM suppliers;

-- Question 2
SELECT SUM(Salary)
FROM employees;

-- Question 3
SELECT MIN(UnitPrice)
FROM products;

-- Question 4
SELECT AVG(UnitPrice)
FROM products;

-- Question 5
SELECT MAX(UnitPrice)
FROM products;

-- Question 6
SELECT SupplierID, COUNT(*)
FROM products
GROUP BY SupplierID;

-- Question 7
SELECT CategoryID, AVG(UnitPrice)
FROM products
GROUP BY CategoryID;

-- Question 8
SELECT SupplierID, COUNT(*) as ItemCount
FROM products
GROUP BY SupplierID
HAVING ItemCount >= 5;

-- Question 9
SELECT ProductID, ProductName, UnitPrice




