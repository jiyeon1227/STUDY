package p2023_07_27;

import java.text.DecimalFormat;

//과제1. 반지름(r)이 5인 경우에 다음을 구하는 프로그램
//단, 결과는 소수점 2째자리까지 결과가 나타나도록 해야함
//DecimalFormat 클래스를 이용해서 해결
//원주(원둘레) = 2 * PI * r
//원의 면적 = PI * r * r
//구의 표면적 = 4 * PI * r * r
//구의 페적(부피) = 4/3 * PI * r * r * r

public class Report_jiyeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 5;
		double n1 = 2 * Math.PI * r;
		double n2 = Math.PI * r * r;
		double n3 = 4 * Math.PI * r * r;
		double n4 = 4/3 * Math.PI * r * r * r;
		
		DecimalFormat  format = new DecimalFormat("0.00");
		
		String n11 = format.format(n1);
		String n22 = format.format(n2);
		String n33 = format.format(n3);
		String n44 = format.format(n4);
		
		
		
		
		System.out.println("원의 둘레: " + n11);
		System.out.println("원의 면적: " + n22);
		System.out.println("구의 표면적: " + n33);
		System.out.println("구의 체적: " + n44);
		//System.out.println(n11.getClass().getName());// 타입 구하기

	}

}
