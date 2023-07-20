package p2023_07_20;

class StaticTest2 {
	private static int a = 10;//정적필드/private은 외부클래스 접근을 허용하지않음
	private int b = 20;//인스턴스 멤버변수

	public static void setA(int new_a) {//정적메서드
		a = new_a;
	}

	public static int getA() {//정적메서드
		return a;
	}
}

public class StaticTest02 {
	public static void main(String[] args) {
		//System.out.println(StaticTest2.a);// a가 private으로 선언되어서 컴파일 에러 발생 -> private이기 때문
		System.out.println(StaticTest2.getA());

		StaticTest2 s1 = new StaticTest2();
		StaticTest2 s2 = new StaticTest2();

		s1.setA(10000);
		int res1 = s1.getA();
		System.out.println(res1);
		System.out.println(s2.getA());
	}
}