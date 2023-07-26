package p2023_07_26;

public class WrapperEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Doouble d = new Double();//오류 발생
		
		Double d1 = new Double(3.14);//박싱
		Double d11 = 3.14;//자동박싱
		
		double n1 = d1.doubleValue();//언박싱
		double n11 = d11;//자동 언박싱
		
		//1. 자료형 변환: "42.195" -->42.195
		Double d2 = new Double("42.195");//박싱
		//문자 데이터의 경우에는 자동 박싱이 되지 않음
//		Double d22 = "42.195";//자동박싱 -> 오류발생(자료형이 안맞기 때문)
		
		double n2 = d2.doubleValue();//언박싱
		double n22 = d2;
		
		//2. 자료형 변환 "42.195" --> 42.195
		double num = Double.parseDouble("42.195");
		System.out.println("num = " + num);
	}

}
