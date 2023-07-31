package p2023_07_28;

abstract class AbstractClass {//부모 클래스(추상클래스)
	abstract void Method01();//abstract -> 추상 메서드: 이름만 있고, 내용이 없는 메서드

	void Method02() {// 일반 메서드
		System.out.println("Method02:  추상클래스에서 구현");
	}
}

//추상 클래스를 상속 받으면, 추상 클래스 안에 있는 추상 메서드를 자식 구현 클래스에서 반드시 메서드 오버라이딩을 해야한다.
class SubClass extends AbstractClass {

	@Override//메서드 오버라이딩
	void Method01() {
		System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}

}

class AbstractTest01 {
	public static void main(String args[]) {
		
		//일반메서드와는 달리 추상메서드는 자체적으로 객체를 생성 할 수 없음
//		AbstractClass abs = new AbstractClass();
		
		SubClass obj = new SubClass();
		obj.Method01();// 메서드 오버라이딩된 메서드가 호출됨
		obj.Method02();// 부모 클래스로 부터 상속받은 Merhod02() 메서드 호출됨
	}
}
