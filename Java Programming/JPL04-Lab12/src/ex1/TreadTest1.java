/* 1748022 ������
 * (����1) ������ �����
 * */

package ex1;

public class TreadTest1 {
	
	public static void main(String args[]) {
		MyThread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());
		
		t1.start();
		t2.start();
		
		int minus = 0;
		for (int i=1;i<=10;i++) {
			minus -= i;
			System.out.println(i+"���� ���: "+minus);
		}
		System.out.println("-----------------");
		System.out.println("1~10 ����: ");
		
	}//end of main

}
