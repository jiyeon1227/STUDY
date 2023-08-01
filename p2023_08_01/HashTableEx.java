package p2023_08_01;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//p.577 ~ 588
//HashTable

/*
 iv. Map 인터페이스  - HashMap, HashTable (상속받는 클래스)
    1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
      ex) int, double, char, boolean, String etc
    2. Data를 저장할 때 Key, Value 를 동시에 저장한다.
    3. key 값은 중복이 되면 안된다.
       만약에 중복된 key가 있으면, 가장 마지막에 설정된 value만 사용할 수 있다.
    4. value값은 중복이 되어도 상관없다.	
 */
public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new Hashtable<String, String>();
		
		//put(Object key, Object value)
		map.put("Spring","12");//""써야함 -> 제네릭이 String형이기때문
		map.put("Summer","123");
		map.put("Fall","1234");
		map.put("Winter","12345");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.println("아이디: ");
			String id = sc.nextLine();
			System.out.println("비밀번호: ");
			String password = sc.nextLine();
			
			System.out.println();
			
			//containsKey(id) : 사용자가 입력한 id 값이 map의 key값이 있으면 true
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 성공 !");
					break;// 반복문을 빠져나옴
				}else{
					System.out.println("비번확인요망.");
				}
			}else{
				System.out.println("아이디 없음.");
			}
		}
		

	}

}
