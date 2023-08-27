package Chap06;

public class Ex6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. My Math 클래스 작성 (메서드 작성)
		//2. My Math 객체 생성
		//3. My Math 객체 사용 (객체의 메서드 호출)
		
		MyMath mm = new MyMath();// 2. MyMath 객체 생성
		
		// 3. MyMath 객체 사용(객체의 메서드 호출)
		long result1 = mm.add(5, 3);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printGugudan(3);
		mm.printGugudan(12);
	
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		int result5 = mm.max(3, 5);
		System.out.println(result5);


	}

}

class MyMath{// 1. MyMath클래스 작성 (메서드 작성)
	
	long add (long a, long b) {
		long result = a + b;
		return result; // 작업을 마치면 호출한 곳으로 돌아감 
		// return a+b; // 위에 있는 두줄을 한줄로 작성할 수 있음
	}
	
	long subtract(long a, long b) {
		return a-b;
	}
	
	long multiply(long a, long b) {
		return a * b;
	}
	
	double divide(double a, double b) {
		return a/b;
	}
	
	void printGugudan(int dan) {
		//입력받은 단이 2~9가 아니면 메서드 반환
		//if(dan<2 || dan>9) return;// 내가 쓴거
		if(!(2<=dan && dan <=9)) return;
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	
	//Q. 두 값을 받아서 줄중에 큰 값을 반환하는 메서드 작성
	int max(int a, int b) {// 내가 쓴 코드
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	int max2(int a, int b) {// 강사님 코드
		return a > b ? a:b; 
	}
	

}