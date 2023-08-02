package p2023_08_02;

public class DivideZeroExceptionHandling2 {
	public static void main(String[] args) {

		// int type의 변수 선언
		int b = 20;
		int a = 0;
		int c = 0;

		// 두 수의 나눗셈 결과를 구한다
		try {
			c = b / a;
			int total = a + b;
			int sub = b - a;
			System.out.println(c);
		} catch (Exception e) {
			// java.lang.Throwable의 메소드
			// 예외 정보를 자세히 출력
			e.printStackTrace();// printStackTrace 출력기능이 내장되어있음(print문을 쓰지 않더라도 예외메세지 출력)

			// 예외 정보를 문자열로 반환함.
			System.out.println(e.getMessage());

			// 예외의 간단한 설명문을 반환함.
			System.out.println(e.toString());
			
			// 직접 입력
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}// main end
}
