package p2023_07_12;

public class VariableEx02 {
	//p.55 VariableScopeExample

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if문 안에서 정의된 지역변수 v2는 if 문안에서만 사용할 수 있음
		
		int v1 = 15;
		if (v1 > 10) {
			int v2; // v2 : 지역변수
			v2 = v1 -10;
		}
		//int v3 = v1 + v2 + 5; //v2변수를 사용할 수 없기 때문에 컴파일 에러 발생
	}

}
