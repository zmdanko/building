CREATE DATABASE `building`;

USE `building`;

CREATE TABLE `lift`(
	`id` INT AUTO_INCREMENT,
	`device_sn` NVARCHAR(10),
	`locale_time` NVARCHAR(20),
	`weight` DECIMAL(10,6),
	`height` DECIMAL(10,6),
	`speed` DECIMAL(10,6),
	`tilt` DECIMAL(10,6),
	`direction` INT,
	`rated_weight` DECIMAL(10,6),
	`rated_height` DECIMAL(10,6),
	`rated_speed` DECIMAL(10,6),
	`door` INT,
	`state` INT,
	`wind_speed` DECIMAL(10,6),
	PRIMARY KEY(`id`)
	)DEFAULT CHARSET=utf8;

	CREATE TABLE `tower`(
	`id` INT AUTO_INCREMENT,
	`device_sn` NVARCHAR(10),
	`locale_time` NVARCHAR(20),
	`height` DECIMAL(10,6),
	`weight` DECIMAL(10,6),
	`scope` DECIMAL(10,6),
	`rotate` DECIMAL(10,6),
	`wind_speed` DECIMAL(10,6),
	`oblique` DECIMAL(10,6),
	`torque` DECIMAL(10,6),
	`cargo_boom` DECIMAL(10,6),
	`balance_arm` DECIMAL(10,6),
	`rated_weight` DECIMAL(10,6),
	`rated_height` DECIMAL(10,6),
	`rated_torque` DECIMAL(10,6),
	`state` INT,
	PRIMARY KEY(`id`)
	)DEFAULT CHARSET=utf8;