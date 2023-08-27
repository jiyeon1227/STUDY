package Chap07;

class Time{
	private int hour;// 0~23 사이의 값을 가져야함
	private int minute;
	private int second;
	
	public void setHour(int hour) {// hour를 수정하기 위한 메서드
		if(hour < 0 || hour >23) return;// 유효한 값이 아니면 return
		
		this.hour = hour;
	}
	
	public int getHour(){return hour;}
}

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time t = new Time();
		//t.hour = -100;// 오류는 안나지만 원하는 값이 아님 -> iv를 private으로 설정 -> 에러발생(private은 다른 클래스에서는 사용 불가)
		//위에 있는 코드는 아래처럼 수정해야함
		t.setHour(21);// hour의 값을 21로 변경
		System.out.println(t.getHour());

	}

}
