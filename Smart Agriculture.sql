create database agriculture_db;

   create table  crops (
   id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name varchar(200),
    soil_type varchar(200),
    season varchar(100)
);

INSERT INTO crops (name, soil_type, season) VALUES
('Wheat','Loamy', 'Winter'),
('Rice','Clay','Monsoon'),
('Sugarcane','Alluvial','Summer'),
('Maize','Sandy','Kharif');


