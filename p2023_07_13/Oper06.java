package p2023_07_13;

import java.util.Scanner;

public class Oper06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//조건 연산자
		
		//변수 = (조건식) ? 값1 : 값2;
		//조건식이 참이면 값1을 변수에 할당하고, 조건식이 거짓이면 값2를 변수에 할당한다.
		
		//문제1. 키보드로 입력한 2개의 정수 중에서 최댓값과 최소값을 구하는 프로그램을 작성하세요
		int n1, n2, max, min;//지역변수이기때문에 자동으로 초기화되지 않음
		
		System.out.println("정수 2개를 입력하세용 ~");
		
		Scanner sc = new Scanner(System.in);//스캐너 객체 생성
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		max = (n1 > n2) ? n1 : n2;
		min = (n1 < n2) ? n1 : n2;
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}

}
