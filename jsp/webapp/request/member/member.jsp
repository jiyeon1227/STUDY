<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	String jumin1 = request.getParameter("jumin1");
	String jumin2 = request.getParameter("jumin2");
	String mailid = request.getParameter("mailid");
	String domain = request.getParameter("domain");
	String tel1 = request.getParameter("tel1");
	String tel2 = request.getParameter("tel2");
	String tel3 = request.getParameter("tel3");
	String phone1 = request.getParameter("phone1");
	String phone2 = request.getParameter("phone2");
	String phone3 = request.getParameter("phone3");
	String post = request.getParameter("post");
	String address = request.getParameter("address");
	String gender = request.getParameter("gender");
	
	// 이렇게 하면 [Ljava.lang.String;@18234f24 이게 출력됨
	String[] hobby = request.getParameterValues("hobby");
	
	// 결합해서 한개씩 출력해야함
	String h = "";// Strimg h = "공부-게임-등산" 이렇게 - 으로 결합해서 DB에 저장하고, split메서드로 잘라서 한 개 씩 출력
	for(String hy : hobby){// 향상된 for문으로 출력
		h += hy + "-";
	}
	
	String intro01 = request.getParameter("intro");
	String intro02 = request.getParameter("intro").replace("\n", "<br>");
%>

id :<%=id %><br>
비밀번호 :<%=passwd %><br>
성명 :<%=name %><br>
주민번호 :<%=jumin1 %>-<%=jumin2 %><br>
이멜 :<%=mailid %>@<%=domain %><br>
전번 :<%=tel1 %>-<%=tel2 %>-<%=tel3 %><br>
폰 :<%=phone1 %>-<%=phone2 %>-<%=phone3 %><br>
우편번호 :<%=post %><br>
주소 :<%=address %><br>
성별 :<%=gender %><br>
취미 처리 전 :<%=hobby %><br>
취미 처리 후 :<%=h %><br>
소개01 :<%=intro01 %><br>
소개02-1 :<pre><%=intro01 %></pre><br>
소개02-2:<br><%=intro02 %><br>