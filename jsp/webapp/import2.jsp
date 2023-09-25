<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.util.*" %>

<% 
	// 3. Calendar 클래스
	Calendar c = Calendar.getInstance();// Calendar클래스는 new 연산자 사용불가 -> getInstance()로 구해와야함
	
	int y = c.get(Calendar.YEAR);// 연도
	int m = c.get(Calendar.MONTH)+1;// 월 -> 0~11 까지 구해지기 때문에 +1을 해야함
	int d = c.get(Calendar.DATE);// 일
	
	int h1 = c.get(Calendar.HOUR);// 12시간
	int h2 = c.get(Calendar.HOUR_OF_DAY);// 24시간
	
	String h ="";
	if(c.get(Calendar.AM_PM) == 0){ // AM-PM : 0 (오전)
		h = "오전";					// AM-PM : 1 (오후)
	}else{
		h = "오후";
	}
	
	int mm = c.get(Calendar.MINUTE); // 분
	int s = c.get(Calendar.SECOND); // 초
	int week = c.get(Calendar.DAY_OF_WEEK); // 요일(1~7)
	
	// 요일 숫자를 문자로 변환 (오늘날짜 찍어보기)
	System.out.print("week"+week); // 콘솔에 출력
	// 일(1),월(2),화(3),수(4),목(5),금(6),토(7)
	String[] weekend = {"일","월","화","수","목","금","토"};
%>

<!-- 12시간제 -->
<%=y %>-<%=m %>-<%=d %> <%=h %><%=h1 %>:<%=mm %>:<%=s %>
<%=weekend[week-1] %><br>

<!-- 24시간제 -->
<%=y %>-<%=m %>-<%=d %> <%=h2 %>:<%=mm %>:<%=s %>
<%=weekend[week-1] %><br>