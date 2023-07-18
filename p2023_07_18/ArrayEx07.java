package p2023_07_18;

public class ArrayEx07 {
	
	//p.187

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length !=2) {
			System.out.println("값의 수가 부족 합니다.");
			
			System.exit(0);//프로그램을 강제로 종료
		}
		
		String strNum1 = args[0];//args[0] ="10"
		String strNum2 = args[1];//args[1] ="20"
		
		//문자를 숫자로 형변환 : "20" ---> 20
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);

		//왼쪽 상단 실행 드롭바 -> run configuration -> argument 탭 -> program argument에 값 입력하고 apply하고 실행
		//자주쓰는 기능은 아니지만 이런 기능이 있다 정도는 알아두기
	}

}
