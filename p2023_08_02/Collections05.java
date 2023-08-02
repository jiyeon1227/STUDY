package p2023_08_02;

import java.util.*;

//제네릭을 쓰고 있지 않은 예제 (제네릭을 사용한 예제가 Collection06파일)

class Collections05 {
	public static void main(String[] args) {

		//제네릭을 사용하지 않으면, 여러가지 자료형의 데이터를 모두 저장할 수 있다.
		Vector vec = new Vector();
		
		//boolean add(Object e)
		vec.add("Apple");// 업캐스팅
		vec.add("banana");
		vec.add("oRANGE");
//		vec.add(50);
//		vec.add(3.14);
//		vec.add('k');
//		vec.add(true);
		
		//Object get(int index)
		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = (String) vec.get(i); // 다운 캐스팅
										//제네릭을 사용하지 않을때는 자동 형변환을 하지않기때문에(String)를 생략하면 오류남
//		temp=vec.get(i);
			System.out.println(vec.get(i));
			System.out.println(temp.toUpperCase());
		}
	}
}
