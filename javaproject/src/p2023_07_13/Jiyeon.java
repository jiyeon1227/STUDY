package p2023_07_13;

import java.util.Scanner;

public class Jiyeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//과제 
		//키보드로 3개의 정수를 입력 받았을때 최대값과 최소값을 구하는 프로그램을 작성하세요
		//(단, 조건 연산자를 활용해서 작성하세요)
		
		int num1, num2, num3, max, min;
		
		System.out.println("정수 3개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		max = ((num1 > num2) && (num1 > num3)) ? num1 : (num2 > num3) ? num2 : num3;
		
		min = ((num1 < num2) && (num1 < num3)) ? num1 : (num2 > num3) ? num2 : num3;
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);

	}

}
