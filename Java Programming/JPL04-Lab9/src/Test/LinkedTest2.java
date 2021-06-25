/* 1748022 ������
 * Collection - - Queue�������̽�
 * */


package Test;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedTest2 {
	
	public static void main (String args[]) {
		Queue<String> queue = new LinkedList<String>();
		
		//FIFO����. poll�޼ҵ� �̿��Ͽ� ���������� ���
		//?? offer�� add �޼ҵ��� ������? add�� ����.
		//offer => this method is generally preferable to add, which can fail to insert an element only by throwing an exception.

		queue.offer("������");
		queue.offer("�����");
		queue.offer("����");
		queue.offer("������");
		queue.offer("���ʱ�");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
