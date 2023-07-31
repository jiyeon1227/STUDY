package p2023_07_28;

public abstract class AbsClass {// 추상클래스
	int a;
	

	//추상 메서드: 메서드 이름만 있고, 내용을 가지고 있지 않은 메서드
	public abstract void check();// 추상 메서드
	public void check01() {
		System.out.println("일반 메서드");
	}

}
