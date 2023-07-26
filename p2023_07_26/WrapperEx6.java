package p2023_07_26;

//p.498
//숫자 데이터를 문자열로 변환 : 20 --> "20"

public class WrapperEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		Integer it = new Integer(30);
		String str4 = it.toString();

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
