package p2023_08_01;

//2023_08_02 과제 풀이

import java.util.*;

public class Report {// SetTest01

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
//		Set s = new HashSet();// 오름차순 정렬은 안됨
		TreeSet s = new TreeSet();

		Random r = new Random();

		while (true) {
			n = r.nextInt(45) + 1; // 1 ~ 45 난수 발생
			s.add(n);
			if (s.size() == 6) {
				System.out.println(s);
				break;
			}
		}
	}

}
