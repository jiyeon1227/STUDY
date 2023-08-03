package p2023_08_03;

//ExceptionEx02랑 비슷한 내용

public class ExceptionEx03 {

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
			
		//1. Exception클래스는 예외처리 클래스 중에서 최상위 클래스이기 때문에 모든 자식 클래스의 예외를 받아서 처리할 수 있음
		//2. Exception클래스로 예외를 받을때는 가장 마지막 catch구문에서 사용해야함
		} catch (Exception e) {
			System.out.println("실행에 문제가 잇음.");
		} finally {
			System.out.println("다시 실행");
		}
	}

}
