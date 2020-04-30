SELECT id,
    MAX(CASE WHEN month = 'Jan' then revenue ELSE null END) as Jan_Revenue,
    MAX(CASE WHEN month = 'Feb' then revenue ELSE null END) as Feb_Revenue,
    MAX(CASE WHEN month = 'Mar' then revenue ELSE null END) as Mar_Revenue,
    MAX(CASE WHEN month = 'Apr' then revenue ELSE null END) as Apr_Revenue,
    MAX(CASE WHEN month = 'May' then revenue ELSE null END) as May_Revenue,
    MAX(CASE WHEN month = 'Jun' then revenue ELSE null END) as Jun_Revenue,
    MAX(CASE WHEN month = 'Jul' then revenue ELSE null END) as Jul_Revenue,
    MAX(CASE WHEN month = 'Aug' then revenue ELSE null END) as Aug_Revenue,
    MAX(CASE WHEN month = 'Sep' then revenue ELSE null END) as Sep_Revenue,
    MAX(CASE WHEN month = 'Oct' then revenue ELSE null END) as Oct_Revenue,
    MAX(CASE WHEN month = 'Nov' then revenue ELSE null END) as Nov_Revenue,
    MAX(CASE WHEN month = 'Dec' then revenue ELSE null END) as Dec_Revenue
FROM Department
GROUP BY id
