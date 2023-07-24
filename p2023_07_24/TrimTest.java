package p2023_07_24;


//trim(): 문자열의 좌/우 공백제거
//boolean equals(): 문자열 값을 비교

public class TrimTest {

    public static void main( String[] args ) {
	String str1 = new String( "gemini   " );
	String str2 = new String( "   gemini " );

	System.out.println( str1.equals( str2 ));//equals는 값비교 -> 공백때문에 다른값으로 인식
	System.out.println( str1.trim().equals( str2.trim()));
    }
}
		