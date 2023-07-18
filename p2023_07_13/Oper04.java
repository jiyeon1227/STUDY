package p2023_07_13;

public class Oper04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//비교 연산자 : >, >=, <, <=, ==(같다), !=(같지않다)
		//비교 연산자의 결과사 참이면 true, 거짓이면 false를 return
		
		String str1 ="java"; //기본 자료형 변수
		String str2 ="java";
		String str3 = new String("java"); //참조형 변수
		
		//비교연산자로 주소값을 비교 -> 기본 자료형
		if(str1 == str2) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
		
		if(str1 == str3) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
		
		//값을 비교 -> 비교연산자로 비교할 수 없음 (equals사용)
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}

}
