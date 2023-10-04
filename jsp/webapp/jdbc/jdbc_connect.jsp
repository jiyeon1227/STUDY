<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>

<%
Connection con = null;

try {

	/***************** My-SQL 연결 설정하는 부분 *****************************/
//	    String driver = "com.mysql.cj.jdbc.Driver";

//	    String url = "jdbc:mysql://localhost:3306/jsptest";
//	    String user = "jspid";
//	    String password = "jsppass";	
	/************************************************************************/

	/**************** Oracle 연결 설정하는 부분 *****************************/
	String driver = "oracle.jdbc.driver.OracleDriver";

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	/************************************************************************/

	//JDBC 방식
	// 정적메서드 : 개갸체를 생성하지않고 클래그.으로 접근 가능 ex)forName, getConnection
	// 오버라이딩 되어있음
	Class.forName(driver);
	con = DriverManager.getConnection(url, user, password);

	out.println("연결되었습니다.");

} catch (Exception e) {
	e.printStackTrace();
} finally {
	try{
		if(con != null)  con.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}
%>
