package chap08;

public class Ex8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);// 실행되지 않는다.
		}
		System.out.println(5);

	}

}
