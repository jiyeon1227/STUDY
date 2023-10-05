// DAO(Data Access Object)
// 메서드만으로만 구성됨
package register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

import oracle.net.aso.e;

public class LogonDBBean {
	
	// 싱글톤 : 객체 생성을 한번만 수행 하는것
	// 객체를 계속 생성하면 서버 리소스를 게속 사용하기 때문에 객체를 한 번만 만들고 공유함
	private static LogonDBBean instance = new LogonDBBean();
	
	// 다이렉트 접근을 못하기 때문에 정적메서드로 접근
	public static LogonDBBean getInstance() {// 정적메서드 -> 객체생성 X 
		return instance;
	}

	// 회원가입 메서드 -> 주소값 전달에 의한 메서드 호출방식(Call by Reference방식)
	// 메서드는 반드시 public으로 해야 jsp에서 접근이 가능함 -> 서로 다른 패키지로 인식하기 때문
	// jsp에서 DAO파일을 import해야함(DAO는 내부적으로 import함)
	public int insertMember(LogonDataBean member) {
		int result =0;
		
		// 바깥쪽에 선언해야 finally에서 사용 할 수 있음
		// DB 연동
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			// JDBC 방식
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			String sql = "insert into member2 values (?,?,?,?,?,?,?,sysdate)";
			
			pstmt = con.prepareStatement(sql);
			// ? 자리 값 설정 -> DB컬럼 보면서 해야함
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getJumin1());
			pstmt.setString(5, member.getJumin2());
			pstmt.setString(6, member.getEmail());
			pstmt.setString(7, member.getBlog());
			
			result = pstmt.executeUpdate(); // insert sql문 실행. 정상실행되면 1리턴
			
		}catch (Exception e){
			e.printStackTrace();
		}finally {
//			pstmt.close();// 이렇게 바로쓰면 오류 발생 -> 예외처리 해야함
//			con.close(); // 이렇게 바로쓰면 오류 발생 -> 예외처리 해야함
			try {
				if(pstmt != null) { pstmt.close(); }
				if(con != null) { con.close(); }
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// 전체 회원목록 구하기
	// 여러데이터(지금은 2명이상 회원)를 구할 떄는 list, arraylist를 사용해야함
	public List<LogonDataBean> selectMember(){ 
		List<LogonDataBean> list = new ArrayList<LogonDataBean>();
		
		// DB 연동
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			String sql = "select * from member2";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // select sql 문 실행
			
			
			// java 수업 때 회원 정보를 받아서 출력하는 과제(회원정보 입력받기(3))랑 비슷함
			while(rs.next()) {// 데이터를 1개씩 가져온다.
				LogonDataBean member = new LogonDataBean();
//				member.id = "test"; // 직접 접근 불가 -> setter 사용
				member.setId(rs.getString("id")); // String 이니까 getString으로 구해옴
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setJumin1(rs.getString("jumin1"));
				member.setJumin2(rs.getString("jumin2"));
				member.setEmail(rs.getString("email"));
				member.setBlog(rs.getString("blog"));
				member.setReg_date(rs.getDate("reg_Date")); // date니까 getDate로 구해옴
				
				list.add(member);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(rs != null) { rs.close(); }
				if(pstmt != null) { pstmt.close(); }
				if(con != null) { con.close(); }
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	// 회원 수정폼 -> 회원 1명 정보 구해옴
	// 한개의 데이터는 LogonDataBean(DTO)를 쓰고, 여러개의 데이터는 list를 씀
	public LogonDataBean updateForm(String id) {
		LogonDataBean member = new LogonDataBean(); // 객체 생성
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			String sql = "select * from member2 where id = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); // select SQL문 실행
			// 궁금점 ?_? 그러면 rs는 어떻게 값이 들어있는거쥐 ~?
			if(rs.next()) {// 잘 가져오면 true값 리턴
				// DTO 객체를 생성해서 저장하면됨
				// updateForm메서드 첫줄에서 객체 생성해놓음
				// porivat이기 떄문에 직접 저장안됨 -> set 메서드 사용
				member.setId(rs.getString("id"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setJumin1(rs.getString("jumin1"));
				member.setJumin2(rs.getString("jumin2"));
				member.setEmail(rs.getString("email"));
				member.setBlog(rs.getString("blog"));
				member.setReg_date(rs.getDate("reg_Date"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) { rs.close(); }
				if(pstmt != null) { pstmt.close(); }
				if(con != null) { con.close(); }
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return member;
	}
	
	// 회원정보 수정
	// insert, update는 데이터가 필요함 -> 이 데이터를 매개변수로 전달
	public int update(LogonDataBean member) {
		int result =0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			String sql = "update member2 set name=?,jumin1=?,jumin2=?,";
				   sql +=" email=?,blog=?,reg_date=sysdate where id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getJumin1());
			pstmt.setString(3, member.getJumin2());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getBlog());
			pstmt.setString(6, member.getId());
			
			result = pstmt.executeUpdate();// update sql문 실행
				   
				   
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(pstmt != null) { pstmt.close(); }
				if(con != null) { con.close(); }
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// 회원정보 삭제
	public int delete(LogonDataBean member){
		int result =0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			
			String sql = "delete from member2 where id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			result = pstmt.executeUpdate();
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) { pstmt.close(); }
				if(con != null) { con.close(); }
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	
}
