.echo on
.headers on
-- Name: accounts.sql
-- Author: Gavin
-- Date: 11/9/17

drop table if exists accounts;

create table accounts(
	AccountNumber varchar(9) primary key,
	AccountName varchar(30),
	Balance double(10,2),
	PIN varchar(4),
	Card varchar(32)
	);

insert into accounts values ('012345678', "Smith, John",       1000.00, "0000", "C89A9EAE5BD19D3DC61D2113");
insert into accounts values ('927301564', "Walker, Paul",      1000.00, "0001", "C47647261F454C144AFDFA9E");
insert into accounts values ('362739171', "Willis, Bruce",     1000.00, "0002", "4ECB6BAC4E76269C25F1ADBE");
insert into accounts values ('622739575', "Jovy, Bon",         1000.00, "0003", "4AAEC3C99FDD3D215716DC84");
insert into accounts values ('881745290', "Lee, Stan",         1000.00, "0004", "B497D5FF253AAB94F48F2D57");
insert into accounts values ('000000001', "Woodall, Allen",    1000.00, "0000", "5548F55DAC7593A6E4E76D3E");
insert into accounts values ('000000002', "McFarland, Allie",  1000.00, "0000", "E68B3828D52EDB27BBF5171B");
insert into accounts values ('000000003', "Laney, Bradley",    1000.00, "0000", "EDA7A8B4EA8D9869D2F2A258");
insert into accounts values ('000000004', "Morales, Brandon",  1000.00, "0000", "FFA578B679E5AFF4D33EC575");
insert into accounts values ('000000005', "Erdmann, Casey",    1000.00, "0000", "4975E78F974FDD48AA3684AF");
insert into accounts values ('000000006', "Pruitt, Chandler",  1000.00, "0000", "29E2FDFEA12353CE165489E6");
insert into accounts values ('000000007', "Carter, Charles",   1000.00, "0000", "296AB91CB73CADF65CE8566F");
insert into accounts values ('000000008', "Yelverton, Cory",   1000.00, "0000", "1B8F7EBD5545265F5A794EC2");
insert into accounts values ('000000009', "Wadkins, Daniel",   1000.00, "0000", "7AD381AB7BFC5A2CB8D3CA36");
insert into accounts values ('000000010', "Grant, David",      1000.00, "0000", "4D56FCEE238BD3A497988B65");
insert into accounts values ('000000011', "Moulter, Devon",    1000.00, "0000", "C871BA99722E741A3414C963");
insert into accounts values ('000000012', "Kerr, Gavin",       1000.00, "0000", "F74D4358524296C1F415CDF5");
insert into accounts values ('000000013', "Taylor, Jacob",     1000.00, "0000", "11B76834A44FAAF73E8C82E6");
insert into accounts values ('000000014', "Hick, James",       1000.00, "0000", "E1E39E296E25DA9DE7C53C7D");
insert into accounts values ('000000015', "Patel, Jay",        1000.00, "0000", "574845BF5B43F29F2BDEA294");
insert into accounts values ('000000016', "Kimbro, Johnathan", 1000.00, "0000", "DBF6C2F7597D4FE58A58563F");
insert into accounts values ('000000017', "Johnson, John",     1000.00, "0000", "85C7B4879E495FADE536551C");
insert into accounts values ('000000018', "Kim, Joseph",       1000.00, "0000", "3592F2C67A4892C66A3867DD");
insert into accounts values ('000000019', "Wright, Kristen",   1000.00, "0000", "175A6E395BFB1213A6E97BF8");
insert into accounts values ('000000020', "Horace, Olivia",    1000.00, "0000", "B1C769EBD2EEFE772CA2D56B");
insert into accounts values ('000000021', "Rivera, Richard",   1000.00, "0000", "61B481D3E9E3BB5F7EF8CF43");
insert into accounts values ('000000022', "Porter, Tristan",   1000.00, "0000", "9AB5FE6D69C64EBCFCB1D52E");
insert into accounts values ('000000023', "Smith, Tyerra",     1000.00, "0000", "FC7B8D7818FA286D46ADC9CF");
