package p2023_08_03;

// 2023_08_04 과제풀이 2
// 그래픽으로 출력

import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Report2 extends JFrame implements Runnable {// Clock

	private JTextField jf;// 프레임을 만들어줌

	public Report2() {
		//첫 번째 줄에 써야됨 왜인지 못들음 ㅋ
		super("스레드를 이용한 시계");// super는 자기 부모의 생성자 호출
		setLayout(new FlowLayout());// FlowLayout은 배치 관리자

		jf = new JTextField(20);
		add(new JLabel("현재시간:"));
		add(jf);

		setSize(350, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// setDefaultCloseOperation은 JFrame창닫기 이벤트
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		while (true) {
			try {
				Date d = new Date();
				jf.setText(sd.format(d));
				Thread.sleep(1000);// 1초에 한번씩 출력
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Report2 c = new Report2();
		Thread t = new Thread(c);
		t.start();
//		t.run();		
	}

}
