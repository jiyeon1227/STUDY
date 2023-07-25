package p2023_07_25;

public class SplitEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String[] split(String regex)

		String text = "홍길동&홍길순, 김길동, 김자바-젼릥";

		String[] names = text.split("&|,|-");// 구분기호가 여러개일때는 |로 구분함

		// 기본 for문 출력
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");

		}

		System.out.println();

		// 향상된 for문
		for (String name : names) {
			System.out.print(name + "\t");
		}
	}

}
