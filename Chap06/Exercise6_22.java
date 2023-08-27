package Chap06;

public class Exercise6_22 {
	
	boolean isNumber(String str) {
		
		if(str == null || str == "") {
			return false;
		}
		
		for(int i=0; i<str.length(); i++ ) {
			?????????? 유니코드 ?????????????
					1~9 조건 -> ?????????
			str.charAt(i);
		}
		return 밍맹뮹~;;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123";
		System.out.println(str+"은 숫자입니까? " + isNumber(str));
		
		str = "123o";
		System.out.println(str+"은 숫자입니까? " + isNumber(str));
	}

}
