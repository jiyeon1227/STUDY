<%@ page contentType="text/html;charset=utf-8"%>

<html>
	<body>
	<h2>포워딩되는 페이지: forwardTo1.jsp</h2>

	<%
		String id = request.getParameter("id");
		String password = request.getParameter("password");
	%>

	<b><%=id%></b>님의<p>
	패스워드는 <b><%=password%></b>입니다.

	<!-- forward 액션태그가 있으면 브라우저에 출력 안함 -->
	<jsp:forward page="forwardTo2.jsp"/>  

	</body>
</html>
