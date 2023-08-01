package p2023_08_01;

//p.561 ~ 562

import java.util.List;
/*
 iii. Vector 클래스

     1.여러가지 자료형의 Data를 모두 저장할 수 있다.
      ex) int, double, char, boolean, String etc
     2. 순서있는 입.출력 처리(index번호 순으로 저장됨)
     3. 중복된 Data를 저장 할 수 있다.
 */
import java.util.Vector;

class Board{//class Board extends Object -> Object를 자동으로 상속받음
	
	// 필드
	String subject;
	String content;
	String writer;
	
	// 생성자
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}	
}

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//제네릭(Generic) : 자료구조에 특정 자료형의 데이터만 저장할 수 있도록 만들어 주는 역할
		//Vector 자료구조에는 Board 클래스로 만든 객체만 저장할 수 있다.
		List<Board> list = new Vector<Board>();// 업캐스팅
		
//		list.add("java");// 제네릭에 의해 값 저장 못함
//		list.add(50);// 제네릭에 의해 값 저장 못함
		
		//boolean add(Object e)
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		list.remove(2);// 인덱스 2번 원소(객체)를 삭제
		list.remove(3);// 인덱스 3번 원소(객체)를 삭제
		
		//Object get(int index)
		for(int i=0; i<list.size(); i++) {
			
			// 제네릭을 사용하면, 부모 클래스인 Object형을 자식클래스인 Board클래스형으로 자료형 변환을 할 때, 
			// 제네릭으로 설정된 자료형은 생략이 가능함
			//Board board = (Board)list.get(i); -> 제네릭으로 생성된건 생략가능함
			//Object형 --> Board형으로 변환
			Board board = list.get(i);
			
			System.out.println(board.subject + "\t" + board.content+ "\t" + board.writer);
		}

	}

}
