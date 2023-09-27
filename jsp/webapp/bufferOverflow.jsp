<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page buffer="1kb" %>
<%@ page errorPage = "/error/viewErrorMessage.jsp" %>
<html>
<head><title>버퍼 플러시 이후 에러 발생 결과</title></head>
<body>
<!-- buffer 기본값은 8kb 
buffer크기가 작아서 300까지 툴력이 안됨
-->

<%  for (int i = 0 ; i < 300 ; i++) { out.println(i); }  %>

<%= 1 / 0 %>

</body>
</html>
