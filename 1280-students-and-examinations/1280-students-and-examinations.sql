# Write your MySQL query statement below
Select st.student_id ,
 st.student_name ,
sub.subject_name,
count(e.student_id) as attended_exams 
from Students st  cross join  Subjects sub 
left join Examinations e 
on st.student_id = e.student_id 
and sub.subject_name=e.subject_name
group by sub.subject_name,st.student_name,st.student_id
ORDER BY st.student_id, sub.subject_name


