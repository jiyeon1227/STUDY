package p2023_07_20;

//p.250~251 Calculator + CalculatorEx

class Calculator{
	
	//method
	void poerOn() {//void는 return을 생략 할 수 있음
		System.out.println("전원을 켭니다.");
		return;//생략가능
	}
	
	//return문: plus()메서드를 호출한 곳에 값을 돌려주는 역할
	//return문은 메서드 가장 맨 마지막 줄에 사용해야한다.(return문 아래로는 실행을 안함)
	int plus(int x, int y) {//지역변수: x, y, result
		int result = x + y;
		return result;
		//System.out.println("test");//이 문장은 실행을 안함(return문 아래에 있기 때문)
	}
	
	double divide(int x, int y) {//자동 형변환 : byte -> int
		double result = (double)x + (double)y;//강제 형변환 : int -> double
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCalc = new Calculator();
		myCalc.poerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();

	}

}
