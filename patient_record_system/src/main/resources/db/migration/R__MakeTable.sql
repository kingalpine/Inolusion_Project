IF object_id('springbootdb.dbo.patient', 'U') is null
  CREATE TABLE patient(
  patient_id INT PRIMARY KEY,
  first_name VARCHAR(255),
  last_name VARCHAR(255),
)
