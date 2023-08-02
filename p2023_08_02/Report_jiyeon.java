package p2023_08_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//과제1. 키보드를 통해서 각 회원들의 정보를 입력받는 클래스(MemberInput)를 작성한다.
//이 때 입력 받는 회원의 정보는 성명, 나이, 이메일, 주소를 입력 받는다.
//그리고 키보드로 입력한 회원의 정보는 새로운 회원정보를 저장하는 클래스(MemberInfo)의 멤버변수에
//저장을 시킨 후 출력하는 프로그램
//(단, 1명의 회원정보를 입력 받아서 처리한다.가능하면 2명 이상의 회원 정보도 입력받아서 처리해본다.)
//2명 이상의 정보를 처리할 때 List자료구조를 이용해서 해결하세요.
//생성자사용 X, getter/setter메서드 사용

public class Report_jiyeon {// MemberInput

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		List<MemberInfo> list = new ArrayList<MemberInfo>();
		
		/*
		MemberInfo m[] = new MemberInfo[4];
		int i =0;
		*/

		String name, email, add, yn;
		int age;

		do {
			System.out.println("성명을 입력하세요: ");
			name = sc.nextLine();
	
			System.out.println("나이를 입력하세요: ");
			age = sc.nextInt();
			sc.nextLine();
	
			System.out.println("이메일을 입력하세요: ");
			email = sc.nextLine();
	
			System.out.println("주소를 입력하세요: ");
			add = sc.nextLine();			
			
			MemberInfo m = new MemberInfo();
			m.setName(name);
			m.setEmail(email);
			m.setAge(age);
			m.setAdd(add);
			
			list.add(m);
			
			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("Y")) {
				continue;
			} else if (yn.equals("n") || yn.equals("N")) {
				break;
			}
		
		
		} while(true);
		
		for(int i=0; i<list.size(); i++) {
			
			MemberInfo m = list.get(i);
			
			System.out.println(m.getName());
			System.out.println(m.getEmail());
			System.out.println(m.getAge());
			System.out.println(m.getAdd());
			System.out.println();
		}
		 
	}

}

class MemberInfo {
	private String name;
	private String email;
	private String add;
	private int age;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAdd() {
		return add;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
