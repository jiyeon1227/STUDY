package p2023_08_29;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

class CallableStatementTest {

	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = null;
		CallableStatement cs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");

			sql = "{call del_all()}";// del_all 프로시저 실행

			// CallableStatement를 객체를 생성
			cs = con.prepareCall(sql);// sql을 읽어와서 객체를 생성함
			cs.execute();// 저장 프로시저 실행
			
			System.out.println("프로시저 실행 완료");// 이게 출력되면 위에있는 내용이 정상 출력되었다는 뜻

			cs.close();
			con.close(); // close()하면 정상적인 종료가 되기 때문에 롤백 안됨
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
