<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="register.LogonDataBean" %>
<%@ page import="register.LogonDBBean" %>
<%@ include file="color.jsp" %>

<% 
  request.setCharacterEncoding("utf-8");

  LogonDataBean	regBean1 = new LogonDataBean();
// regBean1.id="test";
%>

<jsp:useBean id="regBean" class="register.LogonDataBean" />
<jsp:setProperty name="regBean" property="*" />

<%
	LogonDBBean manager = LogonDBBean.getInstance();

	LogonDataBean old = manager.updateForm(regBean.getId()); // old는 DB에 저장된 비번
	
	if(old.getPasswd().equals(regBean.getPasswd())){ // 비번 일치시변경. regBean는 수정폼 비번
		manager.update(regBean);	// update SQL문 실행. 주소값으로 매서드 호출 (call by reference)
		
%>	
	<script>
		alert("회원수정 성공");
		location.href="list.jsp";
	</script>
	
<% }else{	// 비번 불일치	%>

	<script>
		alert("비밀번호가 일치하지 않습니다.");
		history.go(-1);
	</script>

<% } %>



