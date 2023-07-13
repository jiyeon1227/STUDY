package p2023_07_13;

public class CastingEX {
	//p.75 CastingExample

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intValue = 44032;
		char charValue = (char)intValue; // 강제 형변환
		System.out.println(charValue); // 가
		
		long longValue = 500;
		intValue = (int)longValue; // 강제 형변환
		System.out.println(intValue);// 500

		double douleValue = 3.14;
		intValue = (int)douleValue;// 강제 형변환 (더블을 인트로 자료형 변환하는게 젤 많이 쓰임)
		System.out.println(intValue);// 3
	}

}
