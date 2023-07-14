package p2023_07_14;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//키보드로 입력한 구구단 1개단을 while문으로 풀력하는 프로그램
		System.out.println("출력할 단을 입력하쎼용 ~~");
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		System.out.println("[" + dan + "단]");
		int i = 1;
		while(i < 10) {
			System.out.println(dan + "*" + i + "=" + dan*i);
			i++;
		}
		
		
	}

}
