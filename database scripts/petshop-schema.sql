DROP DATABASE IF EXISTS petshop;
CREATE DATABASE petshop;
USE petshop;

CREATE TABLE pet_owner (
	owner_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    owner_first_name VARCHAR(20),
    owner_last_name VARCHAR(25),
    mailing_address VARCHAR(25),
    phone_number VARCHAR(20),
    email_address VARCHAR(25)
);

DROP TABLE IF EXISTS pet_info;
#need to do again
CREATE TABLE pet_info (
	pet_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    pet_name VARCHAR(20),
    owner_id INT NOT NULL,
    CONSTRAINT pk_pet_info
    PRIMARY KEY (pet_id),
    CONSTRAINT fk_pet_infos
    FOREIGN KEY(owner_id)
    REFERENCES pet_owner(owner_id),
    birth_date DATE,
    isVaccinated BOOL
    );