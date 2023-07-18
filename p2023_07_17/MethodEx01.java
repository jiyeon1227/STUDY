package p2023_07_17;

public class MethodEx01 {
	//메서드 : 여러가지 코드를 묶어 놓은것
	//메서드를 사용하는 이유는 코드를 재사용하기 위함
	
	//사용자 정의 메서드
	//사용자 정의 메서드는 개발자가 직접 호출해야함(main 메서드 안에서 호출해야함)
	public static void check() {//static이 붙어있는 메서드를 정적메서드라함
		System.out.println("메서드 호출 성공");
		return; //return 생략가능
	}
	
	//1.값 전달에 의한 메소드 호출방식(call by Value)
	public static void check(int a) {//매개변수(parameter)
		System.out.println("전달된 값: " + a);
	}
	
	//메서드오버로딩
	public static void check(int a, double b) {
		double result = a+b;
		System.out.println("전달될 값의 합: " + result);
	}
	
	public static void check(char c) {
		System.out.println("전달된 값: " + c);
	}
	
	public static void check(boolean b) {
		System.out.println("전달된 값: " + b);
	}

	//2.주소값 전달에 의한 메소드 호출방식 (call by Reference)
	public static void check(String s) {//String s ="java"
		System.out.println("전달된 값: " + s);
	}
	
	//return문 : 메세드를 호출한 곳에 값을 돌려주는 역할(void일 때는 생략 가능함)
	//return구문은 메서드 가장 아랫줄에 작성해야함
	public static int check01() {//void 대신 int가 오면 return 값이 int형이어야됨
		System.out.println("리턴구문");
		return 50;//메서드를 호출한 곳에 50을 돌려주는 역할
	}
	
	public static double check02(int a, double d) {
		double result = a + d;
		return result;
	}
	
	//main()메서드는 JVM으로만 호출됨
	//main()메서드는 개발자가 직접 호출 할 수 없음
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodEx01.check();//클래스명.호출할 메스드명 -> 이렇게 호출
		check();//같은 클래스 안에 있으면 이렇게 호출해도됨
		check(30);
		check(10,20.5);
		check('a');
		check(true);
		check("java");//check(new String("java")); 이렇게도 가능
		
		check01();//return문으로 돌려주는 값이 출력되지 않음 -> 새로운 변수를 생성해서 값을 받고 출력 or 메서드를 출력
		int result = check01();//새로운 변수생성해서 출력
		System.out.println("돌려받은 값1: " + result);
		System.out.println("돌려받은 값2: " + check01());//메서드 호출해서 출력
		
		double result02 = check02(50,3.14);
		System.out.println("돌려받은 값3: " + result);
		System.out.println("돌려받은 값4: " + check02(50,3.14));
		
		
	}

}
