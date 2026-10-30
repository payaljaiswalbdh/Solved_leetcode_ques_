# Write your MySQL query statement below
select s.employee_id, s.name,count(s.employee_id) as reports_count , round(avg(e.age),0  ) as average_age 
from Employees s join Employees e
on s.employee_id = e.reports_to
group by s.employee_id, s.name
order by s.employee_id



