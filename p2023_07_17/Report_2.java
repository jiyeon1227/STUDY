package p2023_07_17;
import java.util.Scanner;

public class Report_2 {//FatorialEx
	
	//2023_07_17 과제1 과제풀이

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, f=1;
		System.out.print("정수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=n; i>=1; i--){
			f = f * i;      // f *= i;
		}
		System.out.println(n+"!="+f);	
	}

}
