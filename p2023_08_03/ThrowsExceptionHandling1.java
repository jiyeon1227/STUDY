package p2023_08_03;

public class ThrowsExceptionHandling1 {
	// occurException()를 호출한 곳으로 예외처리를 양도 하겠다는 의미
	public void occurException() throws ArithmeticException {

		// ArithmethicException 발생
		int result = 3 / 0;// 예외발생(아래 문장을 실행하지않고 throws 로 예외를 던짐)
		System.out.println(result);
	}

	public static void main(String[] args) {
		// 객체를 생성
		ThrowsExceptionHandling1 te = new ThrowsExceptionHandling1();

		// try-catch 블록으로 예외 처리
		try {
			te.occurException();
		} catch (ArithmeticException ae) {
			System.out.println("Exception이 발생 : " + ae.toString());
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
