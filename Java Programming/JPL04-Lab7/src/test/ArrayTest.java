/* 1748022 ������
 * �迭
 * */

package test;

public class ArrayTest {
	
	public static void main (String args[]) {
		String[] arr1 = {"a","b","c","d"};
		String[] arr2 = arr1;
		// ==�� �ּҺ�����!!!
		
		if (arr1 == arr2) System.out.println("Equal by ==");
		else System.out.println("Not Equal by ==");
	}

}
