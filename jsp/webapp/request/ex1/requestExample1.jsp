<%@ page contentType="text/html;charset=utf-8"%>

<%	
	// 한글 인코딩
	// 1. 폼파일에서 한글값이 get방식으로 전송될 때는 tomcat이 자동으로 utf-8로 인코딩해줌
	// 2. 폼파일에서 한글값이 post방식으로 전송될 때는 tomcat이 자동으로 인코딩을 하지 않기 때문에 아래 코드로 직접 인코딩 해야함
	
	// 폼파일에서 한글값이 post방식으로 전송될때 utf-8로 인코딩을 시켜주는 역할
	request.setCharacterEncoding("utf-8");// 위치가 중요! 인코딩을 설정하고 파라미터 값을 받아야함 !! (값을 받고 인코딩하면 적용 X)
%>

<html>
<h1>Request 객체1</h1>

<%
	String name = request.getParameter("name"); // 자바문법을 따르기 때문에 ""로 감싸야함 (대소문자도 구분함)
	String studentNum = request.getParameter("studentNum");
	String gender = request.getParameter("gender");
	String major = request.getParameter("major");
%>

<body>
성명: <%=name%><p>
학번: <%=studentNum%><p>
성별 : <%=gender%><p>
전공 : <%=major%>
</body>
</html>

