package p2023_08_02;

public class ExceptionEx3 {

	public static void main(String[] args) {
		int var = 50;
		// Runconfiguration 에서 Argument에 값 넣고 실행해보기
		// args[0] = "5";// 예외발생 안함 -> Integer.parseInt로 문자 5를 숫자 5로변환
		// args[0] = "a";// 예외발생 -> NumberFormatException
		// args[0] = "0";// 예외발생 -> 숫자형으로 변환 후 ArithmeticException예외발생

		try {
			int data = Integer.parseInt(args[0]);

			System.out.println(var / data);

			// Exception 예외 클래스가 하위 예외 클래스들을
			// 모두 가지고 있기 때문에 먼저 정의해서는 안된다.

		} catch (NumberFormatException ne) {
			System.out.println("숫자가 아닙니다.");
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌순 없죠?");
		} catch (Exception e) {// 어떤 예외일지 모를 때 사용
							   // Exception은 catch구문 가장 마지막에 사용해야함 (Exception이 최상위 클래스이기때문)
			System.out.println("Exception !!");
		}
		System.out.println("프로그램 종료!");
	}
}
