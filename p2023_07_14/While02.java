package p2023_07_14;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while문을 이용해서 1~100까지 홀수, 짝수의 합을 구하는 프로그램
		//while문 1개와 if~else문으로작성
		
		int i =1, odd = 0, even = 0;
		while(i <= 100) {
			if (i%2 == 0) {
				even += i;
			}else {
				odd += i;
			}
			i ++;//증감식 안써주면 무한루프
		}
		System.out.println("짝수의 합은 " + even);
		System.out.println("홀수의 합은 " + odd);

	}

}
