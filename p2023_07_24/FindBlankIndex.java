package p2023_07_24;

//length(): 문자열의 길이를 구해주는 역할 -> 글자수가 몇 글자이냐(바이트 X)
//charAt(index):  index 번호에 해당아는 문자 1개를 구해주는 역할

public class FindBlankIndex {
	public static void main(String[] args) {

		String message = "Java program creates many objects.";

		// message의 길이를 구함.
		int len = message.length();

		System.out.println(len); // len = 34;

		// message 중에서 ' '을 찾음
		for (int i = 0; i < len; i++) {
			char c = message.charAt(i);
			if (c == ' ') {//공백
				System.out.println("index = " + i);
			}
		} // for end
	}
}
