SELECT Users.name as name, SUM(Transactions.amount) AS balance
FROM Users, Transactions
WHERE Users.account = Transactions.account
GROUP BY name
HAVING balance > 10000;
