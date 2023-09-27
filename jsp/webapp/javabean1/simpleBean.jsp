<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import = "javaBean.SimpleBean"%> <!-- 직접 임포트 해줘야함 -->

<!-- 한글값 안깨지게 인코딩 (form을 통해서 값을 길때는 post -> 인코딩 주의 !!)-->
<% request.setCharacterEncoding("utf-8");%>

<!-- getParameter로 값을 안받음 
	 javabean 이랑 연동할 때 쓰는 액션태그 -> useBean : 객체생성
-->
<%// javabean이 하는 역할을 java코드로 작성
	SimpleBean sb1 = new SimpleBean();
//	sb1.msg ="hi";// 오류발생 -> msg접근제어자가 private 이기 때문
	sb1.setMsg("안녕"); // 이렇게 setter로 전달해야함 
%>

<!-- 자바빈 객체를 생성하는 역할 -> 객체를 생성하는 거라서 한 번만 해도됨 -->
<jsp:useBean id="sb" class="javaBean.SimpleBean" /> <!-- 자동임포트 -->
<%-- <jsp:useBean id="sb" class="javaBean.SimpleBean" /> 이 하는 역할을 자바코드로 적으면
	 SimpleBean sb = new SimpleBean(); 이거임 근데 이렇게 하면 직접 임포트 해야함
	 useBean액션태그에서 클래스값을 지정하면 내부적으로 자동임포트됨 --%>

<!-- 자바빈 클래스의 setter메서드를 호출해서 값을 heap메모리에 저장시켜주는 역할 -->
<jsp:setProperty name="sb" property="msg" />
<!-- name="sb"은 useBean의 id="sb"값과 동일해야함.
값을 설정하려는걸 property="msg" 이 자리에 써줌.
input에서 name값이랑 property에 있는 필드명이랑 똑같아야함 이름값이 다르면 값 전달 안됨
-->
<jsp:setProperty name="sb" property="name"/>

<!-- setProperty을 한번에 처리하는 방법 -> property를 * 로 설정하면 전부 다 가져옴-->
<jsp:setProperty property="*" name="sb"/>


<html>
	<body>

	<h1>간단한 자바빈 프로그래밍</h1>
	<br>
	<!-- 자바빈 클래스의 getter메서드를 호출해서 리턴된 필드(프로퍼티)를 브라우저에 출력해주는 역할 -->
	이름 출력 1번방법: <jsp:getProperty property="name" name="sb"/><br>
	이름 출력 2번방법: <%=sb.getName() %><br>
	메시지 출력 1번방법: <jsp:getProperty name="sb" property="msg" /><br>
	메시지 출력 2번방법: <%=sb.getMsg()%><br>
	
	<%=sb1.getMsg()%>
	
	<!-- getProperty방식은 jsp에서만 사용이 가능하기 때문에 확장자가 jsp파일만 사용가능함.
		 DAO파일에서도 사용가능한건 2번 출력방법임 (나중에 많이 사용)-->

	</body>
</html>