DROP DATABASE IF EXISTS VendingMachineApp;
CREATE DATABASE VendingMachineApp;
USE VendingMachineApp;

CREATE TABLE `ItemsDetail` (
`id` INT AUTO_INCREMENT NOT NULL,
`name` VARCHAR(50) NOT NULL, 
`price` float4 NOT NULL, 
`qty` INT NOT NULL,
PRIMARY KEY(`id`)
);

INSERT INTO `ItemsDetail` (`id`,`name`,`price`,`qty`)
     VALUES(1, "Snickers", 0.80, 34), (2, "Three Musketeers", 0.70, 18), (3, "Skittles",0.75, 19),
           (4, "Certs", 0.25, 77), (5, "Lay's", 1.25, 10);

CREATE TABLE `TransactionalData` (
`transId` INT AUTO_INCREMENT NOT NULL, 
`itemId` INT NOT NULL,
`price` FLOAT4,
PRIMARY KEY(`transId`)
);


CREATE TABLE `EditHistory` (
`editId` INT AUTO_INCREMENT NOT NULL, 
`itemId` INT NOT NULL,
`oldName` VARCHAR(50),
`newName` VARCHAR(50),
`oldPrice` FLOAT4,
`newPrice` FLOAT4,
`oldQty` INT,
`newQty` INT,
PRIMARY KEY(`editId`)
);

CREATE TABLE `DeletedItems` ( 
`itemId` INT NOT NULL,
`finalName` VARCHAR(50),
`finalPrice` FLOAT4,
`finalQty` INT,
PRIMARY KEY(`itemId`)
);

CREATE TABLE `RestockHistory` (
`itemId` INT NOT NULL,
`addedQty` INT,
PRIMARY KEY(`itemId`)
);
