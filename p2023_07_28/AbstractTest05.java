package p2023_07_28;

interface IHello {
	public abstract void sayHello(String name);
}

interface IGoodBye {
	public abstract void sayGoodBye(String name);
}

//두 인터페이스로부터 상속을 받는 클래스 설계
class SubClass05 implements IHello, IGoodBye {
	public void sayHello(String name) {
		System.out.println(name + "로 가려면 어디로 가야되나요?");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "의 하입보이요");
	}
}

class AbstractTest05 {
	public static void main(String[] args) {
		SubClass05 test = new SubClass05();
		test.sayHello("홍대");
		test.sayGoodBye("뉴진스");
	}
}