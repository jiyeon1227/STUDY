package p2023_07_14;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//구구단(2단 9단)전체를 출력하는 프로그램
		//다중 for문
		
		for (int dan = 2; dan<10; dan++) {
			System.out.println("["+ dan + "단]");
			
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" +dan*i);
			}
			System.out.println();
			
		}
	}

}
