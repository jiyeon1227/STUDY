<%@ page contentType="text/html;charset=utf-8"%>

<html>
	<body>
	<h2>포워딩하는 페이지: forwardFrom1.jsp</h2>

	<%
		// 한글 안깨지게 인코딩 (post 방식은 인코딩 해야함)
		request.setCharacterEncoding("utf-8");
	%>

   forwardFrom1.jsp의 내용 입니다.<br>
   화면에 절대 표시 안됩니다.

	<%	// request 객체로 공유 설정
		request.setAttribute("name","홍길동");
	%>
	
	<!-- forward 액션태그가 있으면 브라우저에 출력 안함 -->
	<jsp:forward page="forwardTo1.jsp"/>  

	</body>
</html>