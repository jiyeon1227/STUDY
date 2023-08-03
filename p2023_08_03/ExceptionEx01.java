package p2023_08_03;

//p.456
//예외처리

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];// 예외발생
			data2 = args[1];	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("매개변수값 부족 어쩌구");
			return;
		}
// return구문으로 main() 메서드를 빠져 나가기 때문에 아래코드가 실행되지 않음
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 +"+"+data2+"="+result);
		}catch(NumberFormatException e) {
			System.out.println("숫자변환안됨");
		}finally {
			System.out.println("다시실행");
		}

	}

}
