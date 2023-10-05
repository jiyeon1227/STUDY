<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="register.LogonDBBean" %>  
<%@ page import="register.LogonDataBean" %>  
<%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>회원 목록</title>
</head>
<body>
<a href="registerForm.jsp">회원가입</a>


<table align=center width=1000 border=1>
	<tr><td>ID</td> 
		<td>비밀번호</td>
		<td> 이름 </td>
		<td> 주민번호 </td>
		<td> 이메일 </td>
		<td> BLOG </td>
		<td> 가입일 </td>
		<td>수정</td>
		<td>삭제</td>
	</tr>

<%
LogonDBBean manager = LogonDBBean.getInstance(); // DAO 클래스에 정적 메서드 호출
List<LogonDataBean> li = manager.selectMember(); // 제네릭으로 DTO클래스를 작성함으로써 index형 -> object로 반환 -> 다운캐스팅하는데 앞에 자료형을 생략할 수 있음 (여기 다시 정리해서 쓰기)


	for(int i = 0; i < li.size(); i++) {
		// Object get(int index)
		// 리스트에 어떤 값이 저장되어있냐에 따라서 다운캐스팅의 자료형이 결정됨
		// 따라서 LogonDataBean데이터형태의 자료형이 들어가 있기 때문에 LogonDataBean로 다운캐스팅한것 !
		LogonDataBean db = li.get(i);// LogonDataBean db = (LogonDataBean)li.get(i); -> 제네릭으로 받았기 때문에 자료형 생략 가능
%>

	<tr><td><%=db.getId()%></td>
		<td><%=db.getPasswd()%></td>
		<td><%=db.getName()%></td>
		<td><%=db.getJumin1()%> - <%=db.getJumin2()%> </td>
		<td><%=db.getEmail()%></td>
		<td><%=db.getBlog()%></td>
		<td><%=db.getReg_date()%></td>
		<td><a href="updateForm.jsp?id=<%=db.getId()%>">수정</a></td> <!-- id값을 넘겨야 수정할 수 있음 -->
		<td><a href="deleteForm.jsp?id=<%=db.getId()%>">삭제</a></td> <!-- id값을 넘겨야 삭제할 수 있음 -->
	</tr>
<% 
	}
%>

</table>
</body>
</html>