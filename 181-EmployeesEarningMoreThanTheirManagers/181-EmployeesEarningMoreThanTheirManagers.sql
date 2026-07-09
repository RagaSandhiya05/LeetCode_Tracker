-- Last updated: 7/9/2026, 9:58:46 AM
# Write your MySQL query statement below
SELECT EMP.name AS Employee FROM Employee EMP , Employee MGR
WHERE EMP.managerId = MGR.id AND EMP.salary > MGR.salary