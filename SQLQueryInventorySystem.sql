CREATE DATABASE InventorySystem
GO

USE InventorySystem
GO

CREATE TABLE Orders(
	order_id		INT		PRIMARY KEY,
	customer_id		VARCHAR(5) ,
	order_date		DATE ,
	required_date	DATE ,
	shipped_date	DATE ,
	ship_address	VARCHAR(100) ,
)

CREATE TABLE OrderDetails(
	order_id		INT	,
	product_id		VARCHAR(10) ,
	unit_price		MONEY ,
	quantity		TINYINT ,
	discount		FLOAT ,
	FOREIGN KEY (order_id) REFERENCES Orders (order_id) ,
)

SELECT * FROM Orders , OrderDetails 
WHERE Orders.order_id = OrderDetails.order_id
AND DAY(Orders.order_date) = DAY(GETDATE());
;

SELECT * FROM Orders o, OrderDetails od
WHERE o.order_id = od.order_id
AND o.customer_id=12126