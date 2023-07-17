package p2023_07_17;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 : 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조
		//변수를 확장한게 배열 -> 배열을 확장한게 자료구조 list
		
		//1차원 배열 첫번째 형식 : 배열에 저장될 값이 정해져 있지 않는 경우에 주로 사용하는 형식
		int[] score = new int[3];
	  //자료형[] 배열변수 = 연산자 자료형[베열의 크기]
		
		//int형 배열은 자동으로 0으로 초기화되어있음
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		score[0] = 80; //0번방에 80점 할당
		score[1] = 90;
		score[2] = 100;
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
			
		
		//1차원 배열 두번째 형식 : 배열 선언과 동시에 초기화를 할 때 주로 사용되는 형식 (배열에 할당될 값이 정해져 있는경우 주로 사용)
		

	}

}
