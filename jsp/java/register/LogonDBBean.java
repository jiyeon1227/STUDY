// DAO(Data Access Object)
// 메서드만으로만 구성됨
package register;

public class LogonDBBean {
	
	// 싱글톤 : 객체 생성을 한번만 수행 하는것
	private static LogonDBBean instance = new LogonDBBean();
	
	// 다이렉트 접근을 못하기 때문에 정적메서드로 접근
	public static LogonDBBean getInstance() {// 정적메서드 -> 객체생성 X 
		return instance;
	}

	// 회원가입 메서드 : 주소값 전달에 의한 메서드 호출방식(Call by Reference방식)
	public int insertMember(LogonDataBean member) {
		int result =0;
		return result;
	}
}
