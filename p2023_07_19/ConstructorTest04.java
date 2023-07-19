package p2023_07_19;

class MyDate04 {
	
	//field
	int year;
	int month;
	int day;

	//기본생성자
	public MyDate04() {
		year = 2023;
		month = 4;
		day = 1;
	}
	
	//이클립스에서 생성자를 생성해주는 기능사용
	//우클릭 -> source -> Generate Constructor using Fields(밑에서 3번째)
	//this : 내부 레퍼런스 변수
	public MyDate04(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	//메서드
	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end

public class ConstructorTest04 {
	public static void main(String[] args) {
		MyDate04 d = new MyDate04();
		d.print();//기본 생성자 호출
		System.out.println(d.year);//접근제어가자 default라 접근 가능함(private은 접근 안됨)

		MyDate04 d2 = new MyDate04(2023, 7, 19);
		d2.print();
	}
}