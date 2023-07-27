package p2023_07_26;

//과제1. 1~45사이의 숫자를 6개 출력하는 프로그램
//(단, 중복된 숫자는 1번만 출력)
//Math.random()을 이용해서 작성

//다른분 코드

public class Report_jiyeon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[46];
		int cnt = 0;
		
		while(cnt <6) {
			int tmp = (int)(Math.random()*45) + 1;

			if(arr[tmp] == 0) {
				System.out.print(tmp + "\t");
				arr[tmp] = 1;
				cnt++;
			}
			
		}
		
	}

}
