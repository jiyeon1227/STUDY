package p2023_07_17;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 : 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조
		//변수를 확장한게 배열 -> 배열을 확장한게 자료구조 list
		
		//1차원 배열 첫번째 형식 : 배열에 저장될 값이 정해져 있지 않는 경우에 주로 사용하는 형식
		int[]  score  = new   int[3];
//	    자료형[] 배열변수  = 연산자 자료형[베열의 크기]
		
		//int형 배열은 자동으로 0으로 초기화됨
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		score[0] = 80; //0번방에 80점 할당
		score[1] = 90;
		score[2] = 100;
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		//double 배열은 자동으로 0.0으로 초기화 됨
		double[] d = new double[3];
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
			
		//char 배열은 자동으로 초기화가 되지 않음
		char[]c = new char[3];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		//boolean 배열은 자동으로 false로 초기화됨
		boolean[] b = new boolean[3];
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		//String 배열은 null
		String[] str = new String[3];
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		
		str[0] ="java";
		str[1] ="Oracle";
		str[2] ="Spring";
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		
		//1차원 배열 두번째 형식 : 배열 선언과 동시에 초기화를 할 때 주로 사용되는 형식 (배열에 할당될 값이 정해져 있는경우 주로 사용)
		
		int[] s = {80, 90, 100};//동일한 자료형의 데이터만 저장 할 수 있음
		int[] s1 = new int[] {80, 90, 100};//위와 동일함 두 가지 방식으로 배열을 사용할 수 있음
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		System.out.println("배열의 크기: " + s.length);//length는 배열의크기를 구해줌
		
		for(int i = 0; i <s.length; i++)
			System.out.print(s[i] +"\t");
		System.out.println();
		
		//double 배열
		double[] dd = {3.14, 1.05, 42.65, 50};//50은 정수지만 형변환되어 출력됨 (단, int에 double선언은 안됨)
		
		for(int i =0; i <dd.length; i++)
			System.out.print(dd[i] + "\t");
		System.out.println();
		
		//char 배열
		char[] cc = {'j', 'a', 'v', 'a'};
		for(int i = 0; i < cc.length; i++)
			System.out.print(cc[i] + "\t");
		System.out.println();
		
		//boolean 배열
		boolean[] bb = {true, false, true};
		for(int i =0; i<bb.length; i++)
			System.out.print(dd[i] + "\t");
		System.out.println();
		
		//String 배열
		//방법1
		String[] str1 = {"java", "oracle", "spring", "py"};
		//방법2
		String[] str2 = new String[] {"java", "oracle", "spring", "py"};
		for(int i = 0; i<str1.length; i++)
			System.out.print(str1[i] + "\t");
		

	}

}
