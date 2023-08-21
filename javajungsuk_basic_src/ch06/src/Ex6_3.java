class Ex6_3 {
	public static void main(String args[]) {
		System.out.println("Card.width = " + Card.width); // cv는 객체 생성 없이 사용가능
		System.out.println("Card.height = " + Card.height);// cv는 객체 생성 없이 사용가능

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		c1.width = 50; // c2도 같이 바뀜 -> iv가 아니라 cv 라는 의미 => 헷갈리니까 card.width = 50; 이렇게 적어줘야 바람직함
		c1.height = 80;

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
	}
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}