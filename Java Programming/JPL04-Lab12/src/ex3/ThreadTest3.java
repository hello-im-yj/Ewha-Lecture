/* 1748022 ������
 * (����3) ���ν����� ���� ��� ���� ������ ���
 * */

package ex3;

class MyThread3 extends Thread{
	
	private Object keyObj; //key���ҷθ� ����Ϸ��� �ƹ� object�� Ȱ���ص� ������!

	public MyThread3(String name,Object keyObj) {
		super(name);
		this.keyObj = keyObj;
	}
	
	public void run() {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		synchronized (keyObj) {
			if (ThreadTest3.iswritten != true) {
				try {
					keyObj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("2.���� ������ �̸� = "+name);
		System.out.println("2.���� ������ ID ="+id);
		System.out.println("2.���� ������ �켱���� �� ="+priority);
		System.out.println("2.���� ������ ���� ="+s);	
	}
}
public class ThreadTest3 {
	
	public volatile static boolean iswritten = false;

	public static void main (String args[]) {
		
		Object keyObj = new Object();
		MyThread3 th = new MyThread3("MyThread3",keyObj);
		th.start();
		
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		synchronized (keyObj) {
			
			System.out.println("1.���� ������ �̸� = "+name);
			System.out.println("1.���� ������ ID ="+id);
			System.out.println("1.���� ������ �켱���� �� ="+priority);
			System.out.println("1.���� ������ ���� ="+s);
			
			iswritten = true;
			keyObj.notify(); //wait�̾��� ���¸� Runnable�� �������.
		}
		
	}

}
