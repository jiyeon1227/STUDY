package chap05.sec02;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[3];//int배열 생성
		for(int i=0; i<3; i++) {//배열값 출력
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		arr1[0] = 10;//0번째 자리에 10저장
		arr1[1] = 20;//1번째 자리에 20저장
		arr1[2] = 30;//2번째 자리에 30저장
		for(int i=0; i<3; i++) {//배열값 출력
			System.out.println("arr1[" + i +"] : " +arr1[i]);
		}
		
		double[] arr2 = new double[3];//double배열 생성
		for(int i=0; i<3; i++) {//배열값 출력
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		arr2[0] = 0.1;//0번째 자리에 0.1저장
		arr2[1] = 0.2;//1번째 자리에 0.2저장
		arr2[2] = 0.3;//2번째 자리에 0.3저장
		for(int i=0; i<3; i++) {//배열값 출력
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];//string배열 생성
		for(int i=0; i<3; i++) {//배열값 출력
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		arr3[0] = "1월";//0번째 자리에 1월저장
		arr3[1] = "2월";//1번째 자리에 2월저장
		arr3[2] = "3월";//2번째 자리에 3월저장
		for(int i=0; i<3; i++) {//배열값 출력
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
	}

}
