package p2023_08_02;

// ArithmeticException: 숫자를 0으로 나눌때 발생하는 예외
// ArrayIndexOutOfBoundsException: 배열의 범위를 벗어났을때 발생하는 예외

public class MultiExceptionHandling {
	public static void main(String[] args) {

		int value = 20;
		int div = 0;
		int[] intArray = { 1, 2, 3 };

		try {
//			int arrayValue = intArray[4];// 배열의 범위를 벗어나서 오류발생
//			System.out.println(arrayValue);

			// 두수의 나눗셈을 구함
			int result = value / div;
			System.out.println(result);

			// 배열의 특정 값을 저장
			int arrayValue = intArray[4];// 14라인이랑 다른 예외 발생
			System.out.println(arrayValue);

		// 예외가 발생하면 각 예외에 맞는 문장이 실행됨
		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());
			System.out.println("0으로 나눌수 없습니다.");// 메세지 직접출력
			
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
			System.out.println("배열의 범위를 벗어났습니다.");// 메세지 직접출력
		}
	}
}
