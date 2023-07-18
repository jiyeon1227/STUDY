package p2023_07_13;

import java.util.Scanner;

public class Oper07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//논리 연산자 : ||, &&, !
		
		//문제2. 5과목의 점수를 키보드로 입력받았을때, 합격/불합격을 판별하는 프로그램을 작성하세요.
		//(각 과목당 과락은 40점이고, 평균 60점이상 받아야 합격)
		int n1, n2, n3, n4, n5, total;
		double avg;
		
		System.out.println("5과목의 점수를 입력하세용용용~~");
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		total = n1 + n2 + n3 + n4 + n5;
		
		//1. int형과 int형을 산술연산을 수행하면 결과는 int형으로 처리됨
		//2. int형과 double형을 산술연산을 수행하면 큰 자료형인 double형으로 처리됨
		avg = (double)total / 5;//형변환을 해야 소수점이 짤리지않음 -> 분자나 분모 하나만 해도 되고 둘다해됨
		System.out.println("avg:" + avg);

		if(n1 >= 40 && n2 >= 40 && n3 >= 40 && n4 >= 40 && n5 >= 40 && avg >= 60) {
			System.out.println("합격을 축하드립니다!!");
		}else {
			System.out.println("다음시험 준비하세용 ~");
		}
	}

}
