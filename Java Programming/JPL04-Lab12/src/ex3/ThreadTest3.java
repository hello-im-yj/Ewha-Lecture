/* 1748022 김유진
 * (예제3) 메인스레드 정보 출력 끝날 때까지 대기
 * */

package ex3;

class MyThread3 extends Thread{
	
	private Object keyObj; //key역할로만 사용하려면 아무 object나 활용해도 괜찮음!

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
		
		System.out.println("2.현재 스레드 이름 = "+name);
		System.out.println("2.현재 스레드 ID ="+id);
		System.out.println("2.현재 스레드 우선순위 값 ="+priority);
		System.out.println("2.현재 스레드 상태 ="+s);	
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
			
			System.out.println("1.현재 스레드 이름 = "+name);
			System.out.println("1.현재 스레드 ID ="+id);
			System.out.println("1.현재 스레드 우선순위 값 ="+priority);
			System.out.println("1.현재 스레드 상태 ="+s);
			
			iswritten = true;
			keyObj.notify(); //wait이었던 상태를 Runnable로 만들어줌.
		}
		
	}

}
