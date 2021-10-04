-- Database: lunar_db

-- DROP DATABASE lunar_db;

CREATE DATABASE lunar_db
    WITH 
    OWNER = lunar_db
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Spain.1252'
    LC_CTYPE = 'Spanish_Spain.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
CREATE SCHEMA public
    AUTHORIZATION postgres;

COMMENT ON SCHEMA public
    IS 'standard public schema';

GRANT ALL ON SCHEMA public TO PUBLIC;

GRANT ALL ON SCHEMA public TO postgres;

-- Table user;
CREATE TABLE user_(
   id_user INT GENERATED ALWAYS AS IDENTITY,
   user_ VARCHAR(100) NOT NULL,
   pass VARCHAR(255) NULL,
   role_ VARCHAR(100) NOT NULL,
   console VARCHAR(50) NOT NULL,
   seat VARCHAR(50) NOT NULL,
   PRIMARY KEY(id_user)
);
-- Table mission;
CREATE TABLE mission(
   id_mission INT GENERATED ALWAYS AS IDENTITY,
   mission_name VARCHAR(100) NOT NULL,
   mission_description text NOT NULL,
   PRIMARY KEY(id_mission)
);

-- Table user_mission;
CREATE TABLE user_mission(
   id_user_mission INT GENERATED ALWAYS AS IDENTITY,
   id_user INT,
   id_mission INT,
   PRIMARY KEY(id_user_mission),
   CONSTRAINT fk_user
      FOREIGN KEY(id_user) 
	  REFERENCES user_(id_user),
   CONSTRAINT fk_mission
      FOREIGN KEY(id_mission) 
	  REFERENCES mission(id_mission)
);

-- Table group;
CREATE TABLE group_(
   id_group INT GENERATED ALWAYS AS IDENTITY,
   group_name VARCHAR(100) NOT NULL,
   group_description text NOT NULL,
   PRIMARY KEY(id_group)
);

-- Table user_group;
CREATE TABLE user_group(
   id_user_group INT GENERATED ALWAYS AS IDENTITY,
   id_user INT,
   id_group INT,
   PRIMARY KEY(id_user_group),
   CONSTRAINT fk_user
      FOREIGN KEY(id_user) 
	  REFERENCES user_(id_user),
   CONSTRAINT fk_group
      FOREIGN KEY(id_group) 
	  REFERENCES group_(id_group)
);


-- Table privacy_status;
CREATE TABLE privacy_status(
   id_privacy_status INT GENERATED ALWAYS AS IDENTITY,
   privacy_name varchar(100),
   id_group INT,
   PRIMARY KEY(id_privacy_status),
   CONSTRAINT fk_group
      FOREIGN KEY(id_group) 
	  REFERENCES group_(id_group)
);

-- Table input_info;
CREATE TABLE input_info(
   id_input_info INT GENERATED ALWAYS AS IDENTITY,
   id_user INT,
   id_privacy_status INT,
   title VARCHAR(255),
   description text,
   creation_time timestamp,
   publish_time timestamp,
   update_time timestamp,
   PRIMARY KEY(id_input_info),
   CONSTRAINT fk_user
      FOREIGN KEY(id_user) 
	  REFERENCES user_(id_user),
   CONSTRAINT fk_privacy_status
      FOREIGN KEY(id_privacy_status) 
	  REFERENCES privacy_status(id_privacy_status)
);

-- Table input_info_history;
CREATE TABLE input_info_history(
   id_input_info_history INT GENERATED ALWAYS AS IDENTITY,
   id_input_info INT,
   id_privacy_status INT,
   title VARCHAR(255),
   description text,
   update_time timestamp,
   PRIMARY KEY(id_input_info_history),
   CONSTRAINT fk_id_input_info
      FOREIGN KEY(id_input_info) 
	  REFERENCES input_info(id_input_info),
   CONSTRAINT fk_privacy_status
      FOREIGN KEY(id_privacy_status) 
	  REFERENCES privacy_status(id_privacy_status)
);

-- Table input_files;
CREATE TABLE input_files(
   id_input_files INT GENERATED ALWAYS AS IDENTITY,
   id_input_info INT,
   file_name VARCHAR(255),
   value_ text,
   type_ VARCHAR(255),
   creation_time timestamp,
   PRIMARY KEY(id_input_files),
   CONSTRAINT fk_id_input_info
      FOREIGN KEY(id_input_info) 
	  REFERENCES input_info(id_input_info)
);

--Table tag
CREATE TABLE tag(
   id_tag INT GENERATED ALWAYS AS IDENTITY,
   tag_name VARCHAR(100) NOT NULL,
   PRIMARY KEY(id_tag)
);

-- Table user_mission;
CREATE TABLE input_info_tag(
   id_input_info_tag INT GENERATED ALWAYS AS IDENTITY,
   id_input_info INT,
   id_tag INT,
   PRIMARY KEY(id_input_info_tag),
   CONSTRAINT fk_tag
      FOREIGN KEY(id_tag) 
	  REFERENCES tag(id_tag),
   CONSTRAINT fk_input_info
      FOREIGN KEY(id_input_info) 
	  REFERENCES input_info(id_input_info)
);