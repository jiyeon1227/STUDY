package p2023_08_11;

// package p2023_08_09 파일에서 가져옴 (oracle, mysql 다른점만 수정함)

import java.io.BufferedReader; // 도스 콘솔 창에서 사용자 입력을 받아들이기 위해 BufferedReader 
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

class JDBC_Insert02 {
	public static void main(String[] args) {

		String driver ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jsptest";
//		String url = "jdbc:mysql://172.30.1.33:3306/jsptest";// 강사님 DB

		Connection con = null;
		PreparedStatement pstmt = null;

		String sql;

		String name, email, tel, address;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");

			// ---JDBC_Insert 추가된 내용-------
			// 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println(" customer 테이블에 값 입력하기 .....");
			System.out.print(" 이름 입력: ");
			name = br.readLine().trim(); // 테이블에 추가할 name 필드 값을 입력 받음
			System.out.print(" 이메일 입력: ");
			email = br.readLine().trim(); // 테이블에 추가할 email 필드 값을 입력 받음
			System.out.print(" 전화번호 입력: ");
			tel = br.readLine().trim(); // 테이블에 추가할 tel 필드 값을 입력 받음
			System.out.println("주소를 입력 하세요?");
			address = br.readLine().trim();

			// INSERT 쿼리문을 작성
			sql = "INSERT into customer ( name, email, tel, address, reg_date)";
			sql += " values (?,?,?,?,sysdate())";// values앞에 한 칸 띄우기
			// mysql -> sysdate() | oracle -> sysdate

			pstmt = con.prepareStatement(sql);

			// 데이터 형에 따라서 값 설정해주는게 달라짐
			pstmt.setString(1, name);// varchar2는 setString
			pstmt.setString(2, email);
			pstmt.setString(3, tel);
			pstmt.setString(4, address);
			
			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println(" Data insert success!! ");
			} else {
				System.out.println(" Data insert failed ");
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		} finally {
			try {
//			if( rs != null )   rs.close();        
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
