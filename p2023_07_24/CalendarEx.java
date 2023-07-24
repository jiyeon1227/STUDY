package p2023_07_24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DateEx 파일 이어서 하는것임
		//3. Calendar 클래스
		
		//Calendar c1 = new Calendar();//Calendar 클래스는 new연산자 사용불가
		Calendar c2 = new GregorianCalendar();//업캐스팅(자식 클래스의 객체가 부모 클래스 타입으로 형변환 되는 것)
		
		Calendar c = Calendar.getInstance();//객체(=인스턴스)
		System.out.println(c);//유닉스 시간으로 나옴 이걸 년월일로 가공해야함
		System.out.println(Calendar.YEAR);// 이렇게 하면 1 출력
		
		int y = c.get(Calendar.YEAR);//c를 통해서 년도정보만 뽑아옴
		System.out.println(y);
		
		int m = c.get(Calendar.MONTH)+1;//0~11까지 구해오기때문에 +1을 해야함
		System.out.println(m);
		
		int d = c.get(Calendar.DATE);//0~11까지 구해오기때문에 +1을 해야함
		System.out.println(d);
		
		System.out.println(y + "/" + m + "/" + d);
		
		int h1 = c.get(Calendar.HOUR);//12시간
		int h2 = c.get(Calendar.HOUR_OF_DAY);//24시간
		
		int ap = c.get(Calendar.AM_PM);//0: 오전, 1: 오후
		if(ap == 0) {
			System.out.print("오전");
		}else {
			System.out.print("오후");
		}
		
		int mm = c.get(Calendar.MINUTE);//분
		int ss = c.get(Calendar.SECOND);//초
		
		System.out.println(h1 + ":" + mm + ":" + ss);//12시간
		System.out.println(h2 + ":" + mm + ":" + ss);//24시간
		
		
	}

}
