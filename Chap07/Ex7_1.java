package Chap07;

class Tv{// 부모 멤버 5개
	boolean power;// 전원 상태(on/off)
	int channel;// 채널
	
	void power() {power = !power;}
	void channelUp() { ++ channel;}
	void channelDown() { -- channel;}
	
}

// 자식 멤버 2개(부모꺼를 상속받으니까 총 7개)
class SmartTv extends Tv{// CaptionTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;// 캡션상태 (on/off)
	void displayCaption(String text) {
		if(caption) {// 캡션상태사 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

public class Ex7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv stv = new SmartTv();
		stv.channel = 10;// 조상 클래스로부터 상속받은 멤버
		stv.channelUp();// 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("지여니 앙뇽 !");
		stv.caption = true;// 캡션(자막) 기능을 켠다.
		stv.displayCaption("지여니 하윙릥 ~");

	}

}
