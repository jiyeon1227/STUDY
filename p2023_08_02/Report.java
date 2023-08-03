package p2023_08_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Report {// MemberInput

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList li = new ArrayList();
		MemberInfo1 mm;
		String yn;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("성명을 입력하세요? ");
			String name = sc.nextLine();
			System.out.print("나이를 입력하세요? ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("E-Mail을 입력하세요? ");
			String email = sc.nextLine();
			System.out.print("주소를 입력하세요? ");
			String address = sc.nextLine();

			MemberInfo1 m = new MemberInfo1();
			// m.name="홍길동";// 다이렉트 접근 안됨
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);
			
			//boolean add(Object e)
			//Object e = new MemberInfo();// 업캐스팅(자동 형변환)
			li.add(m);

			System.out.println("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.nextLine();
			if (yn.equals("y")) {
				continue;
			} else if (yn.equals("n")) {
				break;
			}

		} while (true);

		// Object get(int index)
		// 다운캐스팅: 부모 클래스인 Objrct형을 자식클래스인 MemberInfo 변환하는것
		for (int i = 0; i < li.size(); i++) {
			mm = (MemberInfo1) li.get(i);// (MemberInfo1)생략하면 안됨 (제네릭을 사용하면 생략 가능함)

			System.out.println("성명:" + mm.getName());
			System.out.println("나이:" + mm.getAge());
			System.out.println("E-Mail:" + mm.getEmail());
			System.out.println("주소:" + mm.getAddress());
		}
	}

}

// DTO(Data Transfer Object)
class MemberInfo1 extends Object {
	private String name;
	private int age;
	private String email;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
