class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();// 2. My Math 객체 생성
		// 3. My Math 객체 사용 (객체의 메서드 호출)
		long result = mm.max(5, 3);
		long result1 = mm.add(5L, 3L);// add메서드 호출
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printGugudan(12);// 12면 조건식이 참이되어 함수가 종료됨

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}

class MyMath {// 1. My Math 클래스 작성 (메서드 작성)
	long add(long a, long b) {
		long result = a + b;
		return result; // 작업을 마치면 호출한 곳으로 돌아감
		// return a + b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}

	// 두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오
	long max(long a, long b){
		long result = 0;
		result = a > b ? a: b;
		return result;
	}
	

	long subtract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}
	
	void printGugudan(int dan) {
		if(!(2<=dan  && dan <=9)) return; // 입력받은 단이 2~9가 아니면, 메서드 종료하고 돌아가기
		for(int i=1; i<=9; i++) {
			System.out.printf("%d *%d =%d%n", dan, i, dan * i);
		}
	}
	
	long max2(long a, long b){// 참, 거짓일때 둘다 return문 써줘야됨
		if(a>b)
			return a; // 조건식이 참일때만 실행
		else
			return b;// 조건식이 거짓일 실행
	}
}

// 1. My Math 클래스 작성 (메서드 작성)
// 2. My Math 객체 생성
// 3. My Math 객체 사용 (객체의 메서드 호출)
