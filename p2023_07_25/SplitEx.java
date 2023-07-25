package p2023_07_25;

import java.util.StringTokenizer;

public class SplitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String[] split(String regex)
		
		String jumin = "123456-1234567";
		
		//방법1. StringTokenizer 사용
		StringTokenizer st = new StringTokenizer(jumin, "-");
		
		String j1 = st.nextToken();
		String j2 = st.nextToken();
		
		System.out.println("주민번호 앞자리: " + j1);
		System.out.println("주민번호 뒷자리: " + j2);
		
		//방법2. split() 사용 -> 많이 사용함
		String[] j = jumin.split("-");
		
		System.out.println("주민번호 앞자리 : " + j[0]);
		System.out.println("주민번호 뒷자리 : " + j[1]);
		
		for(int i=0; i<j.length; i++) {
			System.out.println(j[i]);
		}
		
		//향상된 for문
		for(String s : j) {
			System.out.println(s);
		}
		
		//split는 사용하기사 편해서 많이 사용함
		//전화번호
		String tel = "010-1234-5678";
		String[] t = tel.split("-");
		System.out.println("전화번호 앞자리: " + t[0]);
		System.out.println("전화번호 중간자리: " + t[1]);
		System.out.println("전화번호 끝자리: " + t[2]);
		
		//이메일
		String email = "kuromi@naver.com";
		String[] e = email.split("@");
		System.out.println("아이디: " + e[0]);
		System.out.println("도메인: " + e[1]);
			
		
	}

}
