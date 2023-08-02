package p2023_08_02;

import java.util.*;

//Collection05와 비슷하지만 이 예제는 제네릭을 사용함

class Collections06 {
	public static void main(String[] args) {
		
		//제네릭(Generic): 자료구조에 한가지 자료형의 데이터만 저장 하도록 해주는 역할
		Vector<String> vec = new Vector<String>();//String만 저장가능

		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
		
		//String 자료형이 아닌데이터를 입력하면 오류 발생
//		vec.add(50);
		
		//제네릭을 사용하게 되면, 자료구조에서 데이터를 구해올 떄 제네릭으로 설정된 자료형은 생략할 수 있다.
		
		//Object get(int index)
		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = vec.get(i);// 다운캐스팅. 자료형 생략가능함
			System.out.println(temp.toUpperCase());
		}
	}
}
