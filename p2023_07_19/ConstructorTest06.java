package p2023_07_19;

class MyDate06 {

	// field : 객체가 생성될 때 heap메모리상에서 값을 저장하는 역할
	private int year;
	private int month;
	private int day;

	// 생성자 : 객체가 생성될 떄 호출되면서, field값을 초기화시키는 역할
//  public MyDate06(){//default 생성자
//  }  
	public MyDate06(int new_year, int new_month, int new_day) {// 매개변수를 가진 생성자
		year = new_year; // 2023
		month = new_month; // 7
		day = new_day; // 19
	}

	// 메서드의 역할 세가지
	// 1. 필드값을 출력하는 역할
	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
	
	
	//이클립스에서 메서드를 생성해주는 기능사용
	//우클릭 -> source -> Generate Getters and Setters

	//2. getters 메서드 : 필드값을 메서드를 호출한 곳에 돌려주는 역할
	//값들이 다 다르기 때문에 한번에 못돌려줌 -> 하나하나 돌려줘야함
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	
	//3. setters 메서드 : 필드값을 수정, 변경하는 역할
	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	
}

public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2023, 7, 19);
		d.print();//2023/07/19 출력
		
		d.setYear(1999);//year값을 1999로 수정
		d.print();//1999/7/9 출력
		
		d.setMonth(12);//Month값을 12로 수정
		d.print();//1999/12/19 출력
		
		d.setDay(27);//Day값을 27로 수정
		d.print();//1999/12/27 출력
		
		System.out.println("돌려받은 year값: " + d.getYear());
		System.out.println("돌려받은 month값: " + d.getMonth());
		System.out.println("돌려받은 day값: " + d.getDay());
	}
}