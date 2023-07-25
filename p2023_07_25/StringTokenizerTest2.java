package p2023_07_25;

import java.util.StringTokenizer;

public class StringTokenizerTest2 {

	public static void main(String[] args) {

		String source1 = "한국 미국 태국 중국 이란";// 공백으로 파싱
		StringTokenizer st1 = new StringTokenizer(source1, " ");
		
		//boolean hasMoreTokens() : 가져올 토큰이 있으면 true, 없으먼 flase 리턴
		while (st1.hasMoreTokens()) {
			System.out.println("st1.token:" + st1.nextToken());
		}

		System.out.println();
		System.out.println();

		String source2 = "푸들,삽살개,풍산개,진돗개";
		StringTokenizer st2 = new StringTokenizer(source2, ",");
		while (st2.hasMoreTokens()) {
			System.out.println("st2.token:" + st2.nextToken());
		}

		System.out.println();
		System.out.println();

		//생성자 세번째 자리에 true이 사용되면 구분기호도 하나의 토큰으로 인식함
		StringTokenizer st3 = new StringTokenizer(source2, ",", true);
		while (st3.hasMoreTokens()) {
			System.out.println("st3.token:" + st3.nextToken());
		}

	}

}
