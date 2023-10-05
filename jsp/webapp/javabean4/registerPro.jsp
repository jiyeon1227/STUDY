<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="register.LogonDataBean" %>
<%@ page import="register.LogonDBBean" %>
<%@ include file="color.jsp" %>

<% 
  request.setCharacterEncoding("utf-8");

  LogonDataBean	regBean1 = new LogonDataBean();
//regBean1.id="test"; // 직접 접근 불가
%>

<jsp:useBean id="regBean" class="register.LogonDataBean" />
<jsp:setProperty name="regBean" property="*" />

<%
//	regBean.id="test"; // 직접 접근 불가
%>

<%
	LogonDBBean manager = LogonDBBean.getInstance();
	int result=manager.insertMember(regBean); // call-by-reference : 주소값을 전달해서 메서드 호출

	if(result==1){// insert가 정상실행되면 1 리턴
%>	
	<script>
		alert("회원가입 성공");
		location.href="list.jsp";
	</script>
	
<% }else{%>

	<script>
		alert("회원가입 실패");
		history.go(-1);
	</script>

<% } %>



