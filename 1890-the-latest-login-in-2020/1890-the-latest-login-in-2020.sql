# Write your MySQL query statement below
select User_id , max(time_stamp) as last_stamp from Logins  
WHERE time_stamp >= '2020-01-01'
  AND time_stamp<'2021-01-01'
group by User_id