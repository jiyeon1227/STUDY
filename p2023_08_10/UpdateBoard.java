package p2023_08_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.print.DocFlavor.INPUT_STREAM;

public class UpdateBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null; // DB접속
		PreparedStatement pstmt = null;// SQl실행
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("수정할 글 번호를 입력하세요");
			int no = Integer.parseInt(br.readLine());
			System.out.println("작성자명을 입력");
			String writer = br.readLine();
			System.out.println("비밀번호 입력");
			String passwd = br.readLine();
			System.out.println("제목입력");
			String subject = br.readLine();
			System.out.println("내용입력");
			String content = br.readLine();
			
			String sql = "update board set writer =?, passwd=?,subject=?, content=?,reg_date=sysdate where no=?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setInt(5, no);
			
			int result = pstmt.executeUpdate();
			
			if(result ==1) {
				System.out.println("성공 !");
			}else {
				System.out.println("실페 ㅜ");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {// 닫아줄때는 열어준 역순으로 닫아주기
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
