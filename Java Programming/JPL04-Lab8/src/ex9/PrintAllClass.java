/* 1748022 김유진
 * (예제9) 제너릭 메서드 만들기
 * */

package ex9;

public class PrintAllClass {
	
	public static void PrintAll(Integer a[]) {
		int i;
		for(i=0;i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void PrintAll (Double a[]) {
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void PrintAll(String a[]) {
		int i;
		for (i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
