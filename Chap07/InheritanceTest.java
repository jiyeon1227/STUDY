package Chap07;

class MyPoint{
	int x;
	int y;
}

class Circle extends MyPoint{// 상속관계
	int r;
}

class Circle2 {// 포함관계
	MyPoint p = new MyPoint();// 참조변수의 초기화 -> MyPoint p; 이렇게 하면 저장공간이 생성이 안됨 꼭 초기화하기
	int r;
}

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 상속관계
		Circle c1 = new Circle();
		c1.x= 1;
		c1.y= 2;
		c1.r= 3;
		
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.r);
		
		// 포함관계
		Circle2 c2 = new Circle2();
		c2.p.x=1;// c2가 가리키는 객체의 p가 가리키는 x
		c2.p.y=2;
		c2.r=3;
		
		System.out.println(c2.p.x);
		System.out.println(c2.p.y);
		System.out.println(c2.r);
		
		// toString() : 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
		// toString()은 모든 클래스의 조상 클래스인 object 클래스를 상속받았기 때문에 사용가능함
		// 두 개 출력 결과는 동일함 (알아두기)
		System.out.println(c2.toString());
		System.out.println(c2);
		
	}

}
