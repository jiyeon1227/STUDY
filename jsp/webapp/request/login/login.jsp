<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <!--  
   Q. charset=UTF-8를 해줬는데 setCharacterEncoding로 또 해주는이유?
   A. charset=UTF-8은 html 문서를 인코딩, setCharacterEncoding은 넘어온 값을 인코딩 하는거임
    -->
    
<%
	// 한글 값이 깨지지 않도록 인코딩 먼저 처리
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
%>


ID = <%=id %><br>
비밀번호 = <%=passwd %>
