package p2023_07_24;

import java.util.Calendar;

//과제1. Calendar클래스를 이용해서 오늘날짜, 시간, 요일을 출력하는 프로그램

public class Report_jiyeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();// 객체(=인스턴스)

		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH) + 1;
		int d = c.get(Calendar.DATE);
		int h = c.get(Calendar.HOUR_OF_DAY);
		int mm = c.get(Calendar.MINUTE);
		int ss = c.get(Calendar.SECOND);
		int w = c.get(Calendar.DAY_OF_WEEK);
		String arr[] = {"토","일","월","화","수","목","금"};
		
		System.out.println(y + "/" + m + "/" + d + "/" + h + ":" + mm + ":" + ss + "/" + (arr[w]));

		

	


	}

}
