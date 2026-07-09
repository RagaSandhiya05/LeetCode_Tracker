-- Last updated: 7/9/2026, 9:58:50 AM
# Write your MySQL query statement below
SELECT p.firstName , 
p.lastname , 
a.city , 
a.state
from Person p left outer join Address a 
on p.personId = a.personId;