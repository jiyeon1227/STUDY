package p2023_08_03;

//Thread(쓰레드) : 1개의 process를 구성하는 논리적인 작업단위
// 자바에서 Thread를 만드는 방법
//1. Thread 클래스를 상속 받아서 만드는 방법 -> ThreadEnd 파일
//2. Runnable 인터페이스를 상속 받아서 만드는 방법 -> RunnableTest 파일

public class ThreadEnd extends Thread {

	
	// 스레드 두개가 번갈아 가면서 실행되기 때문에 실행 결과가 매번 달라짐
	
	
	@Override
	public void run() {// 실행중인 상태
		// thread가 시작되면 실행되는 문장
		for (int i = 1; i <= 20; i++) {
			System.out.println("run number = " + i);
		}
	}

	public static void main(String[] args) {
		ThreadEnd tt = new ThreadEnd();
		// thread를 실행시킴
		tt.start();// 실행가능한 상태 : run()메서드가 자동으로 호출됨

		// main()내에서 화면에 101부터 120까지 출력
		for (int i = 101; i <= 120; i++) {
			System.out.println("-------> main number = " + i);
		}
	}

}
