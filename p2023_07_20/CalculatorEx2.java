package p2023_07_20;

//p.265 Calculator + CalculatorExample
//메서드 오버로딩(Method Overloading) : 한개의 클래스안에 동일한 이름을 가진 메서드를 여러개 정의 하는것.
//메서드 오버로딩 조건
//1. 매개변수의 자료형을 서로 다르게 설정 
//2. 매개변수의 갯수를 서로 다르게 설정
//3. 매개변수의 순서를 바꾸어서 설정

class Calculator2{
	
	//정사각혛의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

public class CalculatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator2 myCal = new Calculator2();
		
		//정사각형의 넓이 구하기
		double result1 = myCal.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCal.areaRectangle(10,20);

		System.out.println("정사각형의 넓이: " + result1);
		System.out.println("직사각형의 넓이: " + result2);
	}

}
