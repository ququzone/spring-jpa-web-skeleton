/*
create user 'sjw'@'localhost' identified by 'sjw';
grant all privileges on sjw.* to 'sjw'@'localhost';
*/
DROP DATABASE IF EXISTS sjw;

CREATE DATABASE sjw CHARACTER SET utf8 COLLATE utf8_general_ci;
