package p2023_07_18;

//p.195 ArrayCopyByForExample

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 복사 : for문으로 배열 복사
		 
		int[] oldArray = {10,20,30};//원본 배열
		int[] newArray = new int [5];//새로운 배열 (int형이기때문에 0으로 초기화되어있음)
		
		for (int i =0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];//배열복사
		}
		
		//기본 for문
		for(int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i] + ",");
		}
		
		//향상됨 for문
		for(int i : newArray) {
			System.out.print(i + "\t");
		}
		
		

	}

}
