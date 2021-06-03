CREATE DATABASE `building`;

USE `building`;

CREATE TABLE `lift`(
	`device_sn` NVARCHAR(10),
	`localetime` NVARCHAR(10),
	`weight` DECIMAL(10,3),
	`height` DECIMAL(10,3),
	`speed` DECIMAL(10,3),
	`tilt` DECIMAL(10,3),
	`direction` INT,
	`rated_weight` DECIMAL(10,3),
	`rated_height` DECIMAL(10,3),
	`rated_speed` DECIMAL(10,3),
	`door` INT,
	`state` INT,
	`windspeed` DECIMAL(10,3)
	);

	CREATE TABLE `tower`(
	`device_sn` NVARCHAR(10),
	`localetime` NVARCHAR(10),
	`height` DECIMAL(10,3),
	`weight` DECIMAL(10,3),
	`scope` DECIMAL(10,3),
	`rotate` DECIMAL(10,3),
	`windSpeed` DECIMAL(10,3),
	`oblique` DECIMAL(10,3),
	`torque` DECIMAL(10,3),
	`cargo_boom` DECIMAL(10,3),
	`balance_arm` DECIMAL(10,3),
	`rated_weight` DECIMAL(10,3),
	`rated_height` DECIMAL(10,3),
	`rated_torque` DECIMAL(10,3),
	`state` INT
	);