package p2023_08_03;

//Thread(쓰레드) : 1개의 process를 구성하는 논리적인 작업단위

//자바에서 Thread를 만드는 방법
//1. Thread 클래스를 상속 받아서 만드는 방법 -> ThreadEnd 파일
//2. Runnable 인터페이스를 상속 받아서 만드는 방법 -> RunnableTest 파일

public class RunnableTest implements Runnable {

	@Override
	public void run() {// 실행중인 상태
		// TODO Auto-generated method stub

		for (int i = 1; i <= 20; i++) {
			System.out.println("number = " + i);
		}

		// 1부터 20까지 화면에 출력시키는 메소드
//		public void printNumber() {
//			for (int i = 1; i <= 20; i++) {
//				System.out.println("number = " + i);
//			}
//		}
		//
//		public void run() {
//			printNumber();
//		}
	}

	public static void main(String[] args) {
		// 객체 생성
		RunnableTest tt = new RunnableTest();

		// Thread 클래스 객체 생성
		Thread t = new Thread(tt);// Runnable상태일때 이 코드가 추가됨

		// Thread를 시작시킴
		t.start();// 실행 가능한 상태 : run()메서드가 자동으로 호출됨

		// main()내에서 화면에 101부터 120까지 출력
		for (int i = 101; i <= 120; i++) {
			System.out.println("-------> main number = " + i);
		}
	}

}
