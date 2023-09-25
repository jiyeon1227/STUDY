<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginform.html 에서 값 받기</title>
</head>
<body>

ID :<%=request.getParameter("id") %><br>
pass :<%=request.getParameter("pass") %>
 
</body>
</html>