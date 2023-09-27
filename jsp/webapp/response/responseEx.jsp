<%@ page contentType="text/html;charset=utf-8"%>

<h1>Response 예제</h1>
   현재 페이지는  responseEx.jsp 페이지입니다.


<%	// JSP에서 페이지 이동 -> 따로 특징이 없음. 조용히 이동됨
	// url에 get방식으로 "?변수명" 으로 값을 전달함
     response.sendRedirect("first.jsp?name=test");
%>