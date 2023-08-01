package p2023_08_01;

import java.util.*;
/*
 iii. Vector 클래스

     1.여러가지 자료형의 Data를 모두 저장할 수 있다.
      ex) int, double, char, boolean, String etc
     2. 순서있는 입.출력 처리(index번호 순으로 저장됨)
     3. 중복된 Data를 저장 할 수 있다.
 */

public class VectorConstructor {
	public static void main(String[] args) {

		// 기본적인 vector 생성 방법
		Vector vector1 = new Vector();
		System.out.println("size1=" + vector1.size());
		System.out.println("capacity1=" + vector1.capacity());

		// 초기 capacity만 지정한 생성 방법
		Vector vector2 = new Vector(3);
		System.out.println("size2=" + vector2.size());
		System.out.println("capacity2=" + vector2.capacity());

		// vector에 값을 추가
		vector2.add("gemini");
		vector2.add("johnharu");
		vector2.add("gracedew");
		vector2.add("bidon");
		System.out.println("size2=" + vector2.size());
		System.out.println("capacity2=" + vector2.capacity());

		// 초기 capacity와 증가 capacity를 지정한 생성 방법
		Vector vector3 = new Vector(1, 1);
		vector3.add("opendb");
		System.out.println("size3 = " + vector3.size());
		System.out.println("capacity3=" + vector3.capacity());

		vector3.add("moon");
		System.out.println("size3 = " + vector3.size());
		System.out.println("capacity3=" + vector3.capacity());
	}
}
