package p2023_08_04;

import java.io.*;

// 상대경로로 위치 설정 : data.txt, read.txt파일을 javaproject에 붙여넣기함

public class FileInputStreamTest {// FileInputStreamTest 지정된 위치에 해당 파일이 없을 때
	public static void main(String[] args) {

		// 입력을 받아들이는 변수 선언
		int inputValue = 0;

		// FileInputStream 객체 선언
		FileInputStream file = null;

		try {
			// "read.txt"와 InputStream 형성
			file = new FileInputStream("read.txt");// 이게 바깥쪽에 있음 안됨.상대경로 (내 위치 기준)
//			file = new FileReader("c:/read.txt");// 절대경로 (최상위 위치 기준)
			
			// file의 끝을 만날 때까지 데이터를 읽어 들임
			// read() 메소드는 File에서 한 byte씩 데이터를 읽어옴.
			// 읽어온 데이터를 int로 변환해서 리턴,파일의 끝을 만나면 -1을 반환함.
			while ((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if(file != null) try{file.close();}catch(Exception e) {}// 예외처리를  해야함
		}

		//finally문을 안적었을때는 아래 코드를 작성해야함
		// stream을 형성한 file을 닫음
		try {
			file.close();
		} catch (IOException io) {
			System.out.println(io.toString());
		}
	}// main() end
}
