/* 1748022 ������
 * ���� �������� ���(1/2) (2/2)
 * */

package test;

public class AccessDemo1 {
	public static void main (String args[]) {
		Sample aClass = new Sample();
		aClass.a=10;
		//aClass.b=10; //private�� �ٸ� Ŭ�������� ���� ���� �Ұ�.
		aClass.setB(10);
		aClass.c = 10;
	}

}
