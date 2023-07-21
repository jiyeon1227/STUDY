package p2023_07_20;

class StaticTest3 {
	private static int a = 10;//정적필드
	private int b = 20;//필드, 인스턴스 멤버변수

	public static void printA() { // 정적 메서드
		System.out.println(a);	  // 정적 메서드에서는 this를 사용하지 못함
//    System.out.println(this.a);   //정적필드에 this를 사용하면 오류발생/this는 개별적인 객체만 접근가능
									//(this는 내부레퍼런스 변수라고함)
		//정적메서드 안에는 정적 필드만 사용가능
		//System.out.println(b);//b는 일반 필드이기때문에 정적메서드 안에서 사용못함
	}

	public void printB() { // this는 인스턴스 메서드에서 여러 객체에 의해서
						   // 메서드가 호출될 때 이를 구분하기 위해서 사용된다.
		
		//일반적인 메서드 안에서는 정적필드와 일반적인 필드 모두 사용할 수 있음
		System.out.println(b); //일반적인 필드
		System.out.println(a); //정적필드
	}
}

public class StaticTest03 {
	public static void main(String[] args) {
		StaticTest3.printA();
		StaticTest3 s1 = new StaticTest3();
		StaticTest3 s2 = new StaticTest3();
		s1.printB();
		s2.printB();
	}
}