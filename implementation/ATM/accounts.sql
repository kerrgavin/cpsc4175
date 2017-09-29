.echo on
.headers on
-- Name: accounts.sql
-- Author: Gavin
-- Date: 8/24/17

drop table if exists accounts;

create table accounts(
	AccountNumber varchar(9) primary key,
	AccountName varchar(30),
	Balance double(10,2),
	PIN varchar(4),
	Card varchar(32)
	);

insert into accounts values ('012345678', "Smith, John", 1000.00, "0000", "C89A9EAE5BD19D3DC61D2113");
insert into accounts values ('927301564', "Walker, Paul", 10000.00, "0001", "C47647261F454C144AFDFA9E");
insert into accounts values ('362739171', "Willis, Bruce", 100000.00, "0002", "4ECB6BAC4E76269C25F1ADBE");
insert into accounts values ('622739575', "Jovy, Bon", 100000.00, "0003", "4AAEC3C99FDD3D215716DC84");
insert into accounts values ('881745290', "Lee, Stan", 1000000.00, "0004", "B497D5FF253AAB94F48F2D57");

