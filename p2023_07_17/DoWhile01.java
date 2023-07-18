package p2023_07_17;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//do ~ while문으로 사랑해요 메세지 10번 출력하는 프로그램
		
		//do ~ while문은 조건식이 거짓인 경우에도 최소 1번 실행됨
		int i =1;//초기값 -> DoWhile문 바로 위에 초기값 설정
		do {
			System.out.println(i + "HI");
			i++;//증감식
		} while(i <= 10);//조건식 -> 세미콜론 필수 !

	}

}
