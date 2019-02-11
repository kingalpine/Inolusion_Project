IF object_id('springbootdb.dbo.patient', 'U') is null
CREATE TABLE patient(
                      patient_id INT IDENTITY (1,1) PRIMARY KEY,
                      patient_fname VARCHAR(255),
                      patient_lname VARCHAR(255) NOT NULL ,
                      sex CHAR,
                      patient_email VARCHAR(255),
                      patient_dob DATE,
                      patient_hphone VARCHAR(255),
                      patient_mphone VARCHAR(255),
                      height DECIMAL,
                      weight DECIMAL,
)
