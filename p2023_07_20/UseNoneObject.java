package p2023_07_20;

public class UseNoneObject {

    public static void main( String[] args ) {
    
    //이 방법은 잘 사용하지 않음
    NoneObject no = new NoneObject();//객체생성
    System.out.println("no.number = " + no.number);
    no.printNumber();
    
    //정적필드와 정적 메서드는 객체를 생성하지않고 정적필드를 가진 클래스명으로 dot(.)으로 접근해서 사용함
    
    //정적필드로 접근해서 출력함 : 클래스.정적필드명
    System.out.println("NoneObject.number = " + NoneObject.number);//정적필드
    
    //정적메서드를 호출해서 실행함 : 클래스.정적메서드명
    NoneObject.printNumber();
    
    }
}    