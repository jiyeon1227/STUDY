package p2023_08_01;

import java.util.*;
/*
 v. 큐(Queue) 인터페이스 - LinkedList (상속받는 클래스)
   1. FIFO(First Input First Output) 구조
      먼저 입력된 자료가 먼저 출력되는 구조
 */

class LinkedListTest {
	public static void main(String[] args) {
		
		//* 큐(Queue) : FIFO(First Input First Output)구조
		
		//Queue는 인터페이스이기 때문에 자체적으로 객체 생성을 할 수 없음
//		Queue q = new Queue();

		//방법1. 업캐스팅
		Queue my = new LinkedList();// 업캐스팅
		//방법2.
		LinkedList myQue = new LinkedList();
		
		myQue.offer("1-자바");
		myQue.offer("2-C++");
		myQue.offer("3-API");
		myQue.offer("4-MFC");

		System.out.println(myQue.poll());// 1-자바 출력
		System.out.println(myQue.poll());// 2-C++ 출력
		System.out.println(myQue.poll());// 3-API 출력
		System.out.println(myQue.poll());// 4-MFC 출력
		System.out.println(myQue.poll());// queue가 비어있으면 null을 리턴함
		
		//null 값이 아닐경우에만 출력
		while (myQue.peek() != null) // 큐가 비어있지 않다면
			System.out.println(myQue.poll()); // 큐에서 데이터를 꺼내온다.
	}
}