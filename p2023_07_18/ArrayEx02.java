package p2023_07_18;

public class ArrayEx02 {
	
	//p.180 ArrayCreateByValueListExample1

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("총점: " + sum);
		double avg = (double) sum /3;//강제형변환 (안하면 소수점 아래가 다 날라감)
		System.out.println("평균: " + avg);
		
		//평균값을 소수점 2째자리까지 출력
		System.out.printf("평균: " + "%.2f\n", avg);
	}

}
