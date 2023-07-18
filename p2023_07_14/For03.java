package p2023_07_14;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100까지 짝수의 합, 홀수의 합을 구하는 프로그램
		int odd = 0, even = 0;//홀수는 add, 짝수는 even
		
		//지역변수 i
		for (int i=1; i <= 100; i=i+2) {//증감식 i+=2로 써도됨
			odd +=i;//odd = odd + i
		}
		
		//위에 i가 지역변수이기 때문에 재사용가능
		for (int i=0; i <= 100; i=i+2) {//증감식 i+=2로 써도됨
			even +=i;//even = even + i
		}
		
		System.out.println("홀수의 합은 " + odd);
		System.out.println("짝수의 합은 " + even);
		
	}

}
