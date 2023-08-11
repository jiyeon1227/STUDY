package p2023_08_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체가 생성되면 not null이됨 finally문에서 닫을때 조건으로 not null조건으로 닫음
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jsptest";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"jspid","jsppass");
			
			System.out.println("작성자명을 입력 하세요");
			String writer = br.readLine();
			System.out.println("비밀번호를 입력 하세요");
			String passwd = br.readLine();
			System.out.println("제목을 입력 하세요");
			String subject = br.readLine();
			System.out.println("내용을 입력 하세요");
			String content = br.readLine();
			
			String sql = "insert into board (writer, passwd, subject,content, reg_date )values(?,?,?,?,sysdate())";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			
			int rresult = pstmt.executeUpdate();//sql실행
			
			 if(rresult ==1) {
				 System.out.println("성공 !");
			 }else {
				 System.out.println("실패 !");
			 }
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if( pstmt != null) pstmt.close();
				if( con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
