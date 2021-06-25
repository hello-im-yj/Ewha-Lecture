/* 1748022 ������
 * (����2) Iterator�� ����� �����˻�
 * */

package ex2;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	
	public static void main (String args[]) {
		
		Vector<String> vt = new Vector<String>(); 
		//�����ڸ� ȣ��()�� ���ָ� ��. �迭�� ���� ���� �ʿ� ����! :)
		vt.add("����");
		vt.add("��õ");
		vt.add("����");
		vt.add("�뱸");
		vt.add("�λ�");
		
		for (int i=0; i<vt.size(); i++) { //���ִ� ����� ������ size()�ż��带 ���� �� �� ����. �������ʿ� ����
			System.out.println("vt.get("+i+") = "+vt.get(i));
		}
		System.out.println();
		
		System.out.println("Iterator ��ҷ� ���"); 
		Iterator<String> it = vt.iterator(); 
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		System.out.println("forecah�� ��� ���"); //����� for�����ε� ����,���Ŵ� �� iterator���
		for (String k : vt) {
			System.out.println(k);
		}
		
		//for-each�� iterator �Ȱ��� ������.
		
	}//end of main

}
