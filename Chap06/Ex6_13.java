package Chap06;

class Car2{
	String color;// 색상
	String gearType;// 변속기 종류 - adto(자동), manuak(수동)
	int door;// 문 갯수
	
	Car2(){
		this("white","auto",4);
	}
	
	Car2(String color){
		this(color, "auto",4);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class Ex6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1 => " + c1.color + c1.gearType + c1.door);
		System.out.println("c2 => " + c2.color + c2.gearType + c2.door);
	}

}
