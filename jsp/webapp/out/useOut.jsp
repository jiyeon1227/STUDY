<%@ page contentType = "text/html; charset=utf-8" %>

<html>
<head><title>out 기본 객체 사용</title></head>
<body>

<%
    out.println("안녕하세요?<br>");// println은 줄바꿈 기능 없음 -> println랑print똑같음
    out.println("안녕하세요?");// 줄바꾸려면 (안에 <br>을 써야됨)
    System.out.println("안녕"); // 콘솔에 출력됨
%>
<br>

out 기본 객체를 사용하여 
<%
    out.println("출력한 결과입니다.");
%>

</body>
</html>