package p2023_07_20;

class StaticTest {
	static int a = 10;//정적필드 : 메서드 영역(공유영역)에 저장됨
	int b = 20;//인스턴스 멤버변수(=일반적인 필드) : 힙메모리영역에 저장됨
}

class StaticTest01 {
	public static void main(String[] args) {
		System.out.println("StaticTest.a->" + StaticTest.a);
		StaticTest s1 = new StaticTest();
		StaticTest s2 = new StaticTest();

		System.out.println("s1.a->" + s1.a + "\t  s2.a->" + s2.a);
		System.out.println("s1.b->" + s1.b + "\t  s2.b->" + s2.b);
		System.out.println();

		s1.a = 100;//정적필드 a값을 100 할당
		//가장 마지막값을 공유함
		System.out.print("s1.a->" + s1.a);
		System.out.println("\t  s2.a->" + s2.a);
		System.out.println(StaticTest.a);
		System.out.println();

		s1.b = 200;
		System.out.print("s1.b->" + s1.b);
		System.out.println("\t  s2.b->" + s2.b);
	}
}