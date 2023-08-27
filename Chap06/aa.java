package Chap06;

public class aa {
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard {
	int num =1;
	boolean isKwang = true;
	
	SutdaCard(){}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		if(isKwang == true){
			return num+"K";
		}
		else {
			return num + "";
		}
	}
}

