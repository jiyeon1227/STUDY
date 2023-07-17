package p2023_07_17;

public class Break02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//무한루프 : while문
		//break : 반복문을 빠져나오는 역할
		
		int i=1;
		while(true) {//true로 하면 항상 참이 되어 무한루프가됨
			/*여기에 if문 있으면 99까지만 실행됨
			if(i == 100) {
				break;
			}
			*/
			System.out.println(i+"무한출력");
			if(i == 100) {//여기에 있어야 100번 실행됨
				break;
			}
			i++;
			/*여기에 if문 있으면 99까지만 실행됨
			if(i == 100) {
				break;
			}
			*/
		}
		

	}

}
