package p2023_07_14;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//키보드로 입력한 정수가 짝수, 홀수인지를 판별하는 프로그램
		System.out.println("정수를 입력하세용 ~");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + "은 짝수에용 ~");
		} else {
			System.out.println(n + "은 홀수에용 ~");
		}
	}

}
