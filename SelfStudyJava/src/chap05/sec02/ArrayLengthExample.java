package chap05.sec02;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {83, 90, 87};//scores배열 생성
		
		int sum = 0;//sum 변수 초기화
		for(int i=0; i<scores.length; i++) {//배열의 길이를 얻기 위한 length -> 배열변수.length;
			sum += scores[i];//scores값 더한걸 sum 변수에 저장
		}
		System.out.println("총합: " + sum);

		double avg = (double)sum / scores.length;
		System.out.println("평균: " + avg);
	}

}
