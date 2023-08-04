package p2023_08_04;

import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) {

		// 3줄
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		// 1줄
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Input Data : ");

		try {
			String inputString = br.readLine();// readLine() 메서드는 사용자가 입력한 한줄을 모두읽음.
			System.out.println();
			System.out.println("Output String = " + inputString);
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}// main() end
}
