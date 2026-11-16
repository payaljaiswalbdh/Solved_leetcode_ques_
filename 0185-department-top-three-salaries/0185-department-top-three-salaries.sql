# Write your MySQL query statement below
WITH RankedEmployees AS (
    SELECT 
        d.name AS Department,
        e.name AS Employee,
        e.salary AS Salary,
        DENSE_RANK() OVER (
            PARTITION BY d.id
            ORDER BY e.salary DESC
        ) AS rnk
    FROM Department d
    inner JOIN Employee e
        ON e.departmentId = d.id
)
SELECT 
    Department,
    Employee,
    Salary
FROM RankedEmployees
WHERE rnk <= 3