SELECT
    c.CategoryName,
    SUM(p.Quantity) AS TotalQuantity
FROM Category c
JOIN Products p ON c.CategoryID = p.CategoryID
WHERE c.Status = 1
GROUP BY c.CategoryID