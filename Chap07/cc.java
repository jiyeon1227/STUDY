package Chap07;

class cc {

	static void action(Robot r ) {
		r.dance();
		
		if(r instanceof DrawRobot) {
			DrawRobot a = (DrawRobot)r;
			a.draw();
		}
		
	}

	
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(),new DrawRobot()  };

		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	} // main
}

class Robot {
	void dance() {
		
	}
	
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println(" 춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void dance() {
		System.out.println(" 노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println(" 그림을 그립니다.");
	}
}