package p2023_07_26;

//p.500 BoxingUnboxingExample

public class WrapperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Boxing
		Integer obj1 =new Integer(100);
		Integer obj2 =new Integer("200");
		Integer obj3 =new Integer("300");
		
		//Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();//자료형 변환 : "200" -> 200
		int value3 = obj3.intValue();//자료형 변환 : "300" -> 300
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}

}
