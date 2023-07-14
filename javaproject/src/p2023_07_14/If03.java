package p2023_07_14;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//키보드로 정수 2개를 입력받았을때, 최대값과 최소값을 구하는 프로그램

		int n1, n2, min, max;
		
		System.out.println("정수 2개를 입력하세용 ~~~~");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if (n1 > n2) {
			max = n1;
			min = n2;
		} else {
			max = n2;
			min = n1;
		}
		System.out.println("max= " + max);
		System.out.println("min= " + min);
	}

}
