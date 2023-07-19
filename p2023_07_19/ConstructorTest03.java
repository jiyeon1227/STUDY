package p2023_07_19;

class MyDate03 { // 같은 패키지 안에서 클래스명은 중복이 안됨
	
	//field
	private int year;
	private int month;
	private int day;

	//생성자: 객체를 생성할 때 호출되고, 필드값을 초기화 시켜주는 역할
	public MyDate03() { // 기본 생성자

		// 필드값 초기화
		year = 2023;
		month = 4;
		day = 1;
	}

	//메서드
	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end
//여기까지는 메인메서드가 없어서 컴파일까지만 되고, 독립적으로 실행되지않음

public class ConstructorTest03 {
	public static void main(String[] args) {
		MyDate03 d = new MyDate03();
		d.print();//생성자 호출
				 //MyDate03생성자를 호출하고 필드값을 초기화함
		
		//private 접근제어자는 외부 크랠스의 접근을 허용하지 않기때문에 직접 접근 할 수 없음
		//System.out.println(d.year); -> 이렇게 접근을 못함
	}
}