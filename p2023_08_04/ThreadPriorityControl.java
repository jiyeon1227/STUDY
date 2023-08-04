package p2023_08_04;

public class ThreadPriorityControl implements Runnable {

	public void run() {
		for (int i = 1; i < 11; i++) {
			// thread의 이름과 정수 출력
			System.out.println(Thread.currentThread().getName() + " number =" + i);// currentThread는 정적메서드이기 때문에 객체생성을
																					// 안함
																					// getName()는 생성자 두번째 매개변수값을 가져옴
		}
	}

	public static void main(String[] args) {

		ThreadPriorityControl tl = new ThreadPriorityControl();

		
		// 우선순위는 값이 클수록 높은 우선순위를 가짐 (예 -> 10>1)
		// 최고순위(MAX_PRIORITY:10)
		// 순위 미지정(NORM_PRIORITY:5)
		// 최저순위(MIN_PRIORITY:1)

		// 첫 번째 Thread 생성
		Thread first = new Thread(tl, "first1");
		// 최저순위(1)로 설정하는 부분
		first.setPriority(Thread.MIN_PRIORITY);// first의 우선순위를 1로 설정
		System.out.println("first priority = " + first.getPriority());

		// 두 번째 Thread 생성
		Thread second = new Thread(tl, "second1");
		// 최고순위(10)로 설정하는 부분
		second.setPriority(Thread.MAX_PRIORITY);// second의 우선순위를 10으로 설정
		System.out.println("second priority = " + second.getPriority());

		// 세 번째 Thread 생성(우선순위를 설정하지 않은 경우)
		Thread third = new Thread(tl, "third1");// third는 우선순위를 설정하지 않아서 기본값인 5로설정
		System.out.println("third priority = " + third.getPriority());

		// 우선순위만으로 스레드를 제대로 제어 할 수 없음
		first.start();
		second.start();
		third.start();
	}
}
