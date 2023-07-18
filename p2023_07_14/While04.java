package p2023_07_14;

public class While04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while문을 이용해서 구구단(2~9단)을 출력하는 프로그램
		int dan =2;
		
		while(dan<10) {
			System.out.println( "[" + dan + "단]");
			
			int i=1;//i초기화 위치가 중요함
			while(i<10) {
				System.out.println( dan + "*" + i + "=" + dan*i);
				i ++;
			}
			dan++;
			System.out.println();
		}

	}

}
