--Set search_path = 'testdb';
DROP TABLE IF EXISTS cities;
CREATE TABLE cities(id serial PRIMARY KEY, name VARCHAR(255), population integer);
DROP TABLE IF EXISTS slist;
CREATE TABLE slist(id serial PRIMARY KEY, name VARCHAR(255), amount integer, cost numeric(7,2));