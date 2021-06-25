/* 1748022 ������
 * (����2) ������ ���� ��� 
 * */

package ex2;

class MyThread2 extends Thread {
	
	public MyThread2(String name) {
		super(name);
	}
	
	//Thread�� ���� ��ӹ��� ��ü�� currentThread�� ȣ������ �ʾƵ� Thread�� �޼ҵ带 ���� ȣ�� ���� 
	// �߰��� -> Runnable�� ������ ��쿡�� currentThread()�� ������ ������ ���Ϲ޾� ��� �����ϴ�. 
	
	public void run() {
		long id = getId(); //Thread.currentThread().getId();
		String name = getName(); //Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("2.���� ������ �̸� = "+name);
		System.out.println("2.���� ������ ID ="+id);
		System.out.println("2.���� ������ �켱���� �� ="+priority);
		System.out.println("2.���� ������ ���� ="+s);
	}
}

public class ThreadTest2 {
	
	public static void main (String args[]) {
		MyThread2 th = new MyThread2("MyThread2");
		th.start();
		
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("1.���� ������ �̸� = "+name);
		System.out.println("1.���� ������ ID ="+id);
		System.out.println("1.���� ������ �켱���� �� ="+priority);
		System.out.println("1.���� ������ ���� ="+s);
	}
}

