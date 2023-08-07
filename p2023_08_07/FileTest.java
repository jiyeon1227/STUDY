package p2023_08_07;

// File 클래스는 데이터들이 입.출력 하면서 사용하는 파일이나 디렉토리 체제를 관리하는 클래스임.

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		try {
			// File 객체 생성
			// c:/java01/temp 폴더가 생성되고, 현 위치 하위에 test폴더가 생성됨
			File temp = new File("C:/java01", "temp");// C드라이브에 생성됨
			File tempFile = new File("test");// javaproject하위에 생성됨

			// 디렉토리 생성(mkdirs()는 디렉토리를 만들면 true를 반환함)
			System.out.println("create directory state : " + temp.mkdirs());// true (최초생성시에만 true)
			System.out.println("create directory state : " + tempFile.mkdirs());// false
			
			//1. 디렉토리 삭제 -> 비어있는 디렉토리만 삭제됨(비어있지 않으면 삭제안됨)
			tempFile.delete();
			// 디렉토리에 파일이 있을때 삭제 되는지 확인
			// 파일을 test폴더(14라인에서 생성)에 넣음
//			tempFile.delete();// 비어있지 않을 때 삭제 되는지 확인 -> 삭제 안됨
			
			//2. 비어있지 않은 디렉토리 삭제 (과제) -> 폴더 안에 있는 모든 파일을 배열형태로 구해와서 파일을 루프돌리면서 삭제하고, 폴더를 삭제해야함
			
			//3. 자식 디렉토리 삭제
			temp.delete(); // temp디렉토리 삭제됨
			
			//4. 부모 디렉토리 삭제
			temp.getParentFile().delete();// c:java01 디렉토리 삭제됨
			
			// File 클래스에서 제공하는 메소드로 파일 시스템에 대한 여러가지 정보를 얻을수 있음
			System.out.println("temp canRead : " + temp.canRead());
			System.out.println("temp canWrite : " + temp.canWrite());
			System.out.println("temp getAbsoluteFile : " + temp.getAbsoluteFile());
			System.out.println("temp getName : " + temp.getName());
			System.out.println("temp getParent : " + temp.getParent());
			System.out.println("temp getPath : " + temp.getPath());
			System.out.println("temp isDirectory : " + temp.isDirectory());
			System.out.println("temp isFile : " + temp.isFile());
		} catch (Exception e) {
		}
	}
}
