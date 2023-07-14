package p2023_07_14;

public class Report_jiyeon_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//구구단(2~9단)을 열방향(사진 참고)으로 출력하는 프로그램을 작성하세요
		
		int dan, i;
		
		for(dan = 2; dan <10; dan++) {
		System.out.print("[" + dan + "단]" + "\t");
		}
		
		for(i = 0; i <10; i++) {
			for(dan = 2; dan < 10; dan++) {
				System.out.print(dan + "*" + i + "=" + dan*i + "\t" );
			}
			System.out.println();
		}
		
	}

}
