package p2023_07_17;

import java.util.Scanner;

public class Dowhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("메세지를 입력하세용가륑");
		System.out.println("프로그램을 종료하려면 q를 입력하세용가륑");
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		do {
			System.out.print(">");
			input = sc.nextLine();//문자로 입력받는다.
			System.out.println("입렵문자: " + input);
			
		}while(!input.equals("q"));
		//while("oracle".equals("q"))
		//while("q".equals("q"))
		
		//사용자가 q를 입력하면 do ~ while문을 빠져나오게 된다.
		System.out.println("프로그램 종료");
		sc.close();

	}

}
