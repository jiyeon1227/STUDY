package p2023_07_20;

//p.236 ~ 237 korean + koreanExample

class Korean{
	//필드
	String nation ="korea";
	String name;
	String ssn;
	
	//생성자(이클립스로 생성함)
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
}
//여기까지 main메서드가 없기떄문에 컴파일까지만 가능

public class KoreanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Korean k1 = new Korean("jiyeon","991227");
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		
		Korean k2 = new Korean("dahae","980423");
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn);

	}

}
