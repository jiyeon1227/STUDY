package p2023_07_24;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//날짜 시간 관련 클래스 : Date, Timestamp
		
		//1. Date -> java.util 패키지 안에 있음
		//Date 출력
		Date d = new Date();
		System.out.println(d);
		//년, 월, 일, 요일, 시, 분, 초로 날짜를 출력
		SimpleDateFormat sd1 = new SimpleDateFormat ("yyyy년 MM월 dd일 E요일 a HH:mm:ss");//HH는 24시간, a는 오전/오후를 출력해줌
		SimpleDateFormat sd2 = new SimpleDateFormat ("yyyy년 MM월 dd일 EEE요일 HH:mm:ss");//hh는 12시간, 요일은 원칙은 EEE이지만, E하나만 써도 됨
		System.out.println(sd1.format(d));//원하는 포멧으로 출력하기 위함
		System.out.println(sd2.format(d));
		
		//2. Timestamp
		//Timestamp 출력
		Timestamp ts = new Timestamp(System.currentTimeMillis());//기본 생성자가 없기 때문에 Timestamp ts = new Timestamp 이렇게 쓰고 임포트만하면 오류남 -> 모듈추가
		System.out.println(ts);
		
		//년, 월, 일, 시, 분, 초 로 날짜를 출력
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sf.format(ts));
	}

}
