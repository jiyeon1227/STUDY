<%@ page contentType="text/html;charset=utf-8"%>

<html>
	<body>

	<h1>포워딩하는 페이지: forwardFrom2.jsp</h1>

	<%
		// 한글값 안깨지게 인코딩
		request.setCharacterEncoding("utf-8");

//		String name1 = "안화수";
		String bloodType = request.getParameter("bloodType") + ".jsp";
	
//		String bloodType = "a.jsp";
	%>

	<!-- 선택한 혈액형(bloodType 변수)에 따라 페이지 이동 -->
	<jsp:forward page="<%=bloodType%>"/>
	