/* 1748022 ������
 * (����9) ���ʸ� �޼��� �����
 * */

package ex9;

public class PrintAllClass2 {

	// Ÿ�� �Ű��������̿��Ͽ� ���ʸ� �޼��带 ������ �� �ִ� -> Ÿ�� �Ű�����<T> �� �޼��� ����Ÿ�� �տ� ����!
	public static <T> void printAll(T a[]) {
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	
}

