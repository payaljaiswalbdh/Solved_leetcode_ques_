# Write your MySQL query statement below
Select author_id as id from Views v 
where author_id = viewer_id
group by viewer_id  
having count(viewer_id )>=1
order by id 

