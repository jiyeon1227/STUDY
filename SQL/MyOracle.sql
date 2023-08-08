-- 테이블 목록
select * from tab;

-- 임시 테이블 삭제
purge recyclebin;

-- 예1. primary key (기본키) : 반드시 중복되지 않는 값을 저장해야함
create table customer( no number(4)  primary key, 
				       name varchar2(20),
				       email varchar2(20),
				       tel varchar2(20)  
				       );

			
