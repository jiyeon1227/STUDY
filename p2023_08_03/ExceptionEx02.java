package p2023_08_03;

//p.458
// 예외처리

public class ExceptionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String data1 = args[0];// 예외발생
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);// 예외발생
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println("실행 매개값수 부족");// 이걸로 출력하면 빨간 글자뜬다잉 ~
			System.out.println("실행 매개값수 부족");
		} catch (NumberFormatException e) {
			System.out.println("숫자 변환 안됨");
		} finally {
			System.out.println("다시 실행");
		}

	}

}
