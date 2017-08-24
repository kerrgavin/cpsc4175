.echo on
.headers on
-- Name: family.sql
-- Author: Gavin
-- Date: 8/24/17

drop table if exists family;

create table family(
	id int primary key,
	name text,
	role text,
	sex int
	);

insert into family values (1, "Gavin", "child", 1);

insert into family values (2, "Sean", "child", 1);

insert into family values (3, "Mary", "parent", 0);

insert into family values (4, "Casey", "child", 1);

select * from family;

select * from family where role like "child";

select * from family where sex = 1;
