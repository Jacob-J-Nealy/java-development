-- Next Reinforcement

-- Deletes DataBase if already exists
drop database if exists mysterious_bookstore;

Create Database mysterious_bookstore;


-- Creating Database
use mysterious_bookstore;

-- Dropping Tables
drop table if exists Orders;
drop table if exists Customers;
drop table if exists Books;
drop table if exists Categories;
drop table if exists Authors;

create table Authors(
AuthorID varchar(10) primary key,
Name varchar(255) not null,
Country varchar(255)
);

create table Categories(
CategoryID varchar(10) primary key,
CategoryName varchar(255) not null
);

create table Books(
BookId varchar(10)     primary key,
Title varchar(255)     not null,
AuthorID varchar(10)   not null,
CategoryID varchar(10) not null,
Price decimal(10,2)    not null,
foreign key (AuthorID)   references Authors(AuthorID),
foreign key (CategoryID) references Categories(categoryID)
);

create table Customers(
CustomerID varchar(10) primary key,
Name varchar(255) not null,
Email varchar(10)
);

create table Orders(
OrderID int primary key auto_increment,
BookID varchar(10)     not null,
CustomerID varchar(10) not null,
Quantity int           not null,
OrderDate date,
foreign key (BookID)     references Books(BookID),
foreign key (CustomerID) references Customers(CustomerID)
);

insert into Authors (AuthorID, Name, Country)
values ('A01', 'John Doe', 'USA');

insert into Categories (CategoryID, CategoryName)
values('C01', 'UK');

insert into Books(BookID, Title, AuthorID, CategoryID, Price) 
values ('B101', 'Ooga Booga', 'A01', 'C01', 15.99);

insert into Orders (OrderID, BookID, CustomerID, Quantity, OrderDate)
values (1, 'B101', 'C01', 1, '2025-05-25');
