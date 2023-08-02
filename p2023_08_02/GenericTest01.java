package p2023_08_02;

//오류나는 곳은 GenericTest02 랑 바뀐부분 비교하면서 왜 오류나는지 알아보기

class TestClass {
	
	// 필드
	private int member;

	public void setValue(int value) {//값을 수정/할당
		//생성자 대신 set 메서드사용함
		member = value;
	}

	public int getValue() {
		return member;
	}
}

class GenericTest01 {
	public static void main(String[] args) {
		TestClass obj01 = new TestClass();
//		obj01.member = 30;//오류발생 -> member 필드의 접근제어자가 private이기때문에 직접 접근할 수 없음. 따라서 생성자, 메서드가 필요함
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		
		//메서드 오버로딩이 되어있어야 오류가 안남
		obj01.setValue(3.4);// double형으로 메서드 오버로딩이 되어있어야함
		System.out.println("되돌리는 값은->" + obj01.getValue());
		
		obj01.setValue("이해할 수 있다.");// String형으로 메서드 오버로딩이 되어있어야함
		System.out.println("되돌리는 값은->" + obj01.getValue());
	}
}
