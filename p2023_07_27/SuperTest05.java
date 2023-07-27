package p2023_07_27;

//상속에서의 생성자
//1. 생성자는 기본적으로 상속이 되지 않는다.
//2. 자식클래스를 이용해서 객체를 생성할때 자식클래스의 생성자(기본생성자,매개변수 있는 생성자 모두 가능)가 호출되면, 
//	부모클래스의 기본생성자가 자동으로 호출된다.

class Point2D05 {// 부모 클래스
	//필드
	protected int x = 10;
	protected int y = 20;

	public Point2D05() {// 기본 생성자
		System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
	}
}

class Point3D05 extends Point2D05 {// 자식 클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + "," + z);
	}

	public Point3D05() {// 기본 생성자 (상속은 되지 않지만, 자식클래스가 호출되면 부모클래스 생성자 자동호출 )
						//자식클래스의 생성자는 기본생성자여도되고, 매개변수를 가져도 상관없다.
						//부모클래스의 생성자는 기본생성자만 자동으로 호출되고, 매개변수가 있으면 super를 통해 호출해야함
		System.out.println("서브 클래스인 Point3D 생성자 호출");
	}
}

class SuperTest05 {
	public static void main(String[] args) {
		Point3D05 pt = new Point3D05();
		pt.print();// 자식클래스의 기본 생성자 호출
	}
}