<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
<title>Attribute Test Form</title>
<!-- attributeTest1_Form, attributeTest1.jsp, attributeTest2.jsp, attributeTest3.jsp
	이 네개의 파일이 한묶음-->
</head>
<body>
<h2>영역과 속성 테스트</h2>
<form action="attributeTest1.jsp" method="post">
<table border="1">
	<tr><td colspan="2">Application 영역에 저장할 내용들</td></tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<td>아이디</td>
		<td><input type="text" name="id"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="전송"></td>
	</tr>
</table>
</form>
</body>
</html>
