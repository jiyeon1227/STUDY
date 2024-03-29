package p2023_07_27;

// 부모 클래스안의 필드는 자식 클래스에게 상속된다.
class Point2D {// 부모 클래스
	protected int x = 10; // private int x=10; private이면 자식이라도 외부클래스로 인식 -> 상속받지못함
	protected int y = 10; // private int y=20; private이면 자식이라도 외부클래스로 인식 -> 상속받지못함
}

class Point3D extends Point2D {// 자식 클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + ", " + z);
	}
}

class SuperSub04 {
	public static void main(String[] args) {
		Point3D pt = new Point3D();
		pt.print();
	}
}