package p2023_07_14;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//키보드로 입력한 구구단 1개단을 출력하는 프로그램
		System.out.println("원하는 단을 입력하세용가뤼");
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();

		System.out.println("[" + dan + "단]");
		
		for (int i = 1; i<10; i++) {
			System.out.println(dan + "*" + i + "=" + dan *i);
		}

	}

}
