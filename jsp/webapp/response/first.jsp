<%@ page contentType = "text/html; charset=utf-8" %>

<%
	String str = request.getParameter("name");// name변수로 받은 값을 str에 저장
%>

name : <%=str%>