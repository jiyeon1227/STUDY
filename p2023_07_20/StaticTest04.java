package p2023_07_20;

class StaticTest4 {
	private static int a = 10;// 정적필드
	private int b = 20;// 필드, 인스턴스 멤버변수

	public static void printA() {// 정적메서드
		
		// 정적메서드 안에서는 정적필드만 사용가능
		System.out.println(a);// 정적필드는 사용가능
		// System.out.println(b); // 컴파일 에러 발생 -> 정적필드가 아니기 때문
	}

	public void printB() {
		
		// 일반 메서드 안에는 필드와 정적필드를 모두 사용할 수 있다.		
		System.out.println(a);
		System.out.println(b);
	}
}

public class StaticTest04 {
	public static void main(String[] args) {
		
		// 정적 메서드는 정적메서드를 가진 클래명으로 dot(.)으로 접근해서 호출한다.
		StaticTest4.printA();// 정적 메서드 호출
		
		// 일반 메서드는 일반메서드를 가진 클래스명으로 객체를 생성해서 메서드를 호출해야함
		StaticTest4 s1 = new StaticTest4();
		StaticTest4 s2 = new StaticTest4();
		s1.printB();
		s2.printB();
	}
}