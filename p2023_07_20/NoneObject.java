package p2023_07_20;

public class NoneObject {
    static int number = 3;// 정적 필드 -> 메모리상에 프로그램이 종료 될 때까지 상주함 
    					  //모든걸 정적필드로 생성하면 메모리가 부족할 수 있음
    
    public static void printNumber() {// 정적 메서드
        System.out.println("number = " + number);
    }
}            