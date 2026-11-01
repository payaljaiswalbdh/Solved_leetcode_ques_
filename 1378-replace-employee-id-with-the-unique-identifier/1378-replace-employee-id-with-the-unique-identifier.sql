# Write your MySQL query statement below
select et.unique_id, e.name
 from  Employees e
 left join EmployeeUNI et
 on e.id= et.id
 order by et.unique_id is not null, et.unique_id 

