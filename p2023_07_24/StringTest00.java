package p2023_07_24;

class StringTest00 {
  public static void main(String[] args) {
    String str1 = new String("Java Programming");//String 객체 생성 (new연산자는 heap메모리에 호출될 때마다 생성)
    String str2 = new String("Java Programming");

    if(str1==str2){//주소비교
      System.out.println("같다");
    }else{
     System.out.println("다르다");
	}
    String str3 = "Java Programming";
    String str4 = "Java Programming";

    if(str3==str4){//주소비교
        System.out.println("같다");
    }else{
        System.out.println("다르다");
	}
    
    if(str1.equals(str3)){//값비교
        System.out.println("같다");
    }else{
        System.out.println("다르다");
	}
    
  }    
}          