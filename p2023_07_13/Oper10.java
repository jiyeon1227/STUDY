package p2023_07_13;

public class Oper10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//증감연산자
		//++ 1씩 증가 -> ++a(선행처리) a++(후행처리)
		//-- 1씩 감소 -> --a(선행처리) a--(후행처리)
		
		int a= 10, b = 10, c = 10, d = 10;
		int a1, b1, c1, d1;
		
		a1 = ++a;//(선행연산) 1.a값 1 증가 2.증가한 a값 대입
		b1 = b++;//(후행연산) 1.b값 대입 2. b값 1 증가
		c1 = --c;//(선행연산) 1.c값 1감소 2.c값 대입
		d1 = d--;//(후행연산) 1.d값 대입 2.d값 감소
		System.out.println("a1=" + a1 + "a=" + a);
		System.out.println("b1=" + b1 + "b=" + b);
		System.out.println("c1=" + c1 + "c=" + c);
		System.out.println("d1=" + d1 + "d=" + d);

	}

}
