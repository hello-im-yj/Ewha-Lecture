/* 1748022 ������
 * (����3) �������̽�
 * */

package Ex3;

public class WodkTest {
	
	public static void main (String args[]) {
		
		//ȣ�� hcook, �˹� pcook, ����bk
		BuggerCook hcook = new HotelCook();
		BuggerCook pcook = new PartTimeCook();
		BuggerClerk bk = new BuggerClerk();
		
		System.out.println("ȣ�ڽ� �ܹ��� �ֹ���û ����.");
		bk.orderBugger(hcook);
				
		System.out.println("ȣ�ڽ� ������ �ֹ���û ����.");
		bk.orderSalad(hcook);
		
		System.out.println("�˹ٽ� �ܹ��� �ֹ���û ����.");
		bk.orderBugger(pcook);
		
		System.out.println("�˹ٽ� ������ �ֹ���û ����.");
		bk.orderSalad(pcook);
		
	}//main

}
