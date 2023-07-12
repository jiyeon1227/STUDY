package p2023_07_12;

import java.util.ArrayList;
import java.util.List;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수 : 메모리상에 데이터를 저장하기위한 기억공간의 이름
		//변수를 만드는 방법 : 자료형    변수명 = 데이터(값);
		
		//기본 자료형 변수 -> 각 자료형별로 몇 byte인지 기억하기 ~!
		//1. 정수형 변수
		byte b1 = 10;  //-128 ~127
		//byte b2 = 130; //오버플로우 발생
		short s = 100; //-32768 ~ 32767
		int i = 1000; //-21억 ~ 21억
		long l = 100000L; //값을 할당 할 떄는 L을 붙여야함 (안붙이면 int형이됨)
		long L = 100000L; //(대소문자 구분X, 안붙이면 int형이됨)

		System.out.println("b=" + b1);
		System.out.println("s=" + s);
		System.out.println("i=" + i);
		System.out.println("l=" + l);
		
		//2. 실수형 변수
		Float ft1 = 3.14f; //끝에 F를 붙여야함 (대소문자 구분 X, 안붙이면 double이됨)
		Float ft2 = 3.14F; //(대소문자 구분 X, 안붙이면 double이됨)
		Float ft3 = (float)3.14; //double형 (3.14)를 float형으로 강제 형변환
		double d = 42.195;
		
		System.out.println("ft1=" + ft1);
		System.out.println("ft2=" + ft2);
		System.out.println("ft3="+ ft3);
		System.out.println("d=" + d);
		System.out.printf("%.1f\n" , d); //소수 첫 째자리까지 출력(반올림되어 출력), \n은 줄바꿈임
		System.out.printf("%.2f\n" , d); //소수 둘째자리까지 출력(반올림되어 출력)
		
		//3. 문자형 변수
		//반드시 ' ' 사용
		char c1 = 'A';
		//char c2 = 'AB'; //오류발생(한글자만 저장 가능)
		char c3 = '지';
		
		System.out.println("c1=" + c1);
		System.out.println("c3=" + c3);
		
		//4. 논리형 변수
		boolean bn1 = true;
		boolean bn2 = false;
		
		System.out.println("bn1="+bn1);
		System.out.println("bn2="+bn2);
		
		//5. 참조형 변수 : 클래스
		//방법이 2가지 있음 
		String s1 = "java"; //쌍따옴표만 가능
		String s2 = new String("java"); //new는 연산자,  s2는 생성자
		// 엄밀히 말하면 문자를 저장하는게 아니라 주소값을 저장하는것
		
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);
		
		if(s1 == s2) {// 서로 같은 주소값인지 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		if(s1.equals(s2)) {//서로 같은 데이터 값인지 비교
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
		
		//5. 참조형 변수 : 배열 - 배열은 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조
		int[] score = {80, 90, 100};
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		for(int j = 0; j < score.length; j++) {
			System.out.print(score[j] + "\t");// \t는 탭입력
		}
		System.out.println();
		
		//5. 참조형 변수 : 인터페이스(list) -> 가장 많이 사용함
		//대표적인 자료구조 -> 리스트
		//인터페이스는 자체적으로 객체생성을 못함
		//리스트 인터페이스 특징
		//1. 순차적인 자료구조
		//2. 여러가지 자료형의 데이터를 모두 저장(배열은 한가지 자료형만 저장가능)
		//3. 동적으로 공간의 크기를 늘릴 수 있음
		//List list = new List(); // 임포트 해야함 -> 임포트 했는데 오류발생 -> 인터페이스는 자체적으로 객체생성을 못하기 때문
		List list = new ArrayList();
		list.add(30);
		list.add(3.14);
		list.add('j');
		list.add("자바");
		
		for(int k = 0; k<list.size(); k++) {//size만큼 값을 하나씩 출력
			System.out.println(list.get(k) + "\t");
		}
	}

}
