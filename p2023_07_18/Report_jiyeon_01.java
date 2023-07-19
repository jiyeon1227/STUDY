package p2023_07_18;

import java.util.Scanner;

public class Report_jiyeon_01 {
	
	//과제1. 키보드를 이용해서 정수 5개를 입력 받은 후 int형 배열에 저장한다.
	//이 때, 배열에 저장된 값 중에서 최대값과 최소값을 구하는 프로그램

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("5개의 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		
		//for문 1개를 이용 -> 조건식을 사용해야함
		int arr1[] = new int[5];
		
		int max1, min1;
		
		max1 = 0;
		min1 = 0;
		
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
			
			max1 = arr1[0];
			min1 = arr1[0];
			
			if(arr1[i]>max1) max1 = arr1[i];
			if(arr1[i]<min1) min1 = arr1[i];
			
		}
		System.out.println("max = " + max1);
		System.out.println("min = " + min1);
		
		
		/*
		//for문 2개를 이용
		int arr2[] = new int[5];
		
		int max2, min2;
		
		//키보드 입력이 완전히 끝난 다음에 초기화를 해야 오류 발생안함 -> 입력 for문 아래에서 초기화
		//max2 = arr2[0];
		//min2 = arr2[0];
		
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		max2 = arr2[0];
		min2 = arr2[0];
		
		for(int i = 1; i < arr2.length; i++) {
			if(arr2[i] > max2) max2 = arr2[i];
			if(arr2[i] < min2) min2 = arr2[i];
		}
		
		
		System.out.println("max = " + max2);
		System.out.println("min = " + min2);
		*/

	}

}
