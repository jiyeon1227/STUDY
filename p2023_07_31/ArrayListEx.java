package p2023_07_31;

//p.560
//ArrayList

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();// 업캐스팅
		
		list.add("JAVA");
		list.add("JDBC");
		list.add("JSP");// DB가 삽입되면서 인덱스 2번에서 3번으로 이동됨
		list.add(2,"DB");// 인덱스 2번 위치에 DB추가 -> 2번에 있던게 3번으로 밀리면서 그 뒤로 다 밀림
		list.add("iBatis");
		
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		// 인덱스 2번 원소를 구해와서 skill변수에 저장후 출력
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String  str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		//remove(int index): 특정 인덱스 번호를 가진 원소를 삭제하는 역할
		list.remove(2);// DB 삭제
		list.remove(2);// JSP삭제
		list.remove("iBatis");
		
		for(int i=0; i<list.size(); i++) {
			String  str = list.get(i);
			System.out.println(i + ":" + str);
		}

	}

}
