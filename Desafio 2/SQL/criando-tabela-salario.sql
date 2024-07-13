CREATE TABLE salary (
  id SERIAL PRIMARY KEY,
  value DECIMAL(10, 0) NOT NULL,
  payment_date DATE NOT NULL,
  employee_id INT NOT NULL,
  CONSTRAINT fk_employee
    FOREIGN KEY (employee_id) 
    REFERENCES employee (id)
);
