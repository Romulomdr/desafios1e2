WITH recent_salaries AS (
    SELECT e.id, e.name, AVG(s.value) AS average_salary
    FROM employee e
    JOIN salary s ON e.id = s.employee_id
    WHERE s.payment_date >= NOW() - INTERVAL '3 months'
    GROUP BY e.id, e.name
)
SELECT id, name, average_salary
FROM recent_salaries
ORDER BY average_salary DESC
LIMIT 3;