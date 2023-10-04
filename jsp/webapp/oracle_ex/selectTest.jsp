<%@page import="java.text.SimpleDateFormat"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*"%>

<html>
<head><title>회원목록</title></head>
<body>
  <h2>회원목록</h2>
  
  <a href="insertTestForm.jsp">회원가입</a>
  <TABLE width="800" border="1">
  <TR>
  	<TD width="100">아이디</TD>
  	<TD width="100">패스워드</TD>
  	<TD width="100">이름</TD>
  	<TD width="250">가입일자1</TD>
  	<TD width="300">가입일자2</TD>
  	<TD width="100">수정</TD>
  	<TD width="100">삭제</TD>
  </TR>

<%
  Connection con=null;
  PreparedStatement pstmt=null;
  ResultSet rs=null;
  ResultSet rs01=null;
  int cnt=0;
  
  try{
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
		 
	// JDBC 방식
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection(url,user,password);

	pstmt=con.prepareStatement("select count(*) from member1");// 총 회원수를 구하는 sql
	rs01=pstmt.executeQuery();// select sql문 실행
	if(rs01.next()){// next()는 boolean형으로 리턴 -> sql문을 만족하는 데이터를 가져오면 true가 된다.
		cnt = rs01.getInt(1);
//		cnt = rs01.getInt("count(*)");
	}	
	
	String sql= "select * from member1";// 회원 목록을 구하는 sql
	
	pstmt=con.prepareStatement(sql);
	rs=pstmt.executeQuery();// select sql문 실행
	
	// 날짜를 형식에 맞춰 출력
	// SimpleDateFormat객체 생성
	SimpleDateFormat sd = new SimpleDateFormat("yyyy년MM월dd일 HH:mm:ss");

	while(rs.next()){// next()는 결과를 boolean으로 반환 -> true면 while문 실행
	  String id= rs.getString("id");
      String passwd= rs.getString("passwd");
      String name= rs.getString("name");
      Timestamp register=rs.getTimestamp("reg_date");

%>
     <TR>
  	   <TD width="100"><%=id%></TD>
  	   <TD width="100"><%=passwd%></TD>
  	   <TD width="100"><%=name%></TD>
  	   <TD width="250"><%=register.toString()%></TD>
  	   <TD width="300"><%=sd.format(register)%></TD>
  	   <TD width="100">
  	   		<a href="updateTestForm.jsp?id=<%=id%>">수정</a> <!-- id값을 가져가서 select문에 조건걸기 -->  
  	   </TD>
  	   <TD width="100">
  	   		<a href="deleteTestForm.jsp?id=<%=id %>">삭제</a>
  	   </TD>
    </TR>
<%  } 
  }catch(Exception e){ 
		e.printStackTrace();
  }finally{
	    if(rs != null) try{rs.close();}catch(SQLException sqle){}
		if(pstmt != null) try{pstmt.close();}catch(SQLException sqle){}
		if(con != null) try{con.close();}catch(SQLException sqle){}
  }
%>
</TABLE>

총 회원수:<%=cnt %>명

</body>
</html>