/* 1748022 ������
 * (����9) ���ʸ� �޼��� �����
 * */

package ex9;

public class ClientDemo {
	public static void main (String args[]) {
		Integer iarray[] = {1,2,3,4,5};
		Double darray[] = {11.0,12.9,13.0};
		String sarray[] = {"sun","mon","tue"};
		
		//�Ű����� Ÿ�Ժ��� �����ε�
		PrintAllClass.PrintAll(iarray);
		PrintAllClass.PrintAll(darray);
		PrintAllClass.PrintAll(sarray);
		
		System.out.println();
		
		//���ʸ� �޼���� ����. 
		PrintAllClass2.printAll(iarray);
		PrintAllClass2.printAll(darray);
		PrintAllClass2.printAll(sarray);
	}

}
