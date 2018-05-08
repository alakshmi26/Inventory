username: manager or manager
password: manager1 or employee1

database: productinventory

CREATE TABLE `inventory` (
  `prodId` VARCHAR(25) DEFAULT NULL,
  `prodName` VARCHAR(50) NOT NULL,
  `prodDesc` VARCHAR(25) DEFAULT NULL,  
  PRIMARY KEY (`prodId`)
);