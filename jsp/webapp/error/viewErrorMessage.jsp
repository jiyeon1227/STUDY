<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page isErrorPage = "true" %> <!-- true로 설정해야함(기본값은 flase로 되어있음) -->
<html>
<head><title>에러 발생</title></head>
<body>

요청 처리 과정에서 에러가 발생하였습니다.<br>
빠른 시간 내에 문제를 해결하도록 하겠습니다.

<!-- 일반유저에게 보여줄 필요가 없음 그래서 잘 사용 안함 -->
<p>
에러 타입: <%= exception.getClass().getName() %> <br>
에러 메시지: <b><%= exception.getMessage() %></b>
</body>
</html>

