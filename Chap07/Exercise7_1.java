package Chap07;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		
		/*
		// 건희오빠쓰 코드 -> 이거 쫌 수정해야됨 10 넘어가면 11로 출력됨
		int num =1;
		for(int i =0; i<cards.length; i++) {
			if(i <10) {
				boolean isKwang = (num == 1 || num == 3 || num==8);
				cards[i] = new SutdaCard(num, isKwang);				
			}else{
				boolean isKwnag = false;
				cards[i] = new SutdaCard(num, isKwnag);
			}
			num ++;
		}
		*/
		
		for(int i=0; i<cards.length; i++) {
			int num = i % 10+1;
			boolean isKwang = (i<10) && (num ==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
		
	}
	
	
	void shuffle(){
		for(int i=0; i<20; i++) {
			int r = (int)(Math.random()*cards.length);
			SutdaCard tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;	
		}
	}
	
	SutdaCard pick(int index){
		if(index < 0 || index >= CARD_NUM){// index의 유효성을 검사한다.
			return null;
		}else{
			return this.cards[index]; // 
		}
		 
	}
	
	SutdaCard pick(){
		int i = (int)(Math.random()*cards.length);
		return pick(i);
		 
	}
	
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()대신 Object클래스의 toString()을 오버라이딩 했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Exercise7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		System.out.println(deck.pick(0));


	}

}
