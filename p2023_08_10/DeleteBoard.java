package p2023_08_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteBoard {

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
			
			System.out.println("삭제할 글 번호를 입력하세용 ~~~");
			int no = Integer.parseInt(br.readLine());
			
			String sql = "delete from board where no= ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,no);
			
			int result = pstmt.executeUpdate();
			
			if(result ==1) {
				System.out.println("삭제성공힁힁힁 ~~~~~");				
			}else {				
				System.out.println("삭제실패 ~~~~!!!!!!!");				
			}
			
		}catch(Exception e){
//			e.printStackTrace();
			System.out.println("입력한게 숫자가 맞나용~~~??? 숫자만 입력하쎄용 ~~");
		}finally {
			try {//닫을 때는 가장 마지막에 열었던것부터 닫기
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
