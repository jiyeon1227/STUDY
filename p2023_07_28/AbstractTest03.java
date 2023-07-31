package p2023_07_28;

abstract class Hello {// 추상클래스이자 부모클래스
	public abstract void sayHello(String name);// 추상메서드
}

abstract class GoodBye {// 추상클래스
	public abstract void sayGoodBye(String name);// 추상메서드
}


//자바에서는 클래스의 다중상속을 허용하지 않음.
class SubClass03 extends GoodBye,Hello{// 다중 상속 시도해서 오류발생

	public void sayHello(String name){
      System.out.println(name+"씨 안녕하세요!");
  }

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class AbstractTest03 {
	public static void main(String[] args) {
		SubClass03 test = new SubClass03();
		test.sayHello(args[0]);
		test.sayGoodBye(args[0]);
	}
}
