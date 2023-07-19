package p2023_07_19;

public class Animal {
//			사용자 정의 클래스
	
	int age;//필드(field) = 멤버변수 = 전역변수 -> 변수이기 때문에 값을 저장하는 역할
			// 필드 : 메서드 바깥쪽에 정의되는 변수, heap메모리 영역에 저장됨(지역변수는 stack에 저장됨)
	
	public Animal() {//매개변수가 없는 생성자를 기본생성자라고함(Default Constructor)
//			생성자(클래스이름과 동일해야하고, ()를 가져야함)
		
		System.out.println("생성자 호출 성공");
	}

	public static void main(String[] args) {
		// 메인 메서드
		
		//메서드 안에서 정의되면 지역변수가됨
		int a = 10;//지역변수 : stack 영역에 저장 
		
		String str = new String("Javs");
		
		Animal  a1  =    new     Animal();//heap메모리에 age가 생성됨(new연산자 쓸 때 마다 생성)
//		 클래스  레퍼런스변수   연산자    생성자 호출
		
		//age값이 0으로 초기화 되어있는지 확인(기본 자료형은 heap메모리에 자동으로 0으로 초기화됨)
//		System.out.println(age);//이렇게 출력하면 오류 발생함 
								//-> age는 heap메모리에 저장되어있기때문에 접근하기 위해서는 주소값을 참조해야 접근이 가능함
		System.out.println(a1.age);//이렇게 출력해야함
		a1.age = 5;//값을 수정할때도 주소값을 참조하고 수정해야함
		System.out.println(a1.age);
		
		Animal a2 = new Animal();//heap메모리에 age가 또 생성됨
		System.out.println(a2.age);
		
		//a1 주소와 a2 주소 비교
		if(a1 == a2) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
	}

}
