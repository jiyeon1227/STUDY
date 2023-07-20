package p2023_07_20;

public class Shared {
    public static void main( String[] args ) {
    
        StaticCount sc1 = new StaticCount();
        System.out.println("sc1.number = " + sc1.number);
        
        sc1.number++;//number값 1증가
        System.out.println("sc1.number = " + sc1.number);
        
        StaticCount sc2 = new StaticCount();
        System.out.println("sc2.number = " + sc2.number);//값을 공유하기때문에 가장 마지막에 저장된 값이 출력됨
        
        sc2.number++;//number값 1증가
        System.out.println("sc2.number = " + sc2.number);
        
        StaticCount.number++;
        System.out.println(StaticCount.number);
    }
}
            
        
        
        