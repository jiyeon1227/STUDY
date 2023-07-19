package chap05.sec02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scores 배열 생성
		//int[] scores = {83, 90, 87};랑 같은 뜻
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 =0;//sum1 변수 초기화
		
		for(int i =0; i <3; i++) {//scores배열의 값을 전부 더해서 sum1에 저장
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87});//add메서드 호출
		//add()메서드의 매개값으로 사용하고자 할 때는 반드시 new 연산자를 사용해야함
		
		System.out.println("총합: " + sum2);
		System.out.println();
	}
	
	public static int add(int[] scores) {//총 합을 계산해서 리턴하는 메서드
		int sum = 0;
		for (int i =0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
