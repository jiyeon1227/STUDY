package Chap07;

public class Exercise7_18 {
	
	static void action(Robot r){
		if(r instanceof DanceRobot) {
			DanceRobot robot = (DanceRobot)r;//리모컨 바꾸기 ~
			robot.dance();
		}
		
		if(r instanceof SingRobot) {
			SingRobot robot = (SingRobot) r;
			robot.sing();
		}
		
		if(r instanceof DrawRobot) {
			DrawRobot robot = (DrawRobot) r;
			robot.draw();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);

	}
}

class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
