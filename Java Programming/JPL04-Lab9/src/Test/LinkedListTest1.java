/* 1748022 ������
 * Collection - LinkedList Ŭ����
 * */


package Test;

import java.util.LinkedList;

public class LinkedListTest1 {
	
	public static void main (String args[]) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("SM5");
		ll.add("�ҳ�Ÿ");
		ll.add("�׷���");
		ll.add("�ƿ��");
		ll.add("����");
		ll.add(2,"K9");
		ll.set(3, "��뽺");
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
	}
	
	

}
