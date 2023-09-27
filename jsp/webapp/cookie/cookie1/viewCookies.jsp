<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.net.URLDecoder" %>

<html>
	<head><title>쿠키목록</title></head>
	<body>
	쿠키 목록<br>

<%
    Cookie[] cookies = request.getCookies(); // cookies클래스 배열형태로 리턴됨

    if (cookies != null && cookies.length > 0) {
        for (int i = 0 ; i < cookies.length ; i++) {
%>

			<!-- 쿠키값을 URLEncoder 클래스를 이용해서 디코딩 한다. -->
			<%= cookies[i].getName() %> = 
			<%= URLDecoder.decode(cookies[i].getValue()) %><br><!-- URLDecoder.decode로 디코딩해야 한글값이 출력됨 -->

<%
        }//for end

    } else {
%>

		쿠키가 존재하지 않습니다.
<%
    }
%>

	</body>
</html>