package p2023_07_24;

public class SubstringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//아래와 같은 주민번호가 있을때, 남자인지여자인지를 판별하는 프로그램
		
		String jumin = "123456-234567";
		
		String str = jumin.substring(7,8);
		if (str.equals("2") || str.equals("4")) {
			System.out.println("여자입니다.");
		}else if(str.equals("1") || str.equals("3")){
			System.out.println("남자입니다.");
		}else {
			System.out.println("잘못된 정보입니다.");
		}
		
		
		//chaarAt 으로 처리
		char c = jumin.charAt(7);
		if(c == '1' || c == '3') {
			System.out.println("남자입니다.");
		}else if(c =='2' || c == '4'){
			System.out.println("여자입니다.");
		}else {
			System.out.println("잘못된 정보입니다.");
		}

	}

}
