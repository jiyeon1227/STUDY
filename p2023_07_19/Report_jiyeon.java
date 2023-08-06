package p2023_07_19;

public class Report_jiyeon {

	//과제1. 구구단(2~9단)의 연산 결과를 2차원 배열에 저장하고,
	//배열에 저장된 결과를 이용해서 구구단을 출력하는 프로그램
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d,n;
		
		int arr[][] = new int [8][9];
		
		for (d = 2; d < 10; d++) {
			for (n = 1 ; n <10; n++) {
				arr[d-2][n-1] = d * n; 
				System.out.print(arr[d-2][n-1]+ "\t");
				
			if(n ==9)System.out.println();
			}
			
		}

	}

}
