-- Last updated: 7/9/2026, 9:58:45 AM
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;