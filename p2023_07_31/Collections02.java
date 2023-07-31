package p2023_07_31;

/*
 ii. List 인터페이스 - ArrayList (상속받는 클래스)

    1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
      ex) int, double, char, boolean, String etc
    2. 순서있는 입.출력 처리(index번호 순으로 저장됨)
    3. 중복된 Data를 저장 할 수 있다.
 */

import java.util.*;

class Collections02 {

	public static void main(String[] args) {

// 		List는 인터페이스이기 때문에 자체적으로 객체를 생성할 수 없다.
//  	List list = new ArrayList();
		
		//방법1 
		List list = new ArrayList();// 업캐스팅
		//방법2
//		ArrayList list = new ArrayList();
		//단, 방법1, 2를 동시에 사용할 수 없음
		
		//boolean add(Object e)
		list.add("하나");// 업캐스팅
		list.add(2);
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);

		System.out.println(list);

	}
}
