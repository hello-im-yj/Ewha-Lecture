/* 1748022 ������
 * (����1) Collection-Vector<E>
 * */

package ex1;

import java.util.Vector;

public class VectorDemo {
	
	public static void main (String args[]) {
		//ArrayList,Vector type�� add �ż��带 ���� �߰�, get�� ���� �˻�! remove�� ���� ����.
		//index�� ������. (������ ������, �ߺ����, null�� ������� �� ����. )
		Vector<Integer> v = new Vector<Integer> ();
		//����ó�� �þ��, �پ��� �迭. ArrayList�� ����ȭ�鿡���� ���̰� �ְ� ��κ� ���.
		v.add(10); //add�޼��� �̿��Ͽ� �߰� [0]
		v.add(20); //[1]
		v.add(30); //[2] -> [3]
		v.add(2,25); //2��° �ε����� 25 �߰�! [2]
		
		for (int i=0;i<v.size(); i++) {
			System.out.println(v.get(i)); //10 20 25 30
		}
	}

}
