package p2023_07_28;

interface IHello06 {// 인터페이스
	//.으로 접근 가능 하지만 a는 상수이기 때문에 수정불가
	int a = 10;// 상수: public static final 생략되어 있음

	public abstract void sayHello(String name);// 추상 메서드
}

interface IGoodBye06 {// 인터페이스
	public abstract void sayGoodBye(String name);// 추상 메서드
}

// 인터페이스끼리 상속을 받을 때는 extends로 상속을 받아야 되고, 다중상속도 가능함
interface ITotal extends IHello06, IGoodBye06 {
	public abstract void greeting(String name);
}

// 인터페이스를 상속받는 구현 클래스에서 3개의 추상메서드를 모두 메서드 오버라이딩을 해야함(하나라도 빠지면 오류가 발생함)
class SubClass06 implements ITotal {
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕가세요!");
	}

	public void greeting(String name) {
		System.out.println(name + ", 안녕!");
	}
}

class AbstractTest06 {
	public static void main(String[] args) {
		SubClass06 test = new SubClass06();
		test.sayHello("홍길동");// 메서드 오버라이딩된 메서드가 호출됨
		test.sayGoodBye("에스파");
		test.greeting("뉴진스");
		
		System.out.println("a= " + IHello06.a);
		
		//a는 상수이기 때문에 값을 수정 할 수 없다.(접근만 가능함)
//		IHello06.a = 30;
	}
}