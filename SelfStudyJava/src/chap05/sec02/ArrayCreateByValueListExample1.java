package chap05.sec02;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {83, 90, 87};//scores 배열 선언
		//{}는 주어진 값들을 항목으로 가지는 배열 객체를 힙에 생성
		//배열 객체의 번지는 스택에 저장
		/* 대충 그림으로 그리면 이런느낌

		 	스택   |    힙
		 		     0   1   2
		 	5번지 ->  83, 90, 87
		 		    5번지
		 		    
		 */
		
		System.out.println("scores[0]: " + scores[0]);//0번째에 저장되어있는 83 출력
		System.out.println("scores[1]: " + scores[1]);//1번째에 저장되어있는 90 출력
		System.out.println("scores[2]: " + scores[2]);//2번째에 저장되어있는 87 출력
		
		int sum = 0;//합계 변수 초기화
		for (int i = 0; i<3; i++ ) {//scores배열값들을 전부 더하는 for문
			sum += scores[i];
			//sum = sum + scores[i]
		}
		
		System.out.println("총합: " + sum);
		double avg = (double) sum /3;//sum은 int형이고, int/int는 int 이기 때문에 형변환을 안하면 소수점 아래로 짤림
		//double avg = sum /3.0;
		
		System.out.println("평균: " + avg);

	}

}
