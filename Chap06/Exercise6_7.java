package Chap06;

class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	} 
	
	double getDistance(int a, int b) {
		double d = Math.sqrt((a-x) * (a-x) + (b-y) * (b-y));
		return d;
	}
	
}

public class Exercise6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPoint p = new MyPoint(1,1);
		
		//p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2));

	}

}
