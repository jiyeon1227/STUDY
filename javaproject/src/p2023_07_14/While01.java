package p2023_07_14;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//while문을 사용해서 메세지 10번 출력하는 프로그램
		
		//while문 위에 초기값을 설정해야함
		int i = 1;
		while(i <= 10) {
			System.out.println(i + "사랑해요 ~");
			i++;//이거 안하면 무한루프
		}
	}

}
