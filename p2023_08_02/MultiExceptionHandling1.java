package p2023_08_02;

// try ~ catch ~ finally 형식
// 1. finally 안에 들어있는 내용은 예외가 발생하든, 발생하지않든 무조건 실행됨
// 2. finally 안에 들어가는 내용은 주로 파일을 닫거나, 데이터베이스 연결을 끊는 내용이 주로 사용된다.
// ex) file.close(), con.close()

public class MultiExceptionHandling1 {
	public static void main(String[] args) {

		int value = 20;
		int div = 0;

		int[] intArray = { 1, 2, 3 };

		try {
			// 두수의 나눗셈을 구함
			int result = value / div;// ArithmeticException 예외발생 -> 무한대는 처리불가
			System.out.println(result);

			// 배열의 특정 값을 저장
			int arrayValue = intArray[4];// ArrayIndexOutOfBoundsException 예외발생 -> 배열범위를 벗어남
			System.out.println(arrayValue);

		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());
			System.out.println("0으로 나눌 수 없습니다.");

		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
			System.out.println("배열의 범위를 벗어났습니다.");

		} finally {// 예외가 발생해도 실행됨 (예외가 발생하지 않아도 실행됨)
			System.out.println("예외가 발생했음!");

		}
	}
}
