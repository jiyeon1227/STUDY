package p2023_07_21;

import java.util.Random;

public class RamdomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//난수 발생 방법 1. Math.random()
		//			2. Random 클래스
		
		java.util.Random r1= new java.util.Random();//이렇게 해도 됨, 근데 할 때마다 써야하므로 좋은 방법은 아님
		
		//자동 import 단축키 : 컨트롤 + 쉬프트 + O
		Random r = new Random();
		
		//0~9 사이의 난수 발생
		int n1 = r.nextInt(10);
		System.out.println("n1= " + n1);
		
		//1~45 사이의 난수를 발생
		int n2 = r.nextInt(45) + 1;// nextInt(45)는 0부터 44까지 출력됨
		System.out.println("n2= " + n2);
		
		//1~45 사이의 난수를 6개 발생
		for(int i=1; i<=5; i++) {//중복을 없애려면 배열, 조건문을 사용해야함
			System.out.print(r.nextInt(45)+1+"\t");//5개의 난수 출력
		}
		System.out.println();
		
		
		//0.0 <= Math.random() < 1.0
		int n3 = (int)(Math.random()*45)+1;
		System.out.println("n3= " + n3);
		
		for(int i=1; i<=5; i++) {//중복을 없애려면 배열, 조건문을 사용해야함
			System.out.print((int)(Math.random()*45) + 1 + "\t");//5개의 난수 출력
		}
		
	}

}
