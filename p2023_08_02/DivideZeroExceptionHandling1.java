package p2023_08_02;

/*
 예외처리
 try ~ catch  구문에서 예외처리 클래스를 자 ㄹ모를깨는 예외처리 클래스 중에서 
 최상위 클래스인 Exception 클래스로 모든 자식클래스의 예외를 받을 수 있다.(상속관계가 형성되어있음)
 */
public class DivideZeroExceptionHandling1 {
	public static void main(String[] args) {

		// int type의 변수 선언
		int b = 20;
		int a = 0;
		int c = 0;

		try {
			c = b / a;// 예외발생
			int total = a + b;
			int sub = b - a;

		} catch (Exception e) {//DivideZeroExceptionHandling 파일이랑 비교해보기 ~
			a = 2;
			c = b / a;
		}

		System.out.println(c);
	}
}
