GO
IF NOT EXISTS (
	SELECT name
 FROM sys.databases
 WHERE name = N'Building'
)
CREATE DATABASE [Building];

GO

USE [Building];

CREATE TABLE [lift](
	[id] numeric(18,0) PRIMARY KEY IDENTITY(1,1),
	[device_sn] nvarchar(10),
	[localetime] nvarchar(10),
	[weight] decimal(10,3),
	[height] decimal(10,3),
	[speed] decimal(10,3),
	[tilt] decimal(10,3),
	[direction] int,
	[rated_weight] decimal(10,3),
	[rated_height] decimal(10,3),
	[rated_speed] decimal(10,3),
	[door] int,
	[state] int,
	[windspeed] decimal(10,3)
	);

	CREATE TABLE [tower](
	[id] numeric(18,0) PRIMARY KEY IDENTITY(1,1),
	[device_sn] nvarchar(10),
	[localetime] nvarchar(10),
	[height] decimal(10,3),
	[weight] decimal(10,3),
	[scope] decimal(10,3),
	[rotate] decimal(10,3),
	[windSpeed] decimal(10,3),
	[oblique] decimal(10,3),
	[torque] decimal(10,3),
	[cargo_boom] decimal(10,3),
	[balance_arm] decimal(10,3),
	[rated_weight] decimal(10,3),
	[rated_height] decimal(10,3),
	[rated_torque] decimal(10,3),
	[state] int
	);