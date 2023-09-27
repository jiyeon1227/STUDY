<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.net.URLEncoder" %>

<%
    Cookie[] cookies = request.getCookies();// 쿠키를 읽어와서 배열로 리턴
    if (cookies != null && cookies.length > 0) {
        for (int i = 0 ; i < cookies.length ; i++) {

        	// 쿠키삭제(삭제하는 메서드가 따로 없음. 이 방식으로 삭제)
            if (cookies[i].getName().equals("name")) {
                Cookie cookie = new Cookie("name", "");// value를 null로 설정
                cookie.setMaxAge(0);// 시간이 0초니까 발행되자마자 지워짐
                response.addCookie(cookie);// 쿠키가 발행 되자마자 null값
            }//if end

        }//for end
    }
%>

<html>
	<head><title>쿠키 삭제</title></head>
	<body>
		name 쿠키를 삭제합니다.
		삭제 되었는지 확인하라면 viewCookies.jsp 파일을 실행해서 확인
	</body>
</html>
