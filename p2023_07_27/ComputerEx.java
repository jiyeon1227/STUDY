package p2023_07_27;

//.318~319
//메서드 재정의(Method Overriding)
class Calculator{//부모 클래스
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle()실행");
		return 3.141592 * r * r;
	}
	
	
}

class Computer extends Calculator{//자식 클래스

	//우클릭  -> source -> Override/implement 어쩌구 클릭하면 오버라이딩 해줌
	@Override //어노테이션
	double areaCircle(double r) {//메서드 오버라이딩
		System.out.println("Calculator 객체의 areaCircle()실행");
		return 3.141592 * r * r;
	}
	
}

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r =10;
		
		Calculator cal = new Calculator();
		System.out.println("원의 면적: " + cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원의 면적: " + com.areaCircle(r));
		//자식 클래스에서 메서드 오버라이딩된 메서드가 호출된다.
		

	}

}
