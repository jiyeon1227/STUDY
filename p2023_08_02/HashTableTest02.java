package p2023_08_02;

import java.util.*;

//p2023_08_01 HashTableTest은 제네릭을 사용하지 않은 예제
class HashTableTest02 {
	public static void main(String[] args) {
		
		//제네릭을 설정해서 Hashtable객체를 생성하고 있으며, key자료형은 String형, value값의 자료형도 String형으로 설정되어있다.
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		//입력할 때는 put
		//put(Object key, Object value)
		ht.put("사과", "Apple");
		ht.put("딸기", "StrawBerry");
		ht.put("포도", "Grapes");
//		ht.put("포도", 30);//String형만 저장할 수 있음
		
		// 방법1. key를 알고 있는 경우에 사용하는 방법
		// 제네릭을 설정하면, get()메서드로 key를 이욯해서 value값을 수해올때 Object형을 자식클래스형으로 형변환할 때 자료형을 생략할 수 있다.
		//Object get(Object key)
		String Val = ht.get("포도");// (String)생략가능
		if (Val != null) {
			System.out.println("포도-> " + Val);
		}
		
		// 방법2. key를 모르는 경우에 사용하는 방법
		// 열거형(Enumeration) -> 사과, 딸기, 포도 순으로 키값을 Enum에 저장
		Enumeration<String> Enum = ht.keys(); // 해쉬 테이블의 키 요소들에 대한 Enumeration 객체 반환
		while (Enum.hasMoreElements()) {//hasMoreElements는 키값이 있을때 true 반환
			String k = Enum.nextElement();
			String v = ht.get(k);
			System.out.println(k + " : " + v);
		}
	}
}