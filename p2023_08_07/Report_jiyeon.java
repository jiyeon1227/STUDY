package p2023_08_07;

import java.io.File;

//과제1. File클래스를 이용해서 C드라이브의 Test 폴더에 파일이 들어있는 경우 Test 폴더를 삭제하는 프로그램

public class Report_jiyeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File temp = new File("C:/","Test");
			
			//temp.mkdirs();
			
			File files[] = temp.listFiles();
			
			for(int i = 0; i<files.length; i++) {
				files[i].delete();	
			}
			temp.delete();
						
		}catch(Exception e) {
		}

	}

}
