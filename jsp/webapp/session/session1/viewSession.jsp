<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %>

<html>
	<head><title>세션 사용 예제</title></head>
	<body>


<%--
<%
	// session의 name값을 모르는 경우
	// 열거형 : attr = "id","psswd"
	Enumeration attr = session.getAttributeNames();// session.getAttributeNames으로 세션name값을 가져옴(이 방식은 많이 사용안함)

	while(	attr.hasMoreElements()	){
		String attrName = (String)attr.nextElement();// id의 name값을 구해옴. nextElement는 object로 돌려주기때문에 다운캐스팅을 해야함 
		String attrValue = (String)session.getAttribute(attrName);// getAttribute는 object로 돌려주기때문에 다운캐스팅을 해야함
		out.println("세션의 속성명은 " + attrName + " 이고 ");
		out.println("세션의 속성값은 " + attrValue + "이다.<br><br>");
	}
%>
 --%>


<!-- session의 name값을 알고있는 경우(이 방식을 많이 사용함) -->
<%
	// Object getAttribute(String name)
	String id = (String)session.getAttribute("id");
	String passwd = (String)session.getAttribute("passwd");
%>

ID : <%=id %><br>
비밀번호 : <%=passwd %><br>

	</body>
</html>
