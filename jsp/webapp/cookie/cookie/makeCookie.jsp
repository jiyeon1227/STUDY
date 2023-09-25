<%@ page contentType="text/html; charset=utf-8" %>

<html>
	<head>
		<title>쿠키를 생성하는 예제</title>
	</head>

<%
   String cookieName = "id";
   Cookie cookie = new Cookie(cookieName, "totoro");// 쿠키 객체 생성 cookie는 JAVA.LANG 클래스에 있어서 import 안해도 됨
   													// id변수에 totoro 할당된것
//   cookie.setMaxAge(60*2); // 초단위로 시간 설정 -> 2분동안 유지 (시간 설정을 안하면 쿠키를 발행한 브라우저를 닫는 순간 지워짐)
   cookie.setMaxAge(30); // 30초까지 유지됨
   cookie.setValue("guardian"); // 쿠키value값을 guardian으로 변경 
   response.addCookie(cookie); // 쿠키발행 
%>

	<body>
	<h2>쿠키를 생성하는 예제</h2>
	<P>

"<%=cookieName%>" 쿠키가생성 되었습니다.<br>
		
		name값을 안넘겨 줬는데 쿠키정보로 확인 가능함<br>
		f12 -> application -> cookies에서 쿠키정보 확인 ㄱㄴㄱㄴ<br>
		<input type="button" value="쿠키의 내용확인" onclick="javascript:location.href='useCookie.jsp'">
	</P>
	</body>
</html>