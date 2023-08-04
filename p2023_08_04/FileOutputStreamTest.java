package p2023_08_04;

import java.io.*;

public class FileOutputStreamTest {
	public static void main(String[] args) {

		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// * 첫째 인수로 지정된 파일 객체에서 읽어서 둘째 인수로 지정된 파일 객체에 출력함
			// (즉, 동일한 파일이 생성됨) -> read.txt파일을 읽어서 read1.txt파일을 생성 (javaproject에 생성됨)
			// File에서 데이터를 읽어오는 FileInputStream 객체 생성
			fis = new FileInputStream("read.txt");

			// File에 데이터를 전송하기 위한 FileOutputStream 객체 생성
			fos = new FileOutputStream("read1.txt");// 상대경로에 생성
//			FileOutputStream fos = new FileOutputStream("d:/read1.txt");// 절대경로에 생성 -> c에 바로 저장하면 안됨(보안떔시롱 ~)
			
			int input = 0;

			// File에 저장된 모든 데이터를 스트림을 통해 읽어 들여 File에 저장
			// 파일의 내용을 끝까지 다 읽으면 -1이 반환됨.
			while ((input = fis.read()) != -1) {
				System.out.print((char) input); // 화면에 출력 부분
				fos.write(input); // 다른 파일에 쓰는 부분
			}

			// FileInputStream, FileOutputStream을 해제
			fos.close();
			fis.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(fis != null) try {fis.close();}catch(Exception e) {}
			if(fos != null) try {fos.close();}catch(Exception e) {}
		}
	}// main() end
}
