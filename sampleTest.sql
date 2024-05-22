-- board, member, free, fileboard, qna, product, inventory, sales, basket --
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

create table member (
	id varchar(20) primary key,
    pw varchar(300) not null,
    name varchar(100) not null,
    email varchar(200) not null,
    tel varchar(100) not null,
	addr1 varchar(200),
    addr2 varchar(100),
    postcode varchar(20),
    birth date,
    point int default 1000,
    regdate timestamp default current_timestamp
);

create table free (		/*자유게시판*/
	no int auto_increment primary key,
    title varchar(200),
    content varchar(1000),
    id varchar(20),		/* 작성자 아이디 */
    name varchar(100),	/* 작성자 이름 */
    hits int default 0,		/* 방문횟수 */
    regdate timestamp default current_timestamp
);

create table qna (
	no int auto_increment primary key,
    title varchar(200),
    content varchar(1000),
    lev int default 1,
    parno int,
    hits int default 0,
    regdate timestamp default current_timestamp,
    id varchar(20),
    name varchar(100)
);

create table fileboard (
	no int auto_increment primary key,
    title varchar(200),
    content varchar(1000),
    url varchar(300),		/* 파일 이름 */
    hits int default 0,
    regdate timestamp default current_timestamp,
    author varchar(20)
);

create table product (
	pno int auto_increment primary key,
    cate varchar(20) not null,		/* 카테고리 */
    pname varchar(100) not null,
    comment varchar(1000),		/* 상품설명 */
    price int default 1000,
    img varchar(300)
);

create table inventory (		/* 재고 테이블 */
	ino int auto_increment primary key,
    pno int,		/* product의 pno에 외래키 */
    iprice int default 1000,	/* 입고 가격 */
    oprice int default 1000,	/* 출고 가격 */
    amount int default 1,	/* 출고 수량 */
    remark varchar(200),	/* 참고 사항 */
    foreign key(pno) references product(pno)
);

create table sales (	/* 출고 테이블 */
	sno int auto_increment primary key,
	pno int,	/* 상품 번호. product(pno) fk */
    amount int default 1,	/* 구매 수량 */
    tot int,	/* 총 금액 */
    id varchar(20),		/* 구매자. member의 id에 fk */
	paymethod varchar(20),	/* 지불 방법 */
    paynum varchar(30),	/* 구매 번호 */
	dno int,	/* 배송 번호 */
    addr varchar(300),
    tel varchar(100),
    delcom varchar(50),	/* 배송 사진 */
	deltel varchar(50),
    delno varchar(50),
    delstatus varchar(20),	
    st varchar(20)
);
 
alter table sales add constraint fk_mem1
	foreign key(id) references member(id);
    

    
create table basket (	/* 장바구니 */
	bno int auto_increment primary key,
    id varchar(20),		/* member의 id에 fk */
    pno int,			/* product의 pno에 fk */
    amount int,
    remark varchar(100)
);
    
alter table basket add constraint fk_mem2
	foreign key(id) references member(id);
    
alter table basket add constraint fk_pro2
	foreign key(pno) references product(pno);
    
insert into board(title, content) values ('더미글제목1', '더미글내용1');

commit;

select * from board;

show tables;