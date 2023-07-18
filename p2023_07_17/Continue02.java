package p2023_07_17;

public class Continue02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//continue문을 이용해서 1~100 정수중 짝수만 출력
		
		int sum = 0;
		for(int i = 1; i <=100; i++) {
			if(i % 2 == 1) continue;//홀수면 continue아래 문장이 실행되지않음
			sum += i;
			System.out.println("짝수: " + i);
		}
		System.out.println("짝수의 합: " + sum);
	}

}
