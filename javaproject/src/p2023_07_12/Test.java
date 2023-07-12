package p2023_07_12;

//java.lang패키지 안에 들어있는 클래스는 import를 생략할 수 있다.
//import java.lang.String;
//import java.lang.System;
//import java.util.*; -> 모든걸 임포트함 이걸 쓰면 Date, Random패키지를 import 안해도 됨 
import java.util.Date;
import java.util.Random;

public class Test {
// public은 접근 제어자 Test는 사용자 정의 클래스(개발자가 정의)

	// main()메서드는 JVM이 가장 먼저 호출하는 메서드
	// 1개의 클래스가 독립적으로 실행되기 위해 반드시 main메서드 필요
	public static void main(String[] args) {
		// public은 접근 제어자 static은 정적메서드 main 메서드

		System.out.println("hello world!");
		System.out.println("자바");
		System.out.println("파이썬");
		
		Date d = new Date();
		System.out.println(d);
		
		Random r = new Random();
		System.out.println (r.nextInt(10)); // 0~9 난수 
	}

}
