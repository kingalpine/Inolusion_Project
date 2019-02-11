IF NOT EXISTS(SELECT country_id FROM country)
  INSERT INTO country
  VALUES ('US', 'United States of America')