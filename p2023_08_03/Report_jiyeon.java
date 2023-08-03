package p2023_08_03;

import java.text.SimpleDateFormat;
import java.util.Date;

//과제1. Thread를 이용해서 현재 시간을 1초에 한번씩 출력하는 프로그램
// 날짜시간은 date클래스 또는 SimpleDateFormat 사용

public class Report_jiyeon extends Thread{

	public void run(){
		
		while(true) {
			Date d= new Date();
			SimpleDateFormat dd = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
			System.out.println(d);
			try {
			Thread.sleep(1000);
			}catch(InterruptedException ie){
				System.out.println(ie.toString());
			}
		}
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Report_jiyeon ji = new Report_jiyeon();
		ji.start();

	}
}
