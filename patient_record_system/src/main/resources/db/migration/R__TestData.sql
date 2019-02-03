IF NOT EXISTS(SELECT patient_id FROM patient)
  INSERT INTO patient
  VALUES (1, 'John', 'Doe')