package p2023_07_18;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//키보드로 5과목의 점수를 입력받고, 총점과 평균을 구하는 프로그램
		
		int[] s = new int[5];
		
		System.out.println("5과목의 점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for (int i=0; i<s.length; i++) {
			s[i] = sc.nextInt();
			sum += s[i];
		}
		
		double avg = sum /5.0;//5.0으로하면 double 형으로 처리됨
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);

	}

}
