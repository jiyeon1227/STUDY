package p2023_07_28;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

// 자주 사용하는 업캐스팅, 다운캐스팅 예제

/*
 ** 레퍼런스 형변환 **
   - 두개의 클래스 사이에 상속관계가 있어야함
 
* 업캐스팅(자동 형변환)
   1. 서브클래스에서 슈퍼클래스로 형변환 하는것
   2. 참조 가능한 영역이 축소가 된다.
   3. 컴파일러에 의해서 암시적 형변환(자동 형변환) 된다.

 */

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//예제 1
		//캘린더 클래스가 추상클래스이기 때문에 자체적으로 객체 생성 불가능
		Calendar c = new Calendar();//오류 발생(추항클래스)
		Calendar c1 = Calendar.getInstance();// 이 방식을 가장 많이 사용함
		
		//업캐스팅이 되면 Calendar가 상속해준 메서드은 호출 할 수 있고, 자식클래스의 메서드는 호툴 할 수 없다.
		// 이걸 참조 가느안 영역이 축소되었다고 말함
		Calendar c2 = new GregorianCalendar();//이건 업캐스팅 방식
		GregorianCalendar c3 = new GregorianCalendar();
		
		//예제 2
		//List 인터페이스는 자체적으로 객체를 생성 할 수 없다.
		List li = new List();// 오류 발생
		List list = new ArrayList();// 업캐스팅
		ArrayList al = new ArrayList();
		
		//예제 3
		//add(Object e) -> Object는 최상위 클래스
		list.add(10);// add매서드를 호출하고 값을 저장하면,
					// Object e = new Integer(10) -> 박싱 + 업캐스팅 이렇게 처리됨
		list.add(3.14);// Object e = new Double(3.14) -> 박싱 + 업캐스팅
		list.add('j');// Object e = new Double('j') -> 박싱 + 업캐스팅
		list.add(true);// Object e = new Boolean(true) -> 박싱 + 업캐스팅
		list.add("java");// Object e = new String("java") -> 박싱 + 업캐스팅
		
		//boolean equals(Object e)
		
		//Object e = new String("java");// 업캐스팅
		if("java".equals(new String("java"))) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
		
		//Object e = new Integer(30);// 박싱 + 업캐스팅
		//Object e = 30;// 자동박싱 + 업캐스팅 
		if(new Integer(30).equals(new Integer(30))) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
		
		//Object e = new Double(3.14); 박싱 + 업캐스팅
		//Object e = 3.14;// 자동박싱 + 업캐스팅 
		if(new Double(3.14).equals(new Double(3.14))){
			System.out.println("값은 값");
		} else {
			System.out.println("다른 값");
		}
		
/*
 * 다운 캐스팅(강제 형변환)
   1. 슈퍼클래스에서 서브클래스로 형변환 하는것
   2. 참조 가능한 영역이 확대가 된다.
   3. 컴파일러에 의해서 암시적 형변환(자동 형변환)이 되지 않기    
      때문에 자료형을 생략할 수 없다.(강제 형변환)
 */
		//예제 1
		List lt = new ArrayList();// 업캐스팅
		
		//add(Object e)
		lt.add(new String("자바"));//업캐스팅
		lt.add("오라클");
		lt.add("JSP");
		lt.add("스프링");
		lt.add("파이썬");
		lt.add("텐서");
		
//		object get(int index)
		Object obj = lt.get(0);//Object로 리턴됨
//		String s = lt.get(0);// 오류발생 -> get메서드는 Object로 리턴되는데, String 타입이기 때문 
		String s = (String)lt.get(0);// -> 이렇게 작성해야함. 이게 다운 캐스팅
		
		for (int i = 0; i < li.size(); i++) {//length 속성, length 메서드, size 메서드 잘 기억하기 ~~!!
			Object ob = lt.get(i);
			
			String str = (String)lt.get(i);// 다운 캐스팅
			System.out.println(str);
		}
		
		//예제 2
		List ls = new ArrayList();// 업캐스팅
		
		//리스트에 정수값 저장
//		add(Object e)
		ls.add(10);// 오토박싱 + 업캐스팅 
		ls.add(200);
		ls.add(3000);
		ls.add(40000);
		ls.add(500000);
		
//		Object get(int index)
		//2줄
		Integer it = (Integer)ls.get(0);// 다운 캐스팅
		int n1 = it.intValue();// 언박싱
		
		//1줄
		// 다운 캐스팅 + 언박싱
		int n2 = ((Integer)ls.get(0)).intValue();// .intValue()없으면 자동 언박싱이됨
		
		
		for(int i = 0; i <ls.size(); i++) {
			Object ob = ls.get(i);
			
			Integer t = (Integer)ls.get(i);// 다운 캐스팅
			int n3 = t.intValue();// 언박싱
			
			// 다운 캐스팅 + 언박싱
			int n4 = ((Integer)ls.get(i)).intValue();
			System.out.println(n4);
		}
		
	}

}
