package p2023_07_26;

public class ChangeString {
    public static void main( String[] args ) {
    
	// 기본 데이터 형 선언
	int a = 10;
	System.out.println( a + 10 );//20

	// String 형으로 변환 : 10 ==> "10"
	String sa1 = String.valueOf( a );// String sal ="10";
	System.out.println( sa1 + 10 );// 1010

	// Wrapper Class 객체 생성 : 10 -->"10";
	Integer oint = new Integer( 10 );
	
	// String 형으로 변환
	String sa2 = oint.toString();// String sa2 ="10";
	System.out.println( sa2 + 10 );//1010

//  String형을 int형으로 변환 : "10" --> 10
 	int k =  Integer.parseInt(sa2);
    }
}