package p2023_07_18;

public class ArrayEx06 {
	
	//p.198 AdvancedforExample

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//향상된  for문(확장 for문)
		//형식 : for(변수: 순차적인 자료구조(배열, 컬렉션)){
				//	실행될 문자;
			//}
		
		int[] scores = {95, 71, 84, 93, 87};
		
		//1. 기본 for문
		int sum = 0;
		for (int i = 0; i <scores.length; i++)
			sum += scores[i];
		System.out.println("총합: " + sum);
		
		//2. 향상된 for문
		int sum1 = 0;
		for (int score : scores) {
			sum1 = sum1 + score;
		}
		System.out.println("총합: " +sum);
		
		double avg = (double) sum /scores.length;
		System.out.println("평균: " + avg);
	}

}
