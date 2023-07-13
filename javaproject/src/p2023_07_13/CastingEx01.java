package p2023_07_13;

public class CastingEx01 {
	
	//p.78 LongOperationExample
	//서로 다른 자료형의 변수를 산술연산을 수행하면 큰 자료형으로 자동 형변환이 된다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte value1 = 10; // 1byte
		int value2 = 100; //4byte
		long value3 = 1000L; // 8byte
		long result = value1 + value2 + value3; //다 long 형으로 처리됨
		//int result = value1 + value2 + value3; // 오류 발생
		System.out.println(result);
		
		int i = 100;
		double d = 3.14;
		double result1 = i + d;
		System.out.println(result1);
		
		//1.같은 자료형의 변수를 산술연산을 실행하면 같은자료형으로 처리됨
		//2.서로다른 자료형의 변수를 산술연산을 수행하면 가장 큰 자료형으로 자동 형변환이 된다.
		
		int total = 93;
		
		System.out.println(total / 5); //18 int/int = int -> 소수점 아래는 버림
		System.out.println(total / 5.0); // 18.6 4byte/8byte =8byte -> 큰 자료형으로 변환
		
		double resul2 = total / 5; // 자동 형변환 : int -> double
		double resul3 = total / 5.0;
		System.out.println(resul2); // 18.0
		System.out.println(resul3); // 18.6
		
	}

}
