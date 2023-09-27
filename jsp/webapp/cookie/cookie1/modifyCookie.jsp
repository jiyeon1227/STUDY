<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.net.URLEncoder" %>

<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null && cookies.length > 0) {
        for (int i = 0 ; i < cookies.length ; i++) {

        	// 쿠키value값을 변경
            if (cookies[i].getName().equals("name")) {
                Cookie cookie = new Cookie("name", URLEncoder.encode("JSP프로그래밍"));
                response.addCookie(cookie);
                //cookies[i].setValue(URLEncoder.encode("자바와 JSP"));
                //response.addCookie(cookies[i]);
            }// if end

        }//for end
    }
%>

<html>
	<head><title>값 변경</title></head>
	<body>
		name 쿠키의 값을 변경합니다.
		변경이 되었는지 확인하라면 viewCookies.jsp 파일을 실행해서 확인
	</body>
</html>
