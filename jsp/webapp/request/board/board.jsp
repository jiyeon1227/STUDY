<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String writer = request.getParameter("writer");
	String passwd = request.getParameter("passwd");
	String subject = request.getParameter("subject");
	String content01 = request.getParameter("content");
	
	// replace("\n","<br>") : \n을 <br> 태그로 치환시킨다. (첫번째값을 두번째값으로 치환시킨다.)
	String content02 = request.getParameter("content").replace("\n","<br>");
%>

작성자 = <%=writer %><br>
비밀번호 = <%=passwd %><br>
제목 = <%=subject %><br>

사용자가 엔터를 눌렀을 때 처리 1 (간단) <br>
내용01 = <pre><%=content01 %></pre><br>

사용자가 엔터를 눌렀을 때 처리 2 (replace 메서드사용) <br>
내용02 = <%=content02 %><br>
