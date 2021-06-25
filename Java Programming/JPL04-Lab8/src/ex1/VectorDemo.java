/* 1748022 김유진
 * (예제1) Collection-Vector<E>
 * */

package ex1;

import java.util.Vector;

public class VectorDemo {
	
	public static void main (String args[]) {
		//ArrayList,Vector type은 add 매서드를 통해 추가, get을 통해 검색! remove를 통해 제거.
		//index가 존재함. (순서가 존재함, 중복허용, null도 집어넣을 수 있음. )
		Vector<Integer> v = new Vector<Integer> ();
		//고무줄처럼 늘어나고, 줄어드는 배열. ArrayList와 동기화면에서만 차이가 있고 대부분 비슷.
		v.add(10); //add메서드 이용하여 추가 [0]
		v.add(20); //[1]
		v.add(30); //[2] -> [3]
		v.add(2,25); //2번째 인덱스에 25 추가! [2]
		
		for (int i=0;i<v.size(); i++) {
			System.out.println(v.get(i)); //10 20 25 30
		}
	}

}
