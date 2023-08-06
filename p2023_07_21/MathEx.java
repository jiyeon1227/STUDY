package p2023_07_21;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Math클래스
		// Math클래스 = 정적필드 + 정적메서드
		
		//Math클래스는 생성자가 제공되지 않기 때문에, Math클래스로 직접 객체를 생성못함
		//Math m = new Math();// 오류
		
		System.out.println("E= " + Math.E);//오일러 상수
		System.out.println("PI= " + Math.PI);//원주율
		
		System.out.println("abs()= " + Math.abs(-10));//abs는 절댓값
		System.out.println("ceil()= " + Math.ceil(3.14));//ceil은 올림(4.0 출력)
		System.out.println("round()= " + Math.round(10.5));//round는 반올림
		System.out.println("floor()= " + Math.floor(10.9));//floor는 내림(10.0 출력)
		System.out.println("max()= " + Math.max(10, 20));//max는 최대값 구하기 (매개변수 2개짜리만 가능함)
		System.out.println("min()= " + Math.min(10, 20));//min는 최대값 구하기 (매개변수 2개짜리만 가능함)
		System.out.println("pow()= " + Math.pow(2, 3));//pow는 제곱 -> 2의 3제곱(8.0 출력)
		System.out.println("random()= " + Math.random());//random은 난수 발생
		
		int d =(int)(Math.random()*6) + 1;//1~6 난수 발생 
		System.out.println("주사위 번호: " + d);
		
		int r = (int)(Math.random()*45) + 1;//1~45 난수 발생 
		System.out.println("로또번호: " + r);//중복을 제거하려면 배열을 사용해야함
		
		System.out.println("sqrt()= " + Math.sqrt(9));// sqrt는 제곱근(루트)
		System.out.println("sqrt()= " + Math.sqrt(5));
	}

}
