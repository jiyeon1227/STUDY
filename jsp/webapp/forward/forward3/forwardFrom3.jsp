<%@ page contentType="text/html;charset=utf-8"%>

<html>
	<body>

	<h2>포워딩하는 페이지: forwardTagFrom2.jsp</h2>

<%
	// 한글값 안깨지게 인코딩
   request.setCharacterEncoding("utf-8");

   String name = request.getParameter("name");
   String selectedColor = request.getParameter("color");
%>

<!-- 선택한 색깔에 따라 페이지 이동함 -->
<!-- 자바는 ''를 못쓰니까 쌍따옴표를 \" 이렇게 써야됨 -->
<jsp:forward page="<%=selectedColor+\".jsp\"%>"> 
    <jsp:param name="selectedColor" value="<%=selectedColor%>"/>
	<jsp:param name="name" value="<%=name%>"/>
</jsp:forward>