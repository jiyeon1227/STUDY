<%@ page contentType = "text/html; charset=utf-8" %>
<html>
<head><title>파라미터 출력</title></head>
<body>

<!-- 값이 전달되지 않았는데 toUpperCase()해서 에러발생 -->
name 파라미터 값: <%= request.getParameter("name").toUpperCase() %>

</body>
</html>
