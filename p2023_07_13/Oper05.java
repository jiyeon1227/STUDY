package p2023_07_13;

import java.util.Scanner;

public class Oper05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("정수 2 개를 입력하세용용용~~");
		
		//표준입력 장치인 키보드로 입력을 받기 위해서 Scanner객체를 생성
		Scanner sc = new Scanner(System.in); // System.in -> 키보드로 입력받음
		
		//정수형태로 입력을 받기 위해 nextInt()메소드로 입력을 받음
		int n1 = sc.nextInt();//sc.nextInt -> 정수형태로 입력받음
		int n2 = sc.nextInt();//입력받은 값은 스페이스바 또는 엔터키로 구분
		
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		if(n1 >n2) { //조건식이 참이면 if문 실행
			System.out.println(n1 + "이 " + n2 + "보다 크다");
		} else {//조건식이 거짓이면 else문 실행
			System.out.println(n2 + "이 " + n1 + "보다 크다");
		}

	}

}
