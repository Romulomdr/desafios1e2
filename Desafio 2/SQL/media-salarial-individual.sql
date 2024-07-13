SELECT e.id, e.name, AVG(s.value) AS average_salary
FROM employee e
JOIN salary s ON e.id = s.employee_id
GROUP BY e.id, e.name
ORDER BY id ASC;