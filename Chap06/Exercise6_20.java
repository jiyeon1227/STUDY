package Chap06;

public class Exercise6_20 {
	
	static int[] shuffle(int[] arr){

		for(int i=0; i<30; i++) {
			int r = (int)(Math.random()*arr.length);
			int tmp = arr[0];
			arr[0] = arr[r];
			arr[r] = tmp;
			
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}