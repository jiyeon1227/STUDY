package p2023_07_19;

//this() : 같은 클래스 안에 있는 생성자를 호출하라는 의미로 사용됨.
//잘 사용하지않음(.this를 더 많이 사용) 존재만 알아두기 
class MyDate10 {

	//field
	private int year;
	private int month;
	private int day;

	//기본 생성자
	public MyDate10() {
		this(2023, 1, 1);//같은 클래스안의 생성자 호출
	}

	//생성자 오버로딩 : 한개의 클래스에 여러개의 생성자를 정의 하는것
	//생성자 오버로딩을 하려면 조건 3가지 중에 하나를 만족해야함
	//1. 매개변수의자료형을 다르게 설정
	//2. 매개변수의갯수를 다르게 설정
	//3. 매개변수의순서를 다르게 설정
	
	//매개변수의 갯수를 다르게 설정한 생성자 오버로딩
	//매개변수 1개가있는 생성자
	public MyDate10(int new_year) {
		this(new_year, 1, 1);//같은 클래스안의 생성자 호출
	}

	//매개변수 2개가있는 생성자
	public MyDate10(int new_year, int new_month) {
		this(new_year, new_month, 1);//같은 클래스안의 생성자 호출
	}

	//매개변수 3개가있는 생성자
	public MyDate10(int new_year, int new_month, int new_day) {
		year = new_year;
		month = new_month;
		day = new_day;
	}

	public void print() {//필드값을 출력하는 메서드
		System.out.println(year + "/" + month + "/" + day);
	}
}
//여기까지 컴파일은 되지만 독립적실행은 안됨(main메서드가 없기때문)

public class ConstructorTest10 {
	public static void main(String[] args) {
		MyDate10 d = new MyDate10(2023, 7, 19);//매개변수 3개인 생성자 호출
		d.print();
		MyDate10 d2 = new MyDate10(2023, 7);//매개변수 2개인 생성자 호출
		d2.print();
		MyDate10 d3 = new MyDate10(2023);//매개변수 1개인 생성자 호출
		d3.print();
		MyDate10 d4 = new MyDate10();
		d4.print();
	}
}