package p2023_07_12;

public class VariableEx03 {
	//p.66 EscapeExample
	// \t : 탭만큼 띄움 
	//  \n : 줄바꿈 
	//  \r : 캐리지리턴
	//  \" : "츨력
	//  \' : '츨력
	//  \\ : \출력

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("번호\t이름\t직업");//탭 잘 들어간거임!
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\"입니다.");
		System.out.println("봄\\여름\\가을\\겨울");
	}

}
