# Write your MySQL query statement below
select s.name from SalesPerson s
where sales_id not in 
(Select  o.sales_id from orders o
join  Company c 
on c.com_id = o.com_id
where c.name ='RED')