package Chap06;

public class Ex6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Tv t1; t1 = new Tv();를 한문장으로 작성
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1: " + t1.channel);
		System.out.println("t2: " + t2.channel);
		
		t1.channel = 7;
		System.out.println("채널 값 변경");
		
		t2 = t1;// t1의 값을 t2에 저장 -> 원래 가리키던 객체랑 연결이 끊어지고 t1 객체를 가리킴
				// 참조변수가 없는 t2는 GC가 청소함
		System.out.println("t1: " + t1.channel);
		System.out.println("t2: " + t2.channel);
	}

}

//Q. Ex6_1의 Tv class를 어떻게 Ex6_2에서 객체를 생성했는지?
//A. 두 클래스가 같은 패키지에 있으면 가능 
