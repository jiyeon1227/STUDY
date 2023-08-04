package p2023_08_03;

// 2023_08_04 과제풀이 1
// 콘솔로 출력

import java.text.SimpleDateFormat;
import java.util.Date;

public class Report1 implements Runnable {// ThreadEx

	@Override
	public void run() {
		// TODO Auto-generated method stub
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");

		// 시간을 출력하기 위해 무한루프돌림
		while (true) {
			try {
				Date d = new Date();// 예외가 발생할 문장이 아니기 때문에 try문 안/밖 상관없음
				System.out.println(sf.format(d));// 예외가 발생할 문장이 아니기 때문에 try문 안/밖 상관없음

				// 1초동안 block 상태로 빠짐(1초에 한번씩 출력)
				Thread.sleep(1000);// 반드시 try 안에 있어야함(sleep이 형식)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Report1 tx = new Report1();// 객체 생성
		Thread t = new Thread(tx);// 스레드 객체 생성
		t.start();
	}

}
