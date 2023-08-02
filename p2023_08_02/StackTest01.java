package p2023_08_02;

import java.util.*;

//큐와 달리 스택은 클래스이기 때문에 new연산자로 객체 생성이 가능함
//스택(Stack): LIFO(Last Input First Output) 구조
public class StackTest01 {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("1-자바");
		myStack.push("2-C++");
		myStack.push("3-API");
		myStack.push("4-MFC");

		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	}
}
