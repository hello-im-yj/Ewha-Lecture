/* 1748022 ������
 * (����3) �������̽�
 * */

package Ex3;

public class BuggerClerk {

	public void orderBugger(BuggerCook cook) { 
		System.out.println("�ܹ��� �ֹ�"); //
		cook.makeBugger();	//�������̽��� Ŭ���� ������!		
	}
	
	public void orderSalad(BuggerCook cook) {
		System.out.println("������ �ֹ�");
		cook.makeSalad();
	}
}
