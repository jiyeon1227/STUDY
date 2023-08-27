package Chap06;

public class Ex6_1 {// main메서드가 있는 class의 이름이 (Ex6_1) 소스파일 이름과 일치해야함
					// 이클립스가 소스파일을 찾질 못해서 실행을 못함
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 생성
		Tv t;// 리모컨 선언
		t = new Tv();// 객체 생성(객체 = 필드 + 메서드), 리모컨이 객체와 연결됨
		
		// 객체 사용
		t.channel = 7;// 값 변경
		t.channelDown();// channelDown 호출
		System.out.println(t.channel + "이 현재 채널입니다.");
		

	}

}

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {++channel;}
}






