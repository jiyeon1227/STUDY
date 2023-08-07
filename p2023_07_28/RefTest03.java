package p2023_07_28;

/*
 * 다운 캐스팅(강제 형변환)
   1. 슈퍼클래스에서 서브클래스로 형변환 하는것
   2. 참조 가능한 영역이 확대가 된다.
   3. 컴파일러에 의해서 암시적 형변환(자동 형변환)이 되지 않기    
      때문에 자료형을 생략할 수 없다.(강제 형변환)
 */

class Parent03 {
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child03 extends Parent03 {
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

class RefTest03 {
	public static void main(String[] args) {
		Parent03 p = new Child03(); // 업캐스팅(자동 형변환)
//        부모 	   =    자식 

		p.parentPrn();// 부모가 상속해준 메서드만 호출 가능함
		// p.childPrn();//-> 컴파일 에러(부모가 상속해주지 않은 메서드는 접근 불가)
		
		//다운 캐스팅이 되면 상속받은 메서드(parentPrn())와 자기 클래스의 메서드(child()) 2개의 메서드 모두 호출해서 사용할 수있다.
		// 참조 가능한 영역이 확대가 된다.
		
		//2줄
		Child03 c; // 서브 클래스로 레퍼런스 변수 선언
		// 서브 클래스 레퍼런스 변수에 슈퍼 클래스의 레퍼런스 값이 대입됨
		c = (Child03) p; // 강제 형변환으로 다운 캐스팅
		
		//1줄
		Child03 c1 = (Child03) p;// 다운 캐스팅 (강제 형변환)
		
		c.parentPrn();
		c.childPrn();
	}
}