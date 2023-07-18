package p2023_07_14;

import java.util.Scanner;

public class Report_jiyeon_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//과제1. 키보드로 정수 3개를 입력 받았을때, 최대값과 최소값을 구하는 프로그램을 작성하세요
		//단, if else문으로 작성하세요
		
		int num1, num2, num3, min, max;
		
		System.out.println("정수 3개를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		//값을 비교 할 때 =를 빼면 중복된 값 입력시 잘못된 결과 출력됨
		if((num1 >= num2)&&(num1 >= num3)) {//num1이 가장 클때
			max = num1;
			if(num2 >= num3) {
				min = num3;
			}else {
				min = num2;
			}
		}else if((num2 >= num1) && (num2 >= num3)){//num2이 가장 클때
			max = num2;
			if(num1 >= num3) {
				min = num3;
			}else {
				min = num2;
			}
		}else{//num3이 가장 클때
			max = num3;
			if(num1 >= num2) {
				min = num2;
			}else {
				min = num1;
			}
		}

		System.out.println("최대값은" + max);
		System.out.println("최소값은" + min);
	}

}
