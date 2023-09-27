<%@ page contentType="text/html;charset=utf-8"%>

<html>
	<body>
	<h1>Forward 사용법 예제</h1>
	
<!-- 페이지 이동 : fowardForm -> fowardFrom -> forwardTo1 -> forwardTo2 
   - 포워딩 : 페이지 전달
   - 포워드 액션태그가 있으면 화면에 출력 안함
   - 포워드 액션태그로 옮긴거는 최종 페이지까지 유지(forwardTo2.jsp까지)
-->
	
	<form method=post action="forwardFrom1.jsp">
	아이디 : <input type="text" name="id"><p>
	패스워드 : <INPUT TYPE="password" NAME="password"><p>
			   <input type="submit" value="보내기">
	</form>

	</body>
</html>
