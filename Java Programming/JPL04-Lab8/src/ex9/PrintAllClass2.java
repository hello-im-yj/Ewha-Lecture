/* 1748022 김유진
 * (예제9) 제너릭 메서드 만들기
 * */

package ex9;

public class PrintAllClass2 {

	// 타입 매개변수를이용하여 제너릭 메서드를 정의할 수 있다 -> 타입 매개변수<T> 는 메서드 리턴타입 앞에 선언!
	public static <T> void printAll(T a[]) {
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	
}

