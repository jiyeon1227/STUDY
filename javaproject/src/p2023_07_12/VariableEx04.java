package p2023_07_12;

public class VariableEx04 {
	//p.68 FloatDoubleExamle

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//실수값 저장
		//double은 8byte, float은 4byte
		//float var1 = 3.14; //컴파일 에러 -> 강제로 형변환을 해줘야함
		float var2 = 3.14f;
		double var3 = 3.14;
		
		float var4 = 0.123456789f;
		double var5 = 0.1234567890123456789;
		
		//정밀도 테스트
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4); //소수점 7자리까지만 정확하게 출력됨(float은 정확성보장 X)
		System.out.println("var5: " + var5); //소수점 15자리까지만 정확하게 출력됨
		
		//e 사용하기
		double var6 =3e6; //10의 6제곱
		float var7 = 3e6F; //10의 6제곱
		double var8 = 2e-3; //10의 -3제곱
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		
	}

}
