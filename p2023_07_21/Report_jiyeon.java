package p2023_07_21;

import java.util.Scanner;

/*
 과제 1 키보드를 통해서 각 회원들의 정보를 입력 받는 클래스(MemberInput)를 작성한다. 
        이때 입력 받는 회원의 정보는 성명, 나이, 이메일,주소를 입력 받는다. 
        그리고 키보드를 입력한 회원의 정보는 새로운 회원정보를 저장하는 클래스(MemberInfo)의 멤버변수에 저장을 시킨후 출력하는 프로그램
        (단, 1명의 회원정보를 입력 받아서 처리한다. 가능하면 2명 이상의 회원 정보도 입력 받아서 처리 해본다.)
	 
        MemberInfo클래스의 멤버변수를 초기화 방법을 생성자 대신, setter 메소드를 이용해서 초기화 시켜서 출력하는 프로그램을 작성하세요.
 */

public class Report_jiyeon {// MemberInput

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 배열
		MemberInfo1[] m = new MemberInfo1[5];
		int i = 0;
		String yn;
		Scanner sc = new Scanner(System.in);
		String name, email, address;
		int age;

		System.out.print("성명을 입력하세요? ");
		name = sc.nextLine();// nextLine은 한 줄 통째로 가져옴(next는 띄어쓰기 하면 짤림)
		System.out.print("나이를 입력하세요? ");
		age = sc.nextInt();// 숫자를 입력받은후에 enter키를 누르면 null값을 return하게 됨 (숫자 + 엔터 까지 입력받음)
		sc.nextLine();// null값을 받아주는 코드
		System.out.print("E-Mail을 입력하세요? ");
		email = sc.nextLine();
		System.out.print("주소를 입력하세요? ");
		address = sc.nextLine();

		m[i] = new MemberInfo1(name, age, email, address);

		m[i].setName("성명");
		m[i].setAge(22);
		m[i].setEmail("이메일@이메일");
		m[i].setAddress("주소");

		System.out.println("성명: " + m[i].getName());
		System.out.println("나이: " + m[i].getAge());
		System.out.println("E-Mail: " + m[i].getEmail());
		System.out.println("주소: " + m[i].getAddress());

	}

}

//DTO(Data Transfer Object)
class MemberInfo1 {
	private String name;
	private int age;
	private String email;
	private String address;

	
	public MemberInfo1(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
