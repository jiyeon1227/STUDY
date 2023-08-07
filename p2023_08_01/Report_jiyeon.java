package p2023_08_01;

import java.util.TreeSet;

// 과제. 1~45 사이의 정수중에서 6개의 숫자를 추출하는 로또 프로그램
//1) Set 자료구조를 사용해서 중복 숫자가 나오지 않도록 작성
//2) 추출된 6개의숫자를 오름차순으로 정렬
public class Report_jiyeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet hs = new TreeSet();
		
		while(hs.size() < 6) {
			hs.add((int)(Math.random()*45 +1));
		}
		
		System.out.println(hs);
	}

}
