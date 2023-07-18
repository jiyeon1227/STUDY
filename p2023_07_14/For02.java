package p2023_07_14;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 ~ 10까지 합을 구하는 프로그램
		int sum = 0; //지역변수 sum
		
		for(int i=1; i<11; i++) {
			sum += i; //sum = sum + i
			System.out.println("1~"+ i + " = " + sum);
		}
		//System.out.println(i);// i 가 지역변수이기때문에 오류발생
		System.out.println("총 합은 " + sum + " 입니다.");
	}

}
