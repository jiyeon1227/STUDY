package p2023_07_21;

class FinalMember {
	final int a = 10; // 상수(값을 수정 할 수 없음) -> 기본 필드 앞에 final를 붙이면 상수가됨

	public void setA(int a) {
		this.a = a; // 상수는 값을 수정할 수 없기 때문에 오류가남
	}
}

public class FinalTest01 {
	public static void main(String[] args) {
		FinalMember ft = new FinalMember();
		final int a = 1000;
		ft.setA(100);// 전달되는 값으로 a를 수정 할 수 없음 (a가 상수이기 때문)
		System.out.println(a);
	}
}
