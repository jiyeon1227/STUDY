<%@ page contentType="text/html; charset=utf-8" %>

<html>
	<head><title>세션 사용 예제</title>
	</head>
	<body>

<%
	String id = "guardian23";
	String passwd = "1234";

	// 서버에 세션 정보 저장됨
	session.setAttribute("id", id);// ID="guardian23"
//	session.setAttribute("id", "guardian23");// 이렇게 써도 됨
	session.setAttribute("passwd", passwd); // passwd="1234"
%>

	세션에 id 와 passwd 속성을 설정하였습니다.<br><br>

	<input type="button" value="세션의 설정된 속성확인" onclick="location.href='viewSession.jsp'">
	</body>
</html>