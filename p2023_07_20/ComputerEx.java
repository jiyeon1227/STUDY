package p2023_07_20;

//p.253~254 computer + computerExample

class Computer{
	//주소값 전달에 의한 메서드 호출방식(call by Reference방식)
	int sum1(int[] values) {//매개변수가 배열
		int sum =0;
		for (int i=0; i<values.length; i++) {
			sum += values[i]; //sum = sum + values[i]
		}
		return sum;
	}
	
	int sum2(int ...values) {// 메서드의 매개변수를 ...를 사용해서 선언하게되면 메서드 호출 시 넘겨준 값의 수에 따라 자동으로 배열생성되고, 매개값으로 사용됨
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);//values1은 주소값을 전달함
		System.out.println("result1: " + result1);

		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2: " + result2);

	
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4: " + result4);

	}

}
