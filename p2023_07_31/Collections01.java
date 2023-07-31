package p2023_07_31;

/*
 i. Set 인터페이스 - HashSet, TreeSet (상속받는 클래스)

   1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
      ex) int, double, char, boolean, String etc
   2. 순서없이 입.출력 한다.
   3. 중복된 Data를 저장하지 못한다.
 */

import java.util.*;

class Collections01 {
	public static void main(String[] args) {
		
		//Set은 인터페이스이기 때문에 자체적으로 객체를 생성할 수 없다.
//		Set s = new Set();// 오류발생
		
		Set set = new HashSet();// 업캐스팅
//		HashSet	set = new HashSet();
		System.out.println("요소의 갯수->" + set.size());// 원소의 갯수를 구할때는 size() 사용
		
		//boolean add(Object e)
		set.add("하나");// 추가가 달 되면 true를 리턴함(add가 boolean이기때문)
		set.add(2);
		set.add(3.42);
		set.add("넷");
		set.add("five");
		set.add(6);
		set.add(6);// 6을 중복입력했지만 한번만 출력됨(중복 데이터를 저장할 수 없음)
		
		System.out.println("요소의 갯수->" + set.size());//Set은 중복데이터를 저장하지 않기때문에 7이아닌 6 출력
		System.out.println(set);// 입력한 순서대로 출력하지않음

		//Iterator(반복자) : 2, 6, 넷, 하나, 3.42, five
		Iterator elements = set.iterator();
		while (elements.hasNext()) {//가져올 데이터가 있을 때 true리턴
			System.out.println("\t\t" + elements.next());
		}//next() : 데이터를 가져오는 역할

		/*
		 * Vector에만 적용 Enumeration enu = set.elements(); while( enu.hasMoreElements()){
		 * System.out.println( enu.nextElement() ); }
		 */
	}
}
