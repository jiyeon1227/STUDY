<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>selProduct.jsp</title>
</head>
<%
	request.setCharacterEncoding("utf-8");
	
	// 세션으로 공유 설정
	// 세션영역 시작(세션을 닫으면 세션 끝남)
	session.setAttribute("username",request.getParameter("username"));
%>
<body>
<center>
	<H2>상품선택</H2>
	<HR>
	<%=session.getAttribute("username") %>님이 로그인 한 상태 입니다.

	${username}
	<HR>
	<form name="form1" method="POST" action="add.jsp">
		<SELECT name="product">
			<!-- value속성이 없으면 태그안에 값이 넘어감 -->
			<option>사과</option>
			<option>귤</option>
			<option>파인애플</option>
			<option>자몽</option>
			<option>레몬</option>
		</SELECT>
		<input type="submit" value="추가"/>
	</form>
	<a href="checkOut.jsp">계산</a>
</center>
</body>
</html>