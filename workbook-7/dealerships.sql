-- The Car Dealership Database

-- Delete Database (If Exists)
	DROP Database if exists CarDealerships;

-- Create Database
	Create Database CarDealerships;

-- Use Database
	use CarDealerships;

-- Delete Existing Tables (If Exists)
	drop table if exists Vehicles;
	drop table if exists Inventory;
	drop table if exists Sales_Contracts;
	drop table if exists Lease_Contracts;
	drop table if exists dealerships;

-- Create Table of Dealerships
	create table dealerships(
-- Dealership Primary Key
	dealership_id int primary key auto_increment not null,
    
-- Other Columns
	Name    varchar(50)   not null,
	Address varchar(50)   not null,
	Phone   varchar(50)   not null);

--  Create Table of Vehicles
	create table Vehicles(
-- Vehicles Primary Keys
VIN         varchar(17) primary key, -- 17 Because VIN Numbers cannot be over 17 digits

-- Other Columns
Make        varchar(50) not null,
Model       varchar(50) not null,
Year        int         not null,
Sold        boolean     not null,
Color       varchar(50) not null,
vehicleType varchar(50),
odometer    int         not null,
Price       double      not null);

-- Create Table of Inventory
	create table Inventory(
dealership_id int not null,
VIN varchar(17),

-- Inventory Foreign Keys
foreign key (dealership_id) references dealerships(dealership_id),
foreign key (VIN)           references Vehicles(VIN));

-- Create Table of Sales Contract
create table Sales_Contract(
-- Sales Contract Primary Key
	contract_id int primary key auto_increment not null,
	VIN varchar(17) not null,
	sales_date date not null,
	price decimal(10,2) not null,

-- Sales Con tract Foreign Keys
	foreign key (VIN) references Vehicles(VIN)
);

create table Lease_Contract(
	contract_id int primary key auto_increment not null,
    VIN varchar(17) not null,
    lease_start date not null,
    lease_end date not null,
    monthly_payment decimal(10,2),
    
    foreign key (VIN) references Vehicles(VIN)
);
