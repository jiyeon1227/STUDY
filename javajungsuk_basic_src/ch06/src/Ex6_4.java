class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();// 2. My Math ��ü ����
		// 3. My Math ��ü ��� (��ü�� �޼��� ȣ��)
		long result = mm.max(5, 3);
		long result1 = mm.add(5L, 3L);// add�޼��� ȣ��
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printGugudan(12);// 12�� ���ǽ��� ���̵Ǿ� �Լ��� �����

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}

class MyMath {// 1. My Math Ŭ���� �ۼ� (�޼��� �ۼ�)
	long add(long a, long b) {
		long result = a + b;
		return result; // �۾��� ��ġ�� ȣ���� ������ ���ư�
		// return a + b; // ���� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
	}

	// �� ���� �޾Ƽ� ���߿� ū ���� ��ȯ�ϴ� �޼��带 �ۼ��Ͻÿ�
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
		if(!(2<=dan  && dan <=99)) return; // �Է¹��� ���� 2~9�� �ƴϸ�, �޼��� �����ϰ� ���ư���
		for(int i=1; i<=9; i++) {
			System.out.printf("%d *%d =%d%n", dan, i, dan * i);
		}
	}
	
	long max2(long a, long b){// ��, �����϶� �Ѵ� return�� ����ߵ�
		if(a>b)
			return a; // ���ǽ��� ���϶��� ����
		else
			return b;// ���ǽ��� �����ϋ� ����
	}
}

// 1. My Math Ŭ���� �ۼ� (�޼��� �ۼ�)
// 2. My Math ��ü ����
// 3. My Math ��ü ��� (��ü�� �޼��� ȣ��)