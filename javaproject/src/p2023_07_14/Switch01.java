package p2023_07_14;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("0~100점 사이의 점수를 입력해보던가 말던가 ~");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		switch(s/10){
		case 10: //100점인 경우에 case9 타도록
		case 9:System.out.println("A");
			break;
		case 8:System.out.println("B");
			break;
		case 7:System.out.println("c");
			break;
		case 6:System.out.println("D");
			break;
		default : System.out.println("F");
		}

	}

}
