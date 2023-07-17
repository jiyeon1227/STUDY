package p2023_07_17;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//무한루프 : for문
		//break : 반복문을 빠져나오는 역할
		
		//'무한출력'을 100번 출력
		for(int i = 1;;i++) {//;;이렇게 하면 무한루프가 돌아감
			
			/*if문이 여기에 위치하면 99까지만 실행됨
			if(i == 100) {
				break;//i가 실행되고 break문으로 빠져나옴
				}
			*/
			
			System.out.println(i + "무한출력");
			
			if(i == 100) {//if문이 이쪽에 있으면 100까지 실행됨
			break;//i가 실행되고 break문으로 빠져나옴
			}
			
		}

	}

}
