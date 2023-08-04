package p2023_08_04;

import java.io.FileWriter;
import java.util.Scanner;

//과제1. 키보드로 입력한 문장을 파일(result.txt)로 저장하는 프로그램

public class Report_jiyeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("문장을 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();

		try {
			FileWriter fw = new FileWriter("result.txt");
			fw.write(str);
			fw.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
