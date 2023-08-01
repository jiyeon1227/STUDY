package p2023_08_01;

import java.util.*;

public class EnumIterVector {
	
    public static void main( String[] args ) {
    	
	// Vector 객체 생성
	Vector v = new Vector( 1, 1 );
		
	// Vector에 Object 저장 (add, addElement 둘 다 사용가능)
	v.add( 30 );
	v.addElement( new Integer( 10 ));
	v.addElement( "johnharu" );
	v.addElement( "gracedew" );
	
	//출력 방법 1. vector 자료구조에 저장된 데이터 출력
	System.out.println(v);
	
	//출력 방법 2.
	for(int i = 0; i<v.size(); i++) {
		System.out.print(v.get(i)+"\t");
	}
	System.out.println();
	
	//출력 방법 3. 나열형(Enumeration) -> vector만 가능한 출력방법
	// Vector의 Object의 나열형을 리턴
	Enumeration e = v.elements();
	// Enumeration을 이용해 Vector의 Object를 출력
	while( e.hasMoreElements() ) {// 가져올 데이터가 있을깨 true리턴
	    System.out.println( e.nextElement() );
	}
	System.out.println();
	
	//출력 방법 4. 반복자(Iterator)
	// Vector의 Object의 나열형을 리턴
	Iterator ie = v.iterator();
	// Iterator을 이용해 Vector의 Object를 출력
	while( ie.hasNext() ) {
	    System.out.println( ie.next() );
	}	

    } //main end   
}
