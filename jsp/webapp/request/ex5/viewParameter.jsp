<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %>

<%
    request.setCharacterEncoding("utf-8");
%>

<html>
<head><title>요청 파라미터 출력</title></head>
<body>

<b>request.getParameter() 메소드 사용</b><br>
name 파라미터 = <%= request.getParameter("name") %> <br>
address 파라미터 = <%= request.getParameter("address") %>
<p>

<b>request.getParameterValues() 메소드 사용</b><br>
<%
    String[] values = request.getParameterValues("pet");
    if (values != null) {
    	for (int i = 0 ; i < values.length ; i++) {
%>
			<%= values[i] %>
<%
  		}
  	}
%>
<p>

<b>request.getParameterNames() 메소드 사용</b><br>
<% // getParameterNames는 name값을 구해오는 메서드(많이 사용 안함. 참고로 보기)

	// 열거형 : name, address, pet
    Enumeration num = request.getParameterNames();
    while(num.hasMoreElements()) {// 값이 있을경우 true리턴
        String name = (String)num.nextElement(); // 다운캐스팅
%>
        <%= name %>
<%
    }
%>
<p>

<b>request.getParameterMap() 메소드 사용</b><br>
<%	// name이 key값, 사용자가 입력한 값이 value값이됨
    Map parameterMap = request.getParameterMap();
    String[] nameParam = (String[])parameterMap.get("name");
    if (nameParam != null) {
%>
name = <%= nameParam[0] %>
<%
	}
%>

</body>
</html>