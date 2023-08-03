package p2023_08_03;

//p.462 
// 예외처리 떠넘기기

public class ExceptionEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();// 메서드 호출
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않음");
		}

	}

	//정적메서드
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lnag.String2");
	}
}
