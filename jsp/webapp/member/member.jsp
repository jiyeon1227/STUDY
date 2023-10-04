<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 한글값 안꺠지게 인코딩 -->
<%request.setCharacterEncoding("utf-8"); %>

<jsp:useBean id="member" class="member.MemberDataBean"/>
<jsp:setProperty property="*" name="member"/>

<!-- 취미 여러개 촐력하기 (이렇게 안바꾸고 그냥 출력하면 한개만 출력됨)-->
<%
	// hobby배열에 저장하고
	String[] hobby = request.getParameterValues("hobby");
	String h ="";
	for(String hy : hobby)
		h += hy + "-";
	
	// 덮어쓰기됨
	member.setHobby(h);
%>

id : <%=member.getId() %><br>
pass : <%=member.getPasswd() %><br>
성명 :<%=member.getName()%><br>
주민번호 : <%=member.getJumin1() %>-<%=member.getJumin2() %><br>
이멜 : <%=member.getMailid()%>@<%=member.getDomain() %><br>
전화번호 :<%=member.getTel1() %>-<%=member.getTel2() %>-<%=member.getTel3() %><br>
핸드폰 :<%=member.getPhone1() %>-<%=member.getPhone2() %>-<%=member.getPhone3() %><br>
우편번호 :<%=member.getPost() %><br>
주소 :<%=member.getAddress() %><br>
성별 : <%=member.getGender() %><br>
취미 : <%=member.getHobby() %><br>
자기소개 : <%=member.getIntro() %><br>