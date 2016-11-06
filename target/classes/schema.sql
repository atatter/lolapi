-- noinspection SqlNoDataSourceInspectionForFile
-- noinspection SqlDialectInspectionForFile
DROP SCHEMA public CASCADE;

CREATE SEQUENCE seq1 START WITH 1;

CREATE TABLE Customer (
  id BIGINT NOT NULL PRIMARY KEY,
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  code VARCHAR(255),
  type VARCHAR(255)
);

CREATE TABLE Phone (
  id        BIGINT       NOT NULL PRIMARY KEY,
  type      VARCHAR(255),
  value     VARCHAR(255),
  customer_id BIGINT       NOT NULL
);