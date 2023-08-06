package p2023_07_19;

//p.227 Car + CarExample

class Car{//public을 추가하면 오류발생 -> public은 main메서드 class에 하나만 있어야함
	//field
	String company = "현대";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
}

public class CarExample {//main메서드명이랑 파일명이랑 같아야함
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 생성
		Car myCar = new Car();
		
		//필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}

}
