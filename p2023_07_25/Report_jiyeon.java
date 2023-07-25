package p2023_07_25;

import java.util.Scanner;

public class Report_jiyeon {

	// 과제1. 키보드를 통해서 주민번호를 입력 했을때 유효한 주민번호인지 아닌지를 판별하는 프로그램
	// 단, 유효하지 않은 주민번호의 경우에는 메세지 출력

	// 1. 주민번호 앞자리 6자리가 아니면 메세지 출력
	// 2. 주민번호 뒷자리 7자리가 아니면 메세지 출력
	// 3. 유효한 주민번호가 아니면 메세지 출력

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("주민번호 앞 6자리를 입력하세요");
			String jumin1 = sc.nextLine();
			
			System.out.println("주민번호 뒷 7자리를 입력하세요");
			String jumin2 = sc.nextLine();
			
			if(jumin1.equals("") || jumin1.length() != 6) {
				System.out.println("주민번호 앞 6자리를 정확히 입력하세요.");
			}else if(jumin2.equals("") || jumin2.length()!= 7 ){
				System.out.println("주민번호 뒷 7자리를 정확히 입력하세요.");
			}else if(JuminCheck(jumin1,jumin2).equals("true")){
				System.out.println("유효한 주민번호입니다.");
			}else {
				System.out.println("유효하지 않은 주민번호 입니다.");
			}
		
		}catch(Exception e) {
			System.out.println("주민번호 13자리를 올바르게 입력해주세요.");
		}
		
	}

	private static Object  JuminCheck(String jumin1 , String jumin2) {
		
		String jumin_num = jumin1 + jumin2;
		//System.out.println(jumin_num);
		int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int sum = 0;
		
		for(int i=0; i<13; i++) {
			
			sum += arr[i] * Integer.parseInt(jumin_num);
		}
		
		
		int num = 11 - sum % 11;
		num = num % 10;
		
		if(num == Integer.parseInt(jumin_num.substring(13))) {
			return true;
		}else {
			return false;
		}

		
	}
	
}



