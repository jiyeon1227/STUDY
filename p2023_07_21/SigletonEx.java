package p2023_07_21;

//p.280 Singleton + SingletonExample

class Singleton {
	// 싱글톤(Singleton) : 객체 생성을 1번만 수행하는것
	private static Singleton s = new Singleton();// 정적필드

	private Singleton() {}; // 직접 객체 생성을 막아주는 역할

	// 정적 메서드를 이용해서 공유
	public static Singleton getInstance() {// 정적 메서드
		return s;
	}
	
	public void check() {
		System.out.println("메서드 호출 성공1");
	}
	
	public void check1() {
		System.out.println("메서드 호출 성공2");
	}

}

public class SigletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//private 접근 제어자 때문에 외부 클래스에서 접근할 수 없다.
		//System.out.println(Singleton.s);// 직접 접근하면 private이기 때문에 오류 발생
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		

		System.out.println(obj1);
		System.out.println(obj2);
		
		if(obj1 == obj2) {
			System.out.println("same addr");
		}else {
			System.out.println("diff addr");
		}
		
		//Singleton s = new Singleton();//직접 접근하면 오류 발생
		
		obj1.check();
		obj1.check1();
		obj2.check();
		obj2.check1();
	}

}
