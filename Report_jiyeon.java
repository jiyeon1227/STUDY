package p2023_07_26;

//과제1. 1~45사이의 숫자를 6개 출력하는 프로그램
//(단, 중복된 숫자는 1번만 출력)
//Math.random()을 이용해서 작성

public class Report_jiyeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[6];
				
		for(int i=0; i<6; i++) {
			arr[i] = (int)(Math.random()*45) + 1;
			
			for(int j = 1; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
			
			System.out.println(arr[i]);
		}
		
	}

}
