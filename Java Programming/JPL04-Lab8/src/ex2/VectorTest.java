/* 1748022 김유진
 * (예제2) Iterator를 사용한 순차검색
 * */

package ex2;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	
	public static void main (String args[]) {
		
		Vector<String> vt = new Vector<String>(); 
		//생성자만 호출()만 해주면 됨. 배열의 길이 정할 필요 없음! :)
		vt.add("서울");
		vt.add("춘천");
		vt.add("광주");
		vt.add("대구");
		vt.add("부산");
		
		for (int i=0; i<vt.size(); i++) { //들어가있는 요소의 개수는 size()매서드를 통해 알 수 있음. 직접셀필요 없음
			System.out.println("vt.get("+i+") = "+vt.get(i));
		}
		System.out.println();
		
		System.out.println("Iterator 요소로 출력"); 
		Iterator<String> it = vt.iterator(); 
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		System.out.println("forecah로 요소 출력"); //출력은 for문으로도 가능,제거는 꼭 iterator사용
		for (String k : vt) {
			System.out.println(k);
		}
		
		//for-each와 iterator 똑같이 동작함.
		
	}//end of main

}
