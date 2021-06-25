/* 1748022 김유진
 * (예제1) 스레드 만들기
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
			System.out.println(i+"빼기 결과: "+minus);
		}
		System.out.println("-----------------");
		System.out.println("1~10 빼기: ");
		
	}//end of main

}
