<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 한글값 안깨지게 인코딩 -->
<%request.setCharacterEncoding("utf-8"); %>

<jsp:useBean id="board" class="board.BoardDataBean"/>
<jsp:setProperty property="*" name="board"/>
작성자 : <%=board.getWriter() %><br>
작성자 : <%=board.getPasswd() %><br>
작성자 : <%=board.getSubject() %><br>
작성자 : <%=board.getContent() %><br>