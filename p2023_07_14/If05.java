package p2023_07_14;

public class If05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//p.139~140 IfDiceExample
		//주사위 번호 1~6 랜덤 뽑기
		
		//난수 발생 공식
		//난수 = (정수화) (Math.random() * (상한값(가장 큰 값) - 하한값(가장 작은 값) +1)) + 하한값;

		//난수 발생 : 0.0 <= Math.random() <1.0
		//api문서를 보면 math 클래스는 전부 정적(static)필드, 정적메서드이기때문에 생성자를 생성하면 오류발생함
		System.out.println("E=" + Math.E);//E는 자연로그 E
		System.out.println("PI=" + Math.PI);//PI는 원주율
		System.out.println(Math.random());//난수발생
		
		int num = (int)(Math.random()*6) + 1;//5.999999를 int형으로 형변환 하면 소수점밑으로는 버리니까 +1
											//0.0이나 오면 1이 안되니까 +1
		
		System.out.println("num= " + num);
		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
		
		
		//1~45사이의 난수 발생해서 출력
		int r = (int)(Math.random()*45) + 1;
		System.out.println("난수는 " + r +" 입니다.");
	}

}
