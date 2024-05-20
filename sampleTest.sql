
CREATE DATABASE	 pro02;
USE pro02;

create table sample (
	num int,
	title VARCHAR(50),
	regdate TIMESTAMP default CURRENT_TIMESTAMP
);

insert into sample values (1, '샘플1', default);
insert into sample values (2, '샘플2', default);
insert into sample values (3, '샘플3', default);

select * from sample;
commit;

create table store (
	storeNum int,
    storeName VARCHAR(20)
);