package p2023_07_31;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	/*
	 TreeSet
	 1. 데이터를 오름차순으로 정렬해서 저장하고 출력하는 기능을 제공한다.
	 2. 중복된 데이터를 저장할 수 없음
	 
	 
	 		오름차순 				내림차순
	 	----------------------------------
	숫자: 작은 숫자부터 큰 숫자			큰 숫자부터 작은 숫자
		 1,2,3,4...				...4,3,2,1
		 
	문자: 사전순 정렬					사전 역순 정렬
		 a,b,c,d...				...d,c,b,a 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet hs = new TreeSet();

		if (hs.add("korea")) {// add메서드는 boolean형으로리턴
			System.out.println("첫 번째 korea 추가 성공");//추가가 잘 되면 true 리턴
		} else {
			System.out.println("첫 번째 korea 추가 실패");
		}
		if (hs.add("japan")) {
			System.out.println("japan 추가 성공");
		} else {
			System.out.println("japan 추가 실패");
		}
		if (hs.add("america")) {
			System.out.println("america 추가 성공");
		} else {
			System.out.println("america 추가 실패");
		}
		if (hs.add("britain")) {
			System.out.println("britain 추가 성공");
		} else {
			System.out.println("britain 추가 실패");
		}
		if (hs.add("korea")) {// 중복된 데이터를 저장할 수 없다.
			System.out.println("두 번째 korea 추가 성공");
		} else {
			System.out.println("두 번째 korea 추가 실패");
		}

		
		//오름차순으로 정렬된 결과 출력
		System.out.println(hs);
		
		//Iterator(반복자)
		Iterator it = hs.iterator();
		while (it.hasNext()) {// hasNext()는 가져올 데이터가 있으면 true를 리턴
			System.out.println(it.next());// next(): 데이터를 1개씩 가져오는 역할
		}
	}
}
