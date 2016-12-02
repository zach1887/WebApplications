USE vendingmachineapp;

SELECT ItemsDetail.`name`, ItemsDetail.`id`, 
    COUNT(TransactionalData.transId) AS NumberofSales,
	SUM(TransactionalData.price) AS TotalSales 
    FROM TransactionalData LEFT JOIN
		ItemsDetail ON ItemsDetail.id = TransactionalData.itemId
    GROUP BY Itemsdetail.`id`;

SELECT * FROM ItemsDetail 
    FULL JOIN DeletedItems
         ON ItemsDetail.id = deleteditems.itemId;