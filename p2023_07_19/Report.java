package p2023_07_19;

public class Report {// ArrayEx0

	// 2023_07_20 과제1 풀이

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] s = new int[8][9]; // 8행 9열

		// 2차원 배열에서 행/열 의갯수 구하는법
		System.out.println("행의 갯수: " + s.length);
		System.out.println("열의 갯수: " + s[0].length);

		/*
		 * // 구구단 세로로 한줄로 출력 for(int dan=0; dan<=7; dan++){ // 행
		 * System.out.println("["+(dan+2)+"단]"); for(int i=0; i<=8; i++){ // 열 s[dan][i]
		 * = (dan+2)*(i+1);
		 * 
		 * System.out.println((dan+2)+"*"+(i+1)+"="+s[dan][i]); }
		 * System.out.println(""); }
		 */

		// 구구단을 각 단별로 출력
		for (int dan = 0; dan <= 7; dan++) { // 행
			for (int i = 0; i <= 8; i++) { // 열
				s[dan][i] = (dan + 2) * (i + 1);
			}
		}
		for (int dan = 2; dan <= 9; dan++)
			System.out.print("[" + dan + "단]\t");
		System.out.println("");
		for (int i = 0; i <= 8; i++) {
			for (int dan = 0; dan <= 7; dan++) {
				System.out.print((dan + 2) + "*" + (i + 1) + "=" + s[dan][i] + "\t");
			}
			System.out.println("");
		}

	}

}
