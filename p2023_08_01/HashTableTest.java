package p2023_08_01;

import java.util.*;

/*
 iv. Map 인터페이스  - HashMap, HashTable (상속받는 클래스)
    1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
      ex) int, double, char, boolean, String etc
    2. Data를 저장할 때 Key, Value 를 동시에 저장한다.
    3. key 값은 중복이 되면 안된다.
       만약에 중복된 key가 있으면, 가장 마지막에 설정된 value만 사용할 수 있다.
    4. value값은 중복이 되어도 상관없다.	
*/

class HashTableTest {
	public static void main(String[] args) {
		
		//업캐스팅으로 객체를 생성하면 안되는 경우
		//1. 업캐스팅이 되면 참조 가능한 영역의 축소가 일어난다.
		//2. 업캐스팅이 되면 부모가 상속해준 메서드만 접근할 수 있다.
		//3. keys()메서드는 부모인 Map이 상속해준 메서드가 아니기 때문에 업캐스팅 방식으로 Map객체를 생성하면 사용불가
		
//		Map ht = new Hashtable();// 업캐스팅
		Hashtable ht= new Hashtable();//해시 테이블 방법으로 객체 생성
	
		// 해쉬 테이블에 키/데이터를 입력한다.
		//put(Object key, Object value)
		ht.put("딸기", "StrawBerry");// 업캐스팅
		ht.put("사과", "Apple");
		ht.put("포도", "Grapes");
		ht.put("count", 10);// 자동 박싱 + 업캐스팅

		//방법 1. key를 알고 있는 경우
		// Object get(Object key)
		// 해쉬 테이블의 값을 키를 이용하여 얻는다.
		// Object obj = ht.get("포도");
		String Val = (String) ht.get("포도");// 다운캐스팅 (강제 형변환)
		if (Val != null) {
			System.out.println("포도-> " + Val);
		}
		
		//(자료형) -> 여긴 생략하면 오류남
		String s = (String) ht.get("딸기");// 다운캐스팅
		String a = (String) ht.get("사과");
		
		//2줄
		Integer it = (Integer) ht.get("count");// 다운캐스팅
		int i = it.intValue();// 언박싱
		
		//1줄
		int ii = ((Integer)ht.get("count")).intValue();// 다운캐스팅 + 언박싱

		//방법 2. key를 모르는 경우
		// 열거형(Enumeration) : 딸기, 사과, 포도
		Enumeration Enum = ht.keys();// Map의 모든 key를 구해옴
		while (Enum.hasMoreElements()) {
			Object k = Enum.nextElement();
			Object v = ht.get(k);
			System.out.println(k + " : " + v);
		}
	}
}
