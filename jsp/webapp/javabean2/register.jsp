<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@ page contentType = "text/html; charset=utf-8" %>

<%	// 한글값 안깨지게 인코딩
    request.setCharacterEncoding("utf-8");
%>

<!-- useBean 태그에서만 id를 사용해야함 (만들어진 객체 이름은 memberInfo) -->
<jsp:useBean id="memberInfo" class="member.MemberInfo" /> <!-- bean 객체생성 (자동임포트됨)-->
<jsp:setProperty name="memberInfo" property="*" />
<!-- password, registerDate는 입력하는 값이 아니기 때문에 값을 설정해줌 -->
<jsp:setProperty name="memberInfo" property="password"
                 value="<%= memberInfo.getId()%>" /> <!-- id값을 get메서드로 불러와서 value값을 password에 저장 -->
<jsp:setProperty property="registerDate" name="memberInfo"
				 value="<%= new Timestamp(System.currentTimeMillis())%>"/><!-- Timestamp객체 생성해서 날짜 정보 처리하기 -->				 

<%
	SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss FFF요일");
%>
<html>
		<head><title>가입</title></head>
		<body>

		<table width="400" border="1" cellpadding="0" cellspacing="0">
			<tr><td>아이디</td>
				<td><jsp:getProperty name="memberInfo" property="id" /></td>
				<td>암호</td>
				<td><jsp:getProperty name="memberInfo" property="password" /></td>
			</tr>
			<tr><td>이름</td>
				<td><jsp:getProperty name="memberInfo" property="name" /></td>
				<td>이메일</td>
				<td><jsp:getProperty name="memberInfo" property="email" /></td>
			</tr>
			<tr><td>주소</td>
				<td colspan="3"><jsp:getProperty name="memberInfo" property="address" /></td>
			</tr>
			<tr>
				<td>날짜1</td>
				<td colspan="3"><jsp:getProperty name="memberInfo" property="registerDate" /></td>
			</tr>
			<tr>
				<td>날짜2</td>
				<td><%=sd.format(memberInfo.getRegisterDate()) %></td>
			</tr>
		</table>

		</body>
</html>