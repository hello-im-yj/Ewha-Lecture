/* 1748022 김유진
 * (예제7) HashMap
 * */
package ex7;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

	public static void main (String args[]) {
		
		HashMap<String,String> loginData = new HashMap<String,String> ();
		
		loginData.put("89123", "김승우");
		loginData.put("04123","차태현");
		loginData.put("13323", "윤동구");
		
		Scanner sc = new Scanner(System.in);
		String id =sc.next();
		String name = sc.next();
		
		//아이디가 존재하지 않을 때
		if(!loginData.containsKey(id)) { 
			System.out.println("아이디가 존재하지 않습니다.");
			return; //main함수 종료!exit같은 역할.
		}
		
		//아이디와 이름이 일치하지 않을 때
		String val = loginData.get(id); //key값으로 호출! index가 없기 때문에.
		if (!val.equals(name)) {
			System.out.println("올바른 사용자가 아닙니다.");
			return; //main함수 종료!exit같은 역할.
		}
		
		System.out.println("로그인 완료");
		
	}
}
