package p2023_07_25;

import java.util.Scanner;

public class JuminCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//키보드로 주민번호를 입력 받아서 남자인지, 여자인지를 판별하는 프로그램
		//단, 주민번호 앞자리는 6자리, 뒷자리는 7자리인지를 유효성 검사를 한다.
		
		Scanner sc = new Scanner(System.in);
		
		//예외처리 try catch : try{예외가 발생할 가능성이 있는 코드}catch{}
		try {
		System.out.println("주민번호 앞자리를 입력하쎄용");
		String jumin1 = sc.nextLine();//문자형태로 입력 받아야 String클래스에서 지원되는 메서드를 사용할 수 있음
		
		System.out.println("주민번호 뒷자리를 입력하쎄용");
		String jumin2 = sc.nextLine();//jumin2 첫글자를 추출해 여자/남자를 판별

		String g = jumin2.substring(0,1);//substring을 사용하여 첫 글자 추출
		
		if(jumin1.equals("")) {//앞자리 입력을 안했을때
			System.out.println("주민번호 앞자리를 입력하세요.");
		}else if(jumin1.length() != 6) {//입력했지만 6자리가 아닌경우
			System.out.println("주민번호 앞 6자리를 입력하세요.");
		}else if(jumin2.equals("")) {//뒷자리 공백을 입력하면 오류발생 -> 21라인에서 substring처리를 못하기 때문. 
									//입출력을 할 때에는 예외처리를 해야함(안하면 프로그램이 비정상 종료됨)
			System.out.println("주민번호 뒷자리를 입력하세요.");
		}else if(jumin2.length()!= 7) {
			System.out.println("주민번호 뒷 7자리를 입력하세요.");
		}else if(g.equals("1") || g.equals("3")) {
			System.out.println("남자입니다.");
		}else if (g.equals("2") || g.equals("4")) {
			System.out.println("여자입니다.");
		}else {
			System.out.println("입력값이 올바르지 않습니다.");
		}
		
		}catch(Exception e) {
			System.out.println("잘못된 정보입니다.");
		}
		
	}

}
