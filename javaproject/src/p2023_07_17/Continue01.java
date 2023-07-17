package p2023_07_17;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//continue문
		//1. 반복문 안에서 사용되며, 다시 반복문으로 돌아가라는 의미를 가지고 있다.
		//2. continue문이 실행되면, continue문 아랫쪽의 내용들은 실행되지않고 반복문으로 다시 돌아간다.
		for(int i = 1; i <=10; i++) {
			if(i == 5) continue;//5인경우는 continue문을 만났기 때문에 아랫쪽문장을 실행하지않음
			System.out.println("츨력: " + i);
		}
	}

}
