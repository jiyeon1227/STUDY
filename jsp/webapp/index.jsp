<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	헤이 모두들 안녕 내가 누군지 아니?
	
	<%-- JSP 5대 태그 
	1. 스크립틀릿 태그  : <% 여기에 JSP, JAVA 코드가 들어감// 변수를 만들때 사용 %> 
	2. 선언 태그 : <%! 메서드를 만들때 선언태그 안에 사용해야함(메서드를 만들때는 자바문법을 따름), 변수도 선언 가능 %>
	3. 표현식 태그 : <%= 브라우저에 출력해줌 (변수에 저장된 값 출력 등) %>
	4. 지시어 태그 
		1. 페이지 태그 <%@page 여기에 들어가는 속성들을 공부해야함 %>
		2. 포함태그 <%@include %>
		3. 사용자 정의 태그 <%@taglib %> -> model2에서 사용할 예정
	5. 액션 태그
		1. <jsp:usebean >, // java파일이랑 연동 (중요)
		2. <jsp:setProperty >, // java파일이랑 연동 (중요)
		3. <jsp:getProperty >, // java파일이랑 연동 (중요)
		4. <jsp:include >, // 다른 문서를 불러옴
		5. <jsp:forward >, // 페이지 이동
		6. <jsp:plugin >, // 잘 사용안함
	--%>
</body>
</html>