package p2023_07_28;

interface IHello {// 부모 인터페이스
	public abstract void sayHello(String name);// 추상 메서드
}

abstract class GoodBye04 {// 부모 추상 클래스
	public abstract void sayGoodBye(String name);// 추상 메서드(public을 지우면 오류 발생 -> 일반, 추상 메서드를 구분해 줘야하기때문)
}


//클래스와 인터페이스를 동시에 상속을 받을 때에는 클래스를 먼저 상속을 받고, 
//그런 다음에 인페이스를 나중에 상속을 받아야 한다(상속을 받는 순서가 바뀌면 오류가 발생함)
class SubClass04 extends GoodBye04 implements IHello {
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class AbstractTest04 {
	public static void main(String[] args) {
		SubClass04 test = new SubClass04();
		test.sayHello("홍길동");
		test.sayGoodBye("젼릥");
	}
}