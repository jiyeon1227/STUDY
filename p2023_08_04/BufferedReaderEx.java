package p2023_08_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 키보드로 구구단 1개 단을 입력 받아서, 출력하는 프로그램을 작성하세요
		// 단, BufferReader클래스로 처리하세요
		
		//3줄
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		//1줄
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("단을 입력하세요");
		try {
			
			String inputstring = br.readLine();// readLine은 반드시 예외처리 해야함
			int dan = Integer.parseInt(inputstring);
			
			for(int  i=1; i<10; i++) {
				System.out.println(dan + "*" + i + "=" + i*dan);
			}
			
		}catch(IOException e){
			System.out.println(e.getMessage());
			System.out.println("입력된 값이 숫자가 아닙니다.");
		}
		
		
		
		
		
	}

}
