package p2023_07_28;

interface IHello01 {// 인터페이스
	void sayHello(String name);// 추상메서드(public abstract 생략되어있음)
}

//1. 인터페이스를 상속 받을 때는 implement로 상속 받는다.
//2. 부모 인터페이스를 상속을 받으면, 부모 인터페이스 안에 있는 추상 메서드를 자식 구현 클래스에서 반드시 메서드 오버라이딩을 해야함
class Hello01 implements IHello01 {

	@Override
	public void sayHello(String name) {// 메서드 오버라이딩
//	void sayHello(String name){//public이 없으면 오류발생
		System.out.println(name + "씨 안녕하세요!");
	}
}

class InterfaceTest01 {
	public static void main(String[] args) {
		// 인터페이스는 자체적으로 객체 생성을 할 수 없다.
		// IHello01 ih = new IHello01();// 오류 발생

		Hello01 obj = new Hello01();
		obj.sayHello("홍길동");// 메서드 오버라이딩된 메서드가 호출됨
		obj.sayHello("이순신");
	}
}
