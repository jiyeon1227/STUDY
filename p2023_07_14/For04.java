package p2023_07_14;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100까지 짝수의 합, 홀수의 합을 구하는 프로그램
		//단, for문 1개와 if ~else문으로 작성

		int odd = 0, even = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				even += i;
			}else {
				odd += i;
			}
		}
		System.out.println("1~100까지의 홀수의 합: " + odd);
		System.out.println("1~100까지의 짝수의 합: " + even);
	}

}
