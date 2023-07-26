package p2023_07_26;

//p.501
//자동 박싱과 자동 언박싱

public class WrapperEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자동 박싱
		Integer ob = new Integer(100);//박싱
		Integer obj = 100;//자동박싱
		System.out.println("언박싱: " +obj.intValue());
		System.out.println("자동 언박싱: " +obj);
		
		//언박싱
		int value1 = obj.intValue();
		
		//자동 언박싱
		int value2 = obj;
		
		//자동 언박싱
		int result = obj + 100;
		System.out.println("result: " + result);

	}

}
