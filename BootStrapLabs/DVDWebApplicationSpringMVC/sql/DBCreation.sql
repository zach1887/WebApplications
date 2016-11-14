DROP DATABASE IF EXISTS DVDLibrary;
CREATE DATABASE DVDLibrary;
USE DVDLibrary;

CREATE TABLE `Dvds` (
`id` INT AUTO_INCREMENT NOT NULL,
`title` VARCHAR(50) NOT NULL, 
`rating` VARCHAR(50) NOT NULL, 
`year` INT NOT NULL,
`director` VARCHAR(50) NOT NULL, 
`studio` VARCHAR(50) NOT NULL, 
`comments` VARCHAR(100),
PRIMARY KEY(`id`)
);


INSERT INTO `Dvds` (`id`, `title`,`rating`, `year`, `director`,`studio`,`comments`)
		VALUES(1, "Before Sunrise", "R", 1995, "Richard Linklater", "Castle Rock", "Favorite Movie Ever!"),
        (2, "Casablanca", "NR", 1942, "Michael Curtiz", "Warner Brothers", "Favorite classic movie.");
 