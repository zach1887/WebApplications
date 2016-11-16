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

-- Establish any FK constraints
ALTER TABLE `TransactionalData`
	ADD CONSTRAINT `pets_fk_breedId` 
    FOREIGN KEY (`itemId`) 
    REFERENCES `ItemsDetail` 
    (`id`); 

INSERT INTO `TransactionalData`(`transId`, `itemId`, `price`)
    VALUES(1, 2, 0.70), (2, 2, 0.70), (3,1, 0.80), (4,4,0.25);