package p2023_07_17;

public class DoWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//do ~ while문으로 1~100까지 홀수/짝수의 합을 수하는 프로그램
		
		int i = 1,odd = 0, even = 0;
		
		do {
			if(i % 2 == 0) {
				even += i;
			}else {
				odd += i;
			}
			i++;//조건식
		} while(i <= 100);
		
		System.out.println("1~100 짝수의 합: " + even);
		System.out.println("1~100 홓수의 합: " + odd);
	}

}
