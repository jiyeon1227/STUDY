package p2023_07_31;

//p.568~569
//Set 자료구조

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Generic : 자료구조에 1가지 자료향의 데이터만 저장할 수 있도록 해준다.(<>안에 특정자료형을 명시하고, 그 자료형만을 저장할 수
		// 있음)
		Set<String> set = new HashSet<String>();

//		set.add(30);// 오류발생 -> 제네릭을 String으로 설정했기 때문
		set.add("java");
		set.add("JDBC");
		set.add("JSP");
		set.add("java");// 중복된 데이터를 저장 할 수 없다.
		set.add("iBatis");

		int size = set.size();// 저장된 원소의 갯수를 구할때는 size사용
		System.out.println("총 객체수: " + size);

		// 반복자
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		// remove(): 특정 원소를 삭제하는 역할
		set.remove("JDBC");
		set.remove("iBatis");
		System.out.println("총 객체수: " + set.size());

		// 원소 출력
//		iterator = set.iterator();// 반드시 필요한건 아님
		for(String element:set) {
			System.out.println("\t" + element);
		}
		
		// clear(): 모든 원소를 삭제하는 역할
		set.clear();
		if(set.isEmpty()) {//isEmpty(): 해당 자료구조사 비어있을 때 true리턴
			System.out.println("비어있음");
		}	
		
	}

}
