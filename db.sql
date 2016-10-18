-- MySql
CREATE DATABASE mybatis;

USE mybatis;

CREATE TABLE users (
	id bigint PRIMARY KEY AUTO_INCREMENT,
	user_name VARCHAR(20) NOT NULL,
	city VARCHAR(30) NOT NULL
);

CREATE TABLE orders (
	id bigint PRIMARY KEY,
	create_at datetime
);