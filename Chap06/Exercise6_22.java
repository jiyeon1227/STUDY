package Chap06;

public class Exercise6_22 {

	static boolean isNumber(String str) {

		if (str == null || str == "") {
			return false;
		}

		// 풀이
		// String클래스의 charAt(int i)메서드를 사용하면 문자열의 i번째 위치한 문자를 얻을 수 있다.
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				return false;
			}
		} // for
		return true;

		// 유니코드값 이용한 방법
		// toCharArray()는 문자열을 한 글자씩 쪼개서 char 차입의 배열에 집어 넣어주는 메서드
//		char[] ch = str.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			if (ch[i] > '9' || ch[i] < '0') {
//				return false;
//			}
//		}
//		return true;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123";
		System.out.println(str + "은 숫자입니까? " + isNumber(str));

		str = "123o";
		System.out.println(str + "은 숫자입니까? " + isNumber(str));
	}

}
