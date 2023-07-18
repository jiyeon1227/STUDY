package p2023_07_17;

public class MethodEx02 {
	
	//1~n 까지 합을 구하는 메서드
	public static void sum(int n) {
			int hap = 0;
			for (int i = 1; i <=n; i++) {
				hap +=i;
			}
			System.out.println("i~" + n + "=" + hap);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(3);

	}

}
