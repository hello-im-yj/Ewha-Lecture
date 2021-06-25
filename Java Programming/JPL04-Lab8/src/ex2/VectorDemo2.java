/* 1748022 김유진
 * (예제2) Iterator를 사용한 순차검색
 * */

package ex2;

//Iterator, Vector 모두 각각 IMPORT 필요(Class니까) -> java.util.*로 IMPORT해도 됨.
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {
	
	public static void main (String args[]) {
		
		Vector<Integer> v = new Vector<Integer> ();
		//고무줄처럼 늘어나고, 줄어드는 배열. ArrayList와 동기화면에서만 차이가 있고 대부분 비슷.
		v.add(10); //add메서드 이용하여 추가 [0]
		v.add(20); //[1]
		v.add(30); //[2] -> [3]
		v.add(2,25); //2번째 인덱스에 25 추가! [2]
		
		Iterator<Integer> it = v.iterator(); //Iterator<E> 로 리턴
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		//삭제할 때 아니면 for-each문도 정상적으로 작동함. 
		for (Integer val : v) {
			System.out.println(val);
		}
		
	}

}
