<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- import -->
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp" %>
    
<%
	// 날짜, 시간 관련 클래스
	// 1. Date 클래스
//	java.util.Date d = new java.util.Date();// 이렇게 inport 할 수도 있는데 한번만 임포트 하기떄문에 이렇게 사용 X
	Date d= new Date();// SimpleDateFormat클래스로 원하는 형태로 바꿔줘야함
	
	// 현재시간을 년, 월, 일, 시, 분, 초 로 출력
	SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일");
	
	// 2. Timestamp 클래스
	//Timestamp는 sql패키지에 있는걸 많이 사용함
	Timestamp ts = new Timestamp(System.currentTimeMillis());// 기본 생성자 X -> System.currentTimeMillis()사용
	
%>

현재시간 1 : <%=d %><br>
현재시간 2 : <%=sd.format(d) %><br>
현재시간 3 : <%=ts %><br>
현재시간 4 : <%=sd.format(ts) %><br>