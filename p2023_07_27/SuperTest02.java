package p2023_07_27;

//26일 패키지에있는 SuperSub04랑 동일한 내용

class Point2D02 {
	protected int x = 10;// 부모 클래스
	protected int y = 20;// 필드
}

class Point3D02 extends Point2D02 {// 자식클래스
	protected int z = 30;

	//x와 y는 상속 받아 사용하는 멤버변수
	public void print() {
		System.out.println(x + ", " + y + ", " + z); // x와 y는 상속 받아 사용하는 멤버변수
	}
}

class SuperTest02 {
	public static void main(String[] args) {
		Point3D02 pt = new Point3D02();
		pt.print();
	}
}