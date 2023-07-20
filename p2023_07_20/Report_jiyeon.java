package p2023_07_20;

import java.util.Scanner;

//과제1 키보드를 통해서 각 회원들의 정보를 입력 받는(MemberInput) 클래스를 작성한다.
//이때 입력 받는 회원의 정보는 성명, 나이, 이메일, 주소를 입력받는다.
//그리고 키보드로 입력한 회원의 정보는 새로운 회원정보를 저장하는 클래스(MemberInfo)의 멤버변수에
//저장을 시킨 후 출력하는 프로그램
//1.MemberInfo클래스의 멤버변수를 초기화 방법은 생성자를 이용하세요.
//2.1명의 회원정보를 입력 받아서 처리한다. 
//가능하면 2명 이상의 회원 정보도 입력 받아서 처리 해보자.(객체배열 이용)

	class MemberInfo {
	
	private String name;
    private int age;
    private String email;
    private String address;
	
    
    // 생성자
    public MemberInfo(String name, int age, String email, String address){ 
    	this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
    
    public void print() {
		System.out.println(name + "/" + age + "/" + email + "/" + address);
	}
    
}
    	
public class Report_jiyeon {	
	 public static void main(String[] args){
		 String name;
		 int age;
		 String email;
		 String address;
		 
		 System.out.println("성명, 나이, 이메일, 주소를 입력하세요.");
		 Scanner sc = new Scanner(System.in);
		 
		 name = sc.next();
		 age = sc.nextInt();
		 email = sc.next();
		 address = sc.next();
		 
		 MemberInfo m = new MemberInfo(name, age, email, address);
		 m.print();//기본 생성자 호출
		 
     }


}
