package p2023_07_18;

public class ArrayEx05 {
	
	//p.182 ArrayCreateByValueListExample2

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		//int[] scores = new int[] {83,90,87}; //이렇게 배열 선언 할 수 있음
		
		int sum1 =0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		//add메서드를 호출해서 리턴된 총점을 sum2에 저장
		int sum2 = add(new int[] {83, 90, 87});//add 메서드 호출
		System.out.println("총합: " + sum2);
		System.out.println();

	}
	
	//사용자정의 메서드: 합을 구해서 리턴해주는 메소드
	public static int add(int []scores) {//call by reference 방식
		int sum =0 ;
		for(int i=0; i<3; i++) {
			sum +=scores[i];
		}
		return sum;
	}

}
