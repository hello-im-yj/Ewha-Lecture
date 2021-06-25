/* 1748022 김유진
 * 배열
 * */

package test;

public class ArrayTest {
	
	public static void main (String args[]) {
		String[] arr1 = {"a","b","c","d"};
		String[] arr2 = arr1;
		// ==는 주소복사임!!!
		
		if (arr1 == arr2) System.out.println("Equal by ==");
		else System.out.println("Not Equal by ==");
	}

}
