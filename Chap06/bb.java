package Chap06;

public class bb {
	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76);
		System.out.println(s.info());
		System.out.println(s.toString());
		System.out.println(s);
	}

}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.eng = eng;
		this.kor = kor;
		this.math = math;
	}
	
	 String info() {
		return this.name + "," + this.ban;
	}
	 
//	 public String toString() { //오버라이딩 -> 부모보다 크거나 동급
//			return this.name + "," + this.ban;
//		}
	 
	 //스트링도 클래스다 !!!!!!!!!!!!!!!!!!!3

}
