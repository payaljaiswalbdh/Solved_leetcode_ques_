# Write your MySQL query statement below
WITH CTE as(
    Select num,
    LAG(num,1) over(Order by id) as prev1,
    LAG(num,2) over(Order by id) as prev2
from Logs
)
Select Distinct num  as ConsecutiveNums
from CTE 
where num=prev1 and
num=prev2

