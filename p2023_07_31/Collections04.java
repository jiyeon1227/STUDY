package p2023_07_31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Collections04 {

	public static void main(String[] args) {
		List list = new ArrayList();// 업캐스팅
//	ArrayList list = new ArrayList();

		list.add("하나");
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);
		
		//리스트 출력방법 1
		System.out.println(list);

		// Object get(int index)
		System.out.println(list.get(2));// 인덱스 2번 원소 추출: 3.42
		System.out.println(list.get(4));// 인덱스 4번 원소 추출: five

		// Object get(int index)
		for (int i = 0; i < list.size(); i++) {
//  		System.out.println( i + " 번째 요소는 " + list.get(i));
			Object s = list.get(i);
//			String s =(String)(list.get(i));
			
			//리스트 출력방법 2
			System.out.println(s);
		}
		
		//향상된 for문
		//for(변수 : 순차적인 자료구조) -> 배열쪽에 개념 있음
		for(Object s : list) {
			System.out.print(s + "\t");
		}
		System.out.println();

		// 반복자로 값들을 한꺼번에 가져와서 elements 변수에 저장하고 루프를 돌림
		Iterator elements = list.iterator();
		while (elements.hasNext()) {// 가져올 데이터가 있을 때만 true리턴
			System.out.println("\t\t" + elements.next());//next(): 데이터를 1개씩 가져오는 역할
		}	

	}
}
