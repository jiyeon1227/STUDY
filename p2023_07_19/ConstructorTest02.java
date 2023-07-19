package p2023_07_19;

class MyDate {
	
	//필드, 생성자, 메서드앞에 접근제어자를 붙일 수 있음
	
	//private는 외부 클래스에서 접근을 허용하지 않는다는말
	private int year;
	private int month;
	private int day;

	public MyDate() {//기본 생성자(Default Constructor)
		System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
	}

	public void print() {//메서드(method)
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end

public class ConstructorTest02 {
	public static void main(String[] args) {
		
		//생성자는 객체를 생성할 때 호출됨
		MyDate d = new MyDate();
		d.print();//생성자 호출
//	System.out.println(d.year);//오류발생 -> 필드가 private이기 때문에 주소를 통해서 접근 할 수 없음
							  //(private은 외부클래스에서 접근을 허용하지 않음)
							  //메서드를 통해 실행해야함(26라인 처럼 메서드 호출 후 private필드 접근)
//	MyDate dd =  new MyDate();
	}
}