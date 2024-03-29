package p2023_07_27;

class Point2D04 {// 부모 클래스
	protected int x = 10; // 은닉 변수
	protected int y = 20; // 혹은 쉐도우 변수
}

class Point3D04 extends Point2D04 {
	protected int x = 40; // 슈퍼 클래스에 존재하는 멤버변수를
	protected int y = 50; // 서브 클래스에 다시 한 번 정의함

	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + ", " + z); // x와 y는 재 정의된 Point3D 클래스 소속
	}

	
	
	// super : 부모 클래스를 의미함
	//			super는 부모클래스를 의미하기 떄문에, 자식클래스 안에서만 사용가능
	// super.x 는 부모 클래스의 은닉된 필드로 접근 할 때 사용한다.
	// super.x 는 자식 클래스의 메서드 안에서만 사용 할 수 있다.
	
//	System.out.println(super.x); // 오류 발생 -> super는 자식클래스 안에서 사용해야함(super는 부모클래스를 의미하기때문)
	int a = super.x;// 하지만 이렇게 값을 받는건 가능함
	
	
	public void print02() {
		System.out.println(super.x + ", " + super.y + ", " + z); // Point2D 클래스 소속 멤버변수로 접근
	}
}

class SuperTest04 {
	public static void main(String[] args) {
		Point3D04 pt = new Point3D04();
		pt.print(); // 40, 50, 30 // Point3D의 x, y
		pt.print02(); // 10, 20, 30 // Point2D의 x, y
	}
}