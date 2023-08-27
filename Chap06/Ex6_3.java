package Chap06;

public class Ex6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Card.width);// cv는 객체 생성 없이 사용 가능함
		System.out.println(Card.height);// cv는 객체 생성 없이 사용 가능함
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1의 종류는 " + c1.kind + " 이고, 숫자는 " + c1.number + c1.width + c1.height);
		System.out.println("c2의 종류는 " + c2.kind + " 이고, 숫자는 " + c2.number + c2.width + c2.height);
		c1.width =50; //c2도 같이 바뀜 -> iv가 아니라는 의미니까 card.width =50; 이렇게 적어줘야 바람직함
		c1.height =80; // card.height =80;
		
		System.out.println("c1의 종류는 " + c1.kind + " 이고, 숫자는 " + c1.number + c1.width + c1.height);
		System.out.println("c2의 종류는 " + c2.kind + " 이고, 숫자는 " + c2.number + c2.width + c2.height);
	}

}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}