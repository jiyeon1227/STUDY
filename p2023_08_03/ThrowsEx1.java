package p2023_08_03;

public class ThrowsEx1 {
	
	//예외가 발생하면 setData()메서드를 호출한 main()메서드로 예외를 양도해서 예외처리를 한다.
	public void setData(String n) throws NumberFormatException {
		if (n.length() >= 1) {
			String str = n.substring(0, 1);
			printData(str);
		}
	}

	// 예외가 발생하면 printData()메서드를 호출한곳에 예외를 양도한다.
	private void printData(String n) throws NumberFormatException {
		int dan = Integer.parseInt(n);
		System.out.println(dan + "단");
		System.out.println("-----------");
		for (int i = 1; i < 10; i++)
			System.out.println(dan + "*" + i + "=" + (dan * i));
	}

	public static void main(String[] args) {
		ThrowsEx1 t1 = new ThrowsEx1();

		// 사용자가 입력한 값이 -> args[0] = "a"; //예외발생 (첫문자가 숫자가 아닙니다.)
		// 사용자가 입력한 값이 -> args[0] = "5"; //예외가 발생하지 않음
		try {
			t1.setData(args[0]);
		} catch (Exception e) {
			System.out.println("첫문자가 숫자가 아닙니다.");
		}
	}// main() end

}
