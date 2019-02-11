IF NOT EXISTS(SELECT patient_id FROM patient)
  INSERT INTO patient
  VALUES ('John', 'Smith', 'M', 'johnsmith02@gmail.com', '2018-02-14', '281-800-9765', '281-800-9765', '6.10', '210')