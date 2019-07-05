create database simplelogin;
use simplelogin;

CREATE  TABLE users (
  username VARCHAR(100) NOT NULL ,
  address varchar(300),
  phone varchar(100),
  email varchar(100)not null,
  birthday varchar(100),
  password VARCHAR(100) NOT NULL ,
  enabled TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (email)
);

CREATE TABLE user_roles (
  user_role_id int(11) NOT NULL AUTO_INCREMENT,
  email varchar(100) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE KEY uni_username_role (role,email),
  KEY fk_username_idx (email),
  CONSTRAINT fk_username FOREIGN KEY (email) REFERENCES users (email)
  );
  
  INSERT INTO `simplelogin`.`users` (`username`, `email`, `password`) VALUES ('admin123', 'admin@admin', '{noop}admin123');
  INSERT INTO `simplelogin`.`user_roles` (`email`, `role`) VALUES ('admin@admin', 'ROLE_ADMIN');