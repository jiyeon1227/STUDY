package p2023_07_24;

// 2023_07_25 과제풀이
import java.util.Calendar;

public class Report {//DateTime02

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c = Calendar.getInstance();
		
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;// 0~11
		int d = c.get(Calendar.DATE);
		
		int h1 = c.get(Calendar.HOUR);	// 12시간
		int ap = c.get(Calendar.AM_PM);	//0:오전	
									    //1:오후
		int h2 = c.get(Calendar.HOUR_OF_DAY); //24시간
		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		
		System.out.println(y+"년 "+ m+"월 "+d+"일");
		if(ap == 0){
			System.out.println("오전");
		}else{
			System.out.println("오후");
		}
		System.out.println(h1+":"+mm+":"+s);		
		
		int w = c.get(Calendar.DAY_OF_WEEK);//1~7
		System.out.println("w="+w);
		// 1:일, 2:월, 3:화, 4:수, 5:목, 6:금, 7:토
		String[] week={"일","월","화","수","목","금","토"};//첫 시작 요일을 잘 정해야함(주말쪽으로가면 안맞을수도있음)
		
		System.out.println(week[w-1]+"요일");
	}

}
