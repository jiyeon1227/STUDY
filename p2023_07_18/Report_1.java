package p2023_07_18;
import java.util.Scanner;

public class Report_1 {//ArrayTest
	
	//2023_07_19 과제1 풀이

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max, min;
		int[] s = new int[5];

		System.out.print("정수 5개를 입력 하세요?");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt();
		}
		max = s[0];
		min = s[0];
		for (int i = 1; i < s.length; i++) {
			if (max < s[i]) max = s[i];
			if (min > s[i]) min = s[i];
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
	}

}
