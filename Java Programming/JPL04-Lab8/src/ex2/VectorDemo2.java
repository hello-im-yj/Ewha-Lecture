/* 1748022 ������
 * (����2) Iterator�� ����� �����˻�
 * */

package ex2;

//Iterator, Vector ��� ���� IMPORT �ʿ�(Class�ϱ�) -> java.util.*�� IMPORT�ص� ��.
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {
	
	public static void main (String args[]) {
		
		Vector<Integer> v = new Vector<Integer> ();
		//����ó�� �þ��, �پ��� �迭. ArrayList�� ����ȭ�鿡���� ���̰� �ְ� ��κ� ���.
		v.add(10); //add�޼��� �̿��Ͽ� �߰� [0]
		v.add(20); //[1]
		v.add(30); //[2] -> [3]
		v.add(2,25); //2��° �ε����� 25 �߰�! [2]
		
		Iterator<Integer> it = v.iterator(); //Iterator<E> �� ����
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		//������ �� �ƴϸ� for-each���� ���������� �۵���. 
		for (Integer val : v) {
			System.out.println(val);
		}
		
	}

}
