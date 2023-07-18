package p2023_07_18;

import java.util.Scanner;

public class Report_jiyeon_01 {
	
	//과제1. 키보드를 이용해서 정수 5개를 입력 받은 후 int형 배열에 저장한다.
	//이 때, 배열에 저장된 값 중에서 최대값과 최소값을 구하는 프로그램

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[5];
		
		System.out.println("5개의 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int max, min;
		
		max = arr[0];
		min = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
			max = arr[0];
			min = arr[0];
			
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
					
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		

	}

}
