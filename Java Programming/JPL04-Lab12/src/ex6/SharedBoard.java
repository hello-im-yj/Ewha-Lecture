/* 1748022 ������
 * (����6) ������ �����
 * */

package ex6;

public class SharedBoard {
	
	private int sum =0;
	
	//synchronized �������� �������� X. ȿ���� ���°� ���ÿ� 0���� ������ �� ����.
	public synchronized void add() {
		int n=sum;
		n+=10;
		sum =n;
		
		System.out.println(Thread.currentThread().getName() + " : "+sum);
	}
	
	public int getSum() {
		return sum;
	}

}
