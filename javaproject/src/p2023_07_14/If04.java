package p2023_07_14;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//키보드로 입력한 점수가 어느 학점에 해덩 되는지 판별하는 프로그램
		
		System.out.println("0~100점 사이의 점수를 입력하세요");
		Scanner sc =  new Scanner(System.in);
		
		int s;
		
		s = sc.nextInt();
		
		//if else if 문은 여러개의 조건식을 모두 만족하더라도, 가장 먼저 만족하는 조건절 아랫쪽의 문장만 실행된다.
		if(s >= 90) {
			System.out.println("A");
		}else if(s >= 80){
			System.out.println("B");
		}else if (s >= 70) {
			System.out.println("B");
		}else if(s >= 60) {
			System.out.println("B");
		}else {
			System.out.println("F!!!!!!!!!!!");
		}
		

	}

}
