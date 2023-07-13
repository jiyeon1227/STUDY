package p2023_07_13;

public class ImplicitConversion {

    public static void main( String[] args ) {
    	
	// char 변수 선언 및 초기화.
	char charValue1 = 'a';
	char charValue2 = 97; //char은 문자, 양의정수처리 둘 다 가능함
	System.out.println( "charValue = " + charValue1 );
	System.out.println( "charValue = " + charValue1 );
 
	// int 변수 선언 및 'a'의 값으로 초기화.
	int intValueOfChar = charValue1;
	System.out.println( "intValueOfChar = " + intValueOfChar );

	// int 변수 선언 및 초기화.
	int intValue = 30;
	System.out.println( "intValue = " + intValue );

	// float 변수 선언 및 intValue 변수 값 할당
	//float floatValue = intValue;
	float floatValue = 30;// 자동 형변환 : int(4) -> float(4)
	System.out.println( "floatValue = " + floatValue ); // 30.0

	// double 변수 선언및 floatValue,intValue 변수 값 할당
	double doubleValue1 = floatValue; // 자동 형 변환 : float (4) -> double(8)
	double doubleValue2 = intValue;// 자동 형 변환 : int (4) -> double(8)
	System.out.println("doubleValue1 ="+doubleValue1);
	System.out.println("doubleValue2 ="+doubleValue2);

    }//main end
}//class end



