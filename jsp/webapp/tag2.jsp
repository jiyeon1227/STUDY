<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%-- [<%@page %> : page 지시어 태그]
<%@page contentType -> 브라우저에 출력할 때 UTF-8로 인코딩해서 출력 %> -> 자동으로 만들어줌(어떤 의미인지만 알기)
<%@page import -> import함 %>
<%@page errorPage -> 에러처리(자바로 치면 예외처리같은거) %>
<%@page isErrorPage -> 에러처리(자바로 치면 예외처리같은거) %>
 --%>
    
<!-- 선언 태그 : 메서드 선언 -->
<!-- jsp에서 메서드는 반드시 선언태그 안에서 생성해야한다.(변수사용할 수 있음) -->
<%! 
	int a=30;// 변수사용가능
	
	public int add(int a, int b){
	int c = a+b;
	return c;
	}

	public int subtract(int a, int b){
		int c = a-b;
		return c;
	}
	
	public int multiply(int a, int b){
		int c = a* b;
		return c;
	}
%>

<%
	int result1 = add(3,9); // add메서드 호출
	int result2 = subtract(3,9);// subtract메서드 호출
	int result3 = multiply(10,25);// multiply메서드 호출
%>

3+9=<%=result1 %><br>
3-9=<%=result2 %><br>
10*25=<%=result3 %><br>
10*25=<%=multiply(10,25) %> <!-- 메서드를 바로 호출 해서 출력 할 수 있음 -->