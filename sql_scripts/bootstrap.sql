

CREATE DATABASE IF NOT EXISTS tempo_pal;

USE tempo_pal;

CREATE TABLE users (
   user_id INT PRIMARY KEY AUTO_INCREMENT,
   user_email VARCHAR(40),
   user_api_key VARCHAR(64)
);

CREATE TABLE projects (
      project_id INT PRIMARY KEY AUTO_INCREMENT,
      project_name VARCHAR(30),
      user_id INT,
      FOREIGN KEY(user_id) REFERENCES users(user_id)
);

CREATE TABLE tags (
      tag_id INT PRIMARY KEY AUTO_INCREMENT,
      tag_name VARCHAR(50),
      user_id INT,
      FOREIGN KEY(user_id) REFERENCES users(user_id)
);

CREATE TABLE entries (
     entry_id INT PRIMARY KEY AUTO_INCREMENT,
     entry_description VARCHAR (50),
     entry_elapsed_time INT,
     user_id INT,
     project_id INT,
     tag_id INT,
     FOREIGN KEY(user_id) REFERENCES users(user_id),
     FOREIGN KEY(project_id) REFERENCES projects(project_id),
     FOREIGN KEY(tag_id) REFERENCES tags(tag_id)
);