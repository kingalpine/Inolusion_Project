IF object_id('springbootdb.dbo.country', 'U') is null
CREATE TABLE country(
                      country_id INT IDENTITY (1,1) PRIMARY KEY ,
                      country_code VARCHAR(2),
                      country VARCHAR (255),
)