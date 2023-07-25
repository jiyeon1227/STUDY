package p2023_07_25;

import java.util.*;

class StringTest04 {
	
	//StringTokenizer : 특정 문자열에서 구분기호를 이용해서데이터를 파싱한 다음 문자열(토큰)을 구해오는 경우에 사용
	//토큰(token) : 이순신, 을지문적, 강감차느 광개토대왕

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("이순신#을지문덕#강감찬#광개토대왕", "#");// #을 기준으로 문자열 파싱(특정 문자기준으로 문자 자름)
/*
		//nextToken은 토큰을 구해오는 메서드
		System.out.println(str.nextToken());//이순신 출력 -> 제일 첫번째 문자를 가져옴
		System.out.println(str.nextToken());//을지문덕 출력 -> 그 다음 문자를 가져옴
		System.out.println(str.nextToken());//강감찬 출력 -> 그 다음 문자를 가져옴
		System.out.println(str.nextToken());//광개토대왕 출력 -> 그 다음 문자를 가져옴
		System.out.println(str.nextToken());//토큰은 4개뿐인데 그이상 출력해서 오류발생
*/
		
		// 파싱된 문자열이 모두 몇 개인지 되는지 알려줌
		int cnt = str.countTokens();
		System.out.println("파싱할 문자열의 총갯수 -> " + cnt);

		System.out.println(str.nextToken());
		
		//hasMoreTokens는 토큰이 있으면 true가됨
		while (str.hasMoreTokens()) { // 토큰이 있으면
			System.out.print(str.nextToken());// 차례대로 파싱된 문자열을 얻어온다.
		}

	} // main() end

}