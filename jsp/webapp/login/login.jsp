<!-- contentType 인코딩은 현재 페이지를 인코딩하는것 아래에서 해주는 인코딩이랑은 의미가 다름 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 한글값 안꺠지게 인코딩 -->
<%request.setCharacterEncoding("utf-8"); %>

<!-- id명은 객체명, class는 패키지부터 java클래스 경로값설정 -->
<jsp:useBean id="member" class="member.MemberDataBean" />

<!-- name에는 userBean에서 만든 id값(객체명) -->
<jsp:setProperty property="*" name="member"/>

<!-- getProperty 액션태그는 잘 쓰지 않고, 이렇게 직접호출하는 방법을 많이 사용함 -->
id : <%=member.getId() %><br>
pass : <%=member.getPasswd() %>