<%@ page contentType = "text/html; charset=utf-8" %>
<html>
<head><title>파라미터 출력</title></head>
<body>

<!-- 값이 전달되지 않았는데 toUpperCase()해서 에러발생 
	WEB_INF/web.xml 파일에 에러처리하는 코드를 넣으서 500번 오류 대신 오류처리 페이지 띄움
-->
name 파라미터 값: <%= request.getParameter("name").toUpperCase() %>

</body>
</html>
