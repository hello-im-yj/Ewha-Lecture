
/* 1748022 ������
 * (�ǽ�)���� �ܰ�
 * */

package pm1;

public class BankSynchronizedEx {
	
	public static void main (String args[]) {
		
		Runnable runnable = new RunnableTest();
		Thread thread01 = new Thread(runnable);
		Thread thread02 = new Thread(runnable);
		
		thread01.start();
		thread02.start();
		
	}

}
