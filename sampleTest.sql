
CREATE DATABASE	 starbucks;
USE starbucks;

create table board(
	bno int auto_increment primary key,
    title varchar(200),
    content varchar(1000),
    author varchar(20) default 'admin',
    vcnt int default 0,	/* 방문횟수 */
    regdate timestamp default current_timestamp
);	/* 이러면 title과 content만 입력, 나머진 default 처리 가능 */

insert into board(title, content) values ('더미글제목1', '더미글내용1');

commit;

select * from board;