package p2023_08_09;

import java.io.BufferedReader; // 도스 콘솔 창에서 사용자 입력을 받아들이기 위해 BufferedReader 
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class JDBC_Insert01 {
	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;
		PreparedStatement pstmt = null;

		// ResultSet rs = null;
		String sql;

		String name, email, tel, no;

		try {
			// DB연동 (아래 두줄은 항상 동일함)
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			// ---JDBC_Insert 추가된 내용-------
			// 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println(" customer 테이블에 값 입력하기 .....");
			System.out.print(" 번호 입력: ");
			no = br.readLine();
			System.out.print(" 이름 입력: ");
			name = br.readLine(); // 테이블에 추가할 name 필드 값을 입력 받음
			System.out.print(" 이메일 입력: ");
			email = br.readLine(); // 테이블에 추가할 email 필드 값을 입력 받음
			System.out.print(" 전화번호 입력: ");
			tel = br.readLine(); // 테이블에 추가할 tel 필드 값을 입력 받음

			int ino = Integer.parseInt(no);// 자료형변환

			// SQL실행 방법 2가지
			// 1. Statement 메서드 사용 -> 뭐리분이 간단할때만 사용
			// 2. PreparedStatement 메서드 사용 -> 주로 사용

			// INSERT 쿼리문을 작성
			sql = "INSERT into customer (no, name, email, tel) values (?, ?, ?, ?)";// 컬럼 순서는 상솬없음 (values랑 순서만 맞춰주면됨)

			pstmt = con.prepareStatement(sql);// ?자리에 값을 설정하기 위해 sql문을 읽어옴

			// 값 설정 set (값 가져올떄는 get)
			pstmt.setInt(1, ino);// 숫자는 물음표 순서 (no로 설정하면 오류 발생 -> no는 문자이기 때문)
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, tel);

			int result = pstmt.executeUpdate();// sql문 실행
			if (result == 1) {
				System.out.println("데이터 입력 성공");
			} else {
				System.out.println("데이터 입력 실패");
			}

		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		} finally {
			try {
				// if (rs != null)
				// rs.close();
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
