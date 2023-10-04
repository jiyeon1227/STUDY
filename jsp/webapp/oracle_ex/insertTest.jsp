<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*"%>

<%
  request.setCharacterEncoding("utf-8");

  String id= request.getParameter("id");
  String passwd= request.getParameter("passwd");
  String name= request.getParameter("name");
  Timestamp register=new Timestamp(System.currentTimeMillis());// 객체를 만들지 않고 DB date로 입력

  Connection con=null;
  PreparedStatement pstmt=null;
  int result = 0;
  
  try{
    String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	 
	// JDBC 방식으로 DB 접속
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection(url,user,password);
	
	String sql= "insert into member1 values (?,?,?,sysdate)";
	pstmt=con.prepareStatement(sql);
	pstmt.setString(1, id);
	pstmt.setString(2, passwd);
	pstmt.setString(3, name);
	//	pstmt.setTimestamp(4,register);
	result = pstmt.executeUpdate();// insert SQL문 실행

} catch (Exception e) {
	e.printStackTrace();
} finally {
	if (pstmt != null) try { pstmt.close();} catch (SQLException sqle) {}
	if (con != null) try { con.close();} catch (SQLException sqle) {}
}
%>

<html>
<head><title>회원가입</title></head>
<body>
  
<%
	if(result == 1){// insert가 잘 된 경우
%>    
  		<script>
  			alert("회원가입 성공");
  			location.href="selectTest.jsp";
  		</script>
<% 	}else{// 정상입력이 안된 경우 (중복ID인경우는 0 리턴)%>
   		<script>
			alert("회원가입 실패");// 메세지를 띄울 수 있음
			history.go(-1);// 조용히 페이지를 이동함
   		</script>
<% 	} %>   
</body>
</html>