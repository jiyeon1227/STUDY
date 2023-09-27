<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.net.URLEncoder" %>

<%  // 쿠키값을 URLEncoder 클래스를 이용해서 인코딩 한다.
    Cookie cookie = new Cookie("name", URLEncoder.encode("최범균"));// 한글값을 value로 쓰려면 URLEncoder.encode로 인코딩 해야함
    response.addCookie(cookie);// response.addCookie로 쿠키 발행
%>

<html>
	<head><title>쿠키생성</title></head>
	<body>

<!-- 생성자 첫번째 자리가 name값 -->
<%= cookie.getName() %> 쿠키의 값 = "<%= cookie.getValue()%>"<!-- // 디코딩을 안해서 한글이 깨져나옴 -->

	</body>
</html>