/* 1748022 김유진
 * (예제1) 배열에서== 연산자 의미
 * */

package Ex1;

public class TestEquals {
	
	public static void setArrValues(int[] arr) {
		for (int i = 0; i<arr.length ; i++)
			arr[i] = i;
	}
	//object class의 equals매서드와 같은 로직
	public static boolean contentEquals(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) return false;
		
		for (int i=0; i<arr1.length; i++) {
			if (arr1[i] != arr2[i]) return false;
		}
		
		return true;
	}

	public static void main (String args[]) {
		int[] arr1 = new int [3];
		int[] arr2 = new int [3];
		
		//static type의 함수호출! 클래스명 안써도 됨 .
		setArrValues(arr1);
		setArrValues(arr2);
		
		if (arr1==arr2) System.out.println("Equals by ==");
		else System.out.println("not Equals by ==");
		
		if (contentEquals(arr1, arr2)) System.out.println("Equals by the contentEqulas method");
		else System.out.println("not Equals by the contentEquals method");
	}
}
