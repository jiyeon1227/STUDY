package p2023_07_19;

class MyDate05 {
	
	//field
	private int year;
	private int month;
	private int day;

	//기본 생성자(매개변수가 없는 생성자)-> 기본 생성자는 객체를 생성할 때 컴파일러가 자동으로 생성해줌
	//							예외적으로 매개변수를 가진 생성자가 있을 경우에는 더이상 기본 생성자를 만들어주지 않음
	public MyDate05() {
	}

	public MyDate05(int new_year, int new_month, int new_day) {
		//생성자의 매개변수명과 필드명이 같은 이름인 경우에는 값전달이 되지않음
		year = new_year;//this.year = year; -> 이런식으로 this.을 붙여줘야함
		month = new_month;
		day = new_day;
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest05 {
	public static void main(String[] args) {
		MyDate05 d = new MyDate05();//기본생성자 호출
		d.print();

		MyDate05 d2 = new MyDate05(2023, 7, 19);
		d2.print();
	}
}