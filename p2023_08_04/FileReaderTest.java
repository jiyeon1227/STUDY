package p2023_08_04;

import java.io.*;

//상대경로로 위치 설정 : data.txt, read.txt파일을 javaproject에 붙여넣기함

public class FileReaderTest {
	public static void main(String[] args) {

		// FileReader 객체 선언
		FileReader file = null;
		int inputValue = 0;

		try {
			// "data.txt" File과 stream 형성
			file = new FileReader("data.txt");// 상대경로
//			file = new FileReader("c:/data.txt");// 절대경로

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			while ((inputValue = file.read()) != -1) {// 유니코드로 받아오고, char로 변환해서 출력
				System.out.print((char) inputValue);
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if(file != null) try {file.close();} catch(Exception e) {}
		}
		
	}// main() end
}
