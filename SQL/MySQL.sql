show databases;
show tables;

select * from CUSTOMER;
select * from board;

drop table board;

-- customer 테이블 (회원관리)
-- primary key(기본키) : 반드시 중복되지 않는 값을 저장 해야한다는 의미
-- auto_increment : 1부터 1씩 증가
create table customer( no int(4) auto_increment primary key,
						name varchar(20),
						email varchar(20),
						tel varchar(20),
						address varchar(50),
						reg_date timestamp
					  );
					  
insert into customer(name, email, tel, address, reg_date) values ('test','test','test','test',sysdate());


-- board 테이블
create table board(
	no int auto_increment primary key,
	writer varchar(20) not null,
    passwd varchar(20) not null,
	subject varchar(100) not null,
	content varchar(1000) not null,
	reg_date timestamp 
	);
	
-- 날짜를 넣을떄는 sysdate(), now()사용 할 수 있음
insert into board(writer, passwd, subject, content, reg_date) values ('test','test','test','test',sysdate());
insert into board(writer, passwd, subject, content, reg_date) values ('test','test','test','test',now());

-- 총 데이터 갯수 구하기
select count(*) from board;

-- 전제 데이처 검색
select  * from board;

-- 전체 데이터를 내림차순 정렬
select  * from board order by no desc;

-- 최근글 5개 출력
select * from board order by no desc limit 0,5;

-- 3~5번째 데이터 추출
select * from board order by no desc limit 2, 3;