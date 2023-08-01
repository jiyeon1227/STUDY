package p2023_08_01;

import java.util.*;
/*
 iii. Vector 클래스

     1.여러가지 자료형의 Data를 모두 저장할 수 있다.
      ex) int, double, char, boolean, String etc
     2. 순서있는 입.출력 처리(index번호 순으로 저장됨)
     3. 중복된 Data를 저장 할 수 있다.
 */

public class VectorTest01 {
  public static void main(String[] args) {

    //4개의 요소를 저장할 수 있는 벡터 객체 생성, 3개씩 증가   
    Vector vec =  new Vector(4, 3);  
    System.out.println("벡터의 크기는 " + vec.size());    //벡터에 저장된 요소의 개수를 알려줌
    System.out.println("벡터의 용량은 " + vec.capacity());//벡터의 용량을 반환    
	
    for(int i=0; i<5; i++)
      vec.add(i*10);     
    System.out.println("벡터의 크기는 " + vec.size());  
    System.out.println("벡터의 용량은 " + vec.capacity());      
    System.out.println("첫 번째 요소는 " + vec.firstElement());
    System.out.println("두 번째 요소는 " + vec.get(1));  //0이 첫 번째 요소이므로
    System.out.println("마지막 요소는 " + vec.lastElement());  

   System.out.println("\n >> 저장된 요소 전체 출력 <<" );  

   for(int i=0; i<vec.size(); i++)
     System.out.print("   " + vec.get(i));
   System.out.println();
  }    
}