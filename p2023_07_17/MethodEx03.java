package p2023_07_17;

import java.util.Scanner;

public class MethodEx03 {
	
	//키보드로 입력한 2개의 정수 중에서 최대값과 최소값을 수하는 프로그램
	//단, 메서드를 이용해서 작성
	
	//최대값 메서드
	public static int max(int a, int b) {//static이 붙어있으니까 정적메서드
		if(a>b)
			return a;
		else
			return b;
	}
	
	//최소값 메서드
	public static int min(int a, int b) {//static이 붙어있으니까 정적메서드
		if(a<b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, max, min;
		System.out.println("2개의 정수를 입력하세요옹옹~~");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		max = MethodEx03.max(n1, n2);//같은 클래스면 max(n1,n2)이렇게 호출가능
		min = MethodEx03.min(n1, n2);
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}

}
