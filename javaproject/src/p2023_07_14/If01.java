package p2023_07_14;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (10 > 5) {
			System.out.println("실행 1");
		}
		
		//실행되는 문장이 1줄인 경우에는 중괄호 {}를 생략할 수 있음
		if(10 > 5) 
			System.out.println("run2");
		
		if(true) {
			System.out.println("실행");
		}
		
		if(false) {
			System.out.println("실행안됨");
		}
		
		//if 문에 중괄호{}가 없으면, if 문 바로 아랫쪽 1줄만 if문의 적용을 받는다.
		if(10 > 30)
			System.out.println("실행안됨");//if문이 거짓이므로 출력안됨
			System.out.println("조건식의 적용을 받지않고 실행됨");//if문이랑 상관없이 출력됨(if문 영향없음)

	}

}
