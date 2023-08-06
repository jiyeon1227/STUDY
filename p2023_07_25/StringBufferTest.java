package p2023_07_25;

public class StringBufferTest {
	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("gemini");
		System.out.println("sb1.length() : " + sb1.length());
		System.out.println("sb1.capacity() : " + sb1.capacity());// capacity는 heap메모리에 저장된 값보다 더 큰 공간을 생성함

		sb1.append("A string buffer implements" + "a mutable sequence of characters");// append 는 자동으로 공간을 늘려줌
		System.out.println("sb1.length() : " + sb1.length());
		System.out.println("sb1.capacity() : " + sb1.capacity());

		StringBuffer sb2 = new StringBuffer();
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
	}
}
