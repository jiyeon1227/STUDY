select * from seq;
select * from tab;
select * from CUSTOMER;
select * from member;
select * from mem02;
select * from board;

delete from CUSTOMER;
delete from board;

TRUNCATE TABLE CUSTOMER;

drop sequence customer_no_seq;
drop sequence board_seq;

-- 임시 테이블 삭제
purge recyclebin;

-- customer 테이블
-- primary key(기본키) : 반드시 중복되지 않는 값을 저장 해야한다는 의미
create table customer( no number(4) primary key, /*오라클은 숫자데이터에 no을 사용(다른 건 int사용)*/
						name varchar2(20),/*오라클은 문자데이터에 varchar2 사용(다른 건 varchar 사용)*/
						email varchar2(20),
						tel varchar2(20)  
					  );
					  
alter table customer add(address varchar2(50));
alter table customer add(reg_date timestamp);

-- 시퀀스 : no(번호)를 1부처 1씩 자동으로 증가 시켜서 처리해주는 역할
create sequence customer_no_seq -- 테이블명_컬럼명_seq
	start with 1
	increment by 1;
					  
-- member 테이블			  
create table member(name varchar2(20),
		    		gender varchar2(10),
		    		jumin1 varchar2(6),
                    jumin2 varchar2(7),
		    		address varchar2(100),
		    		buseo  varchar2(20),
                    sports varchar2(20),
                    music varchar2(20),
                    movie varchar2(20),
		    		computer varchar2(20),
		    		intro varchar2(1000)
		 			 );
		 			 
-- mem02 테이블		 			 
create  table  mem02(id  varchar2(20)  primary key,
		  		passwd  varchar2(20),
		  		name  varchar2(20),
		  		reg_date  date);

		  
		 



-- board 테이블
create table board(
	no number primary key,
	writer varchar2(20) not null,
    passwd varchar2(20) not null,
	subject varchar2(100) not null,
	content varchar2(1000) not null,
	reg_date timestamp );
	
create sequence board_seq
			start with 1
			increment by 1
			nocache; -- 번호가 점핑되는데 cache떄문임. nocache 하면 됨

			
/*
 오라클에는 Auto_Increment기능이 없어서 자동으로 인덱스 값을 증가시키는 시퀀스를 생성해야함
 * 시퀀스
 create sequence 시퀀스명 -> 보통 테이블명_컬럼명_seq 이렇게 이름 붙임
 start with n
 increment by n
 maxvalue n | nomaxvalue
 minvalue n | nominvalue
 cycle | no cycle
 cache | nocache;
 
 (생성)
create sequence dept_deptno_seq
 start with 10
 increment by 10 // 감소하는 값은 -를 사용함
 maxvalue 50
 minvalue 10
 cycle
 cache 2;
 
 (삭제)
 drop sequence dept_deptno_seq;

 시퀀스명.nextval -> 다음 값 구해옴
 시퀀스명.currval -> 시퀀스의 현재값
*/			