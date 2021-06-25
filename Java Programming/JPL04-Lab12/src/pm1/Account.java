
/* 1748022 ������
 * (�ǽ�)���� �ܰ�
 * */


package pm1;

public class Account {
	
	int balance = 1000;
	
	public synchronized void withdraw (int money) {
		while (balance < money) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance -= money;
	}
	
	public synchronized void deposit(int money) {
		balance += money;
		notify();
	}

}
