package p2023_07_25;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int형 변수의 최대값과 최소값
		System.out.println("max= " + Integer.MAX_VALUE);
		System.out.println("min= " + Integer.MIN_VALUE);

		//String형을 int형으로 형변환 : "20"을 20으로 변환
		int n =Integer.parseInt("20");//매우 활용도가 높음 !! 꼭 기억하기
		System.out.println(n);
		System.out.println(n + 10);//n은 기본자료형이기때문에 산술연산이 가능함
		
		//parseInt()메서드 안에는 숫자로 형변환이 가능한 문자만 사용해야한다.
//		int n2 = Integer.parseInt("a");//오류발생
		
		//10진수를 2진수로 변환
		System.out.println("2진수: " + Integer.toBinaryString(10));
		
		//10진수를 8진수로 변환
		System.out.println("8진수: " + Integer.toOctalString(10));
		
		//10진수를 16진수로 변환
		System.out.println("16진수: " + Integer.toHexString(10));
		
//		Integer in = new Integer();// 기본생성자는 지원이 안됨
	}

}
