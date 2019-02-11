IF object_id('springbootdb.dbo.region', 'U') is null
CREATE TABLE region(
                     region_id INT PRIMARY KEY IDENTITY (1,1),
                     region_code VARCHAR(2),
                     region VARCHAR(255),
)