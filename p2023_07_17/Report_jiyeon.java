package p2023_07_17;

import java.util.Scanner;

public class Report_jiyeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//과제1. 키보드를 이용해서 입력한 정수의 팩토리얼을 구하는 프로그램
		//ex)3! = 3*2*1
		
		int num1,fac,i;
		
		System.out.println("정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt(); 
		
		System.out.print(num1 +"!=");
		fac = 1;
		for (i = num1; i > 0; i--) {
			fac *= i;	
			System.out.print(i+"*");
		}
		System.out.println("="+fac);
	}

}
