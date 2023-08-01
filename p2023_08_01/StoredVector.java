package p2023_08_01;

import java.util.*;
/*
 iii. Vector 클래스

     1.여러가지 자료형의 Data를 모두 저장할 수 있다.
      ex) int, double, char, boolean, String etc
     2. 순서있는 입.출력 처리(index번호 순으로 저장됨)
     3. 중복된 Data를 저장 할 수 있다.
 */

public class StoredVector {
    public static void main( String[] args ) {
    
        // Vector 객체 생성
        Vector v = new Vector( 1, 1 );
        
        // Vector에 객체 저장
        v.add( "gemini" );
        v.addElement( new Integer(10) );
        v.addElement( "johnharu" );
        v.addElement( "gracedew" );

		System.out.println(v);
        
        // Vector에 저장된 객체의 개수를 구함
        int length = v.size();
        
        // 처음부터 순차적으로 객체를 꺼냄
        for ( int i=0; i<length; i++ ) {
            System.out.println( v.get(i) );
        }
        
        System.out.println( v.firstElement() );// gemini 출력
        System.out.println( v.indexOf( "johnharu" ) );// 2 출력
        System.out.println( v.isEmpty() );// isEmpty는 비어있을때 true EKfktj false 출력
        
        // 인덱스가 2인 객체를 삭제
        v.remove( 2 );
        System.out.println( v.elementAt( 2 ));//elementAt으로 인덱스번호 구해올 수 있음
        
        //인덱스가 2인 객체 값을 "park"로 설정
        v.set( 2, "park" );// set은 특정 인덱스 값을 설정함
        System.out.println( v );
    }
}
        
        
             
        