package p2023_07_26;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Integer는 기본 생성자가 지원이 안됨
		//기본 생성자로 Integer 객체를 생성하면 오류발생
//		Integer num = new Integer();//오류발생
		
		//Integer생성자는 두가지밖에 없음(Integer(int value), Integer(String s) -> API 참고)
		
		//박싱(boxing): heap메모리를 박스로 생각하고, stack메모리에 저장된 10을 heap메모리에 복사 하는 것(박스에 집어넣는다.)
		//언박싱(unboxing): heap메모리(박스)에 있는 데이터를 stack 메모리로 가져오는것
		
		//(Integer(int value)형식
		int n = 10;//지역변수(메인 메서드 안에서 정의) -> 스택메모리 영역에 저장됨
		Integer num01 = new Integer(n);//박싱(boxing)
		
		int n01 = num01.intValue();//언박싱(unboxing)
		
		//Integer(String s)형식
		String s = "20";
		Integer num02 =  new Integer(s);//박싱
		
		int n02 = num02.intValue();//언박싱
		
	}

}
