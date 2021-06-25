/* 1748022 ������
 * (����1) �迭����== ������ �ǹ�
 * */

package Ex1;

public class TestEquals {
	
	public static void setArrValues(int[] arr) {
		for (int i = 0; i<arr.length ; i++)
			arr[i] = i;
	}
	//object class�� equals�ż���� ���� ����
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
		
		//static type�� �Լ�ȣ��! Ŭ������ �Ƚᵵ �� .
		setArrValues(arr1);
		setArrValues(arr2);
		
		if (arr1==arr2) System.out.println("Equals by ==");
		else System.out.println("not Equals by ==");
		
		if (contentEquals(arr1, arr2)) System.out.println("Equals by the contentEqulas method");
		else System.out.println("not Equals by the contentEquals method");
	}
}
