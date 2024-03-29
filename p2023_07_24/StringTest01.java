package p2023_07_24;

// toUpperCase() : 대문자로 변환 해주는 역할
// toLowerCase() : 소문자로 변환 해주는 역할

class StringTest01 {
	
	//String클래스
	//1. String객체를 생성한 후에 메소드에 의해서 값의 변화가 일어나면, 변경된 값을 heap메모리 영역에 다시 저장한다.
	//2. heap메모리 영역에 변경괸 값을 재사용 하기 위해서는 새로운 변수로 변경된 값을 저장해서 사용해야 된다.
	//	 ex) String str2 = str1.toUpperCase();
	//3. heap메모리 영역에 변경된 값을 재사용 할 수 없을 경우에는 GC프로그램이 쓰레기로 인식하고 힙메모리 영역의 데이터를 삭제함
	//   ex)str1.toUpperCase();
	//4. Garbage Collection(GC) 쓰레기 수집 기능 : 재사용할 수 없는 힙메모리 영역의 데이터를 모아서 지워주는 기능
	

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		
		str1.toUpperCase(); // 메서드 호출 후에도
		System.out.println(str1); // str1의 내용은 수정되지 않는다.
		System.out.println(str1.toUpperCase());// 출력만하고 대문자로 바뀐 결과는 지워짐

		String str2 = str1.toUpperCase(); // 메소드의 처리 결과를 str2에 저장해서 재사용이 가능하짐
		System.out.println(str2);
	}
}