<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page errorPage = "/error/viewErrorMessage.jsp" %>
<html>
<head><title>파라미터 출력</title></head>
<body>

<!-- readParameter2.jsp 에서는 값이 전달되지 않았는데 toUpperCase()해서 에러발생함
	에러처리한 파일이 이 파일
 -->
name 파라미터 값: <%= request.getParameter("name").toUpperCase() %>

</body>
</html>
