IF NOT EXISTS(SELECT region_id FROM region)
  INSERT INTO region
  VALUES ('TX', 'Texas')