package p2023_07_28;

import java.util.Scanner;

//과제1. 키보드를 통해서 연도를 입력받는다. 이 때 입력 받은 연도가 윤년인지, 평년인디 판별하는 프로그램
//윤년의 정의를 이용해서 프로그램을 작성하세요
// 1년 365.242374
//평년 = 365일 (2월달 - 28일 까지)
//윤년 = 366일 (2월달 - 29일 까지)
//* 윤년의 정의
//1. 행당 연도를 4로 나누어 떨어지면 윤년
//2. 그 중에서 100으로 나누어 떨어지면 윤년아님
//3. 그 중에서 400으로 나누어 떨어지면 윤년


public class Report_jiyeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = 0;
		
		System.out.println("연도를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		y = sc.nextInt();
		
		if(y%4 == 0 && y != 100 || y%400 == 0) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}

	}

}
