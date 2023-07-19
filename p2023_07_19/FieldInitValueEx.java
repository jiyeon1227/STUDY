package p2023_07_19;

//p.228 FieldInitValue + FieldInitValueExample

class FieldInitValue{
	//필드
	byte byteField;//정수형: 0을 초기화
	short shortField;
	int intField;
	long longField;
	
	boolean booleanField;//false로 초기화
	char charField;
	
	float floatFiled;//실수형 : 0.0으로 초기화
	double doubleField;
	
	int[] arrField;//null로 초기화
	String referenceField;//null로 초기화
						 //null: 참조할 주소가 없다는 의미
	
}

public class FieldInitValueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FieldInitValue fiv =  new FieldInitValue();
		
		System.out.println("byteField: " + fiv.byteField);
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);
		System.out.println("booleanField: " + fiv.booleanField);
		System.out.println("charField: " + fiv.charField);
		System.out.println("floatFiled: " + fiv.floatFiled);
		System.out.println("doubleField: " + fiv.doubleField);
		System.out.println("arrField: " + fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);
	}

}
