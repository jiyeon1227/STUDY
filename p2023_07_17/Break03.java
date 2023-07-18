package p2023_07_17;

//p.157 BreakExample
public class Break03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =0;
		while(true) {
			i++;
			int num =(int)(Math.random()*6) + 1;//난수발생
				System.out.println(num);
			if(num == 6) {
				break;//무한루프 빠져나옴
			}
		}
		System.out.println("프로그램 종료");//6이 나와야 프로그램 종료
		System.out.println("루프가 돌가간 횟수: " + i);
	}

}
