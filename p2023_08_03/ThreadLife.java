package p2023_08_03;

//멀티 스레드 프로그램

public class ThreadLife implements Runnable {// 인터페이스를 상속받을때는 implements

	public void run() {// 메서드 오버라이딩
		for (int i = 1; i < 21; i++) {
			// thread의 이름과 정수 출력
			System.out.println(Thread.currentThread().getName() + " number = " + i);//getName()은 쓰레드이름을 가져오는것
		}
	}

	public static void main(String[] args) {
		
		//Runnable 클래스를 상속받은 클래스가 ThreadLife니까 ThreadLife객체를 생성
		ThreadLife tl = new ThreadLife();

		// 첫 번째 Thread 생성
		Thread first = new Thread(tl, "first1");
		// 두 번째 Thread 생성
		Thread second = new Thread(tl, "second1");
		// 세 번째 Thread 생성
		Thread third = new Thread(tl, "third1");

		//멀티스레드이기때문에 second, first, third가 번갈아가며 출력됨
		//먼저 호출한게 다 끝나고 그 다음이 호출되는게 아님(이걸 제어하는게 우선순위)
		second.start();// 실행 가능한 상태
		first.start();
		third.start();
	}
}
