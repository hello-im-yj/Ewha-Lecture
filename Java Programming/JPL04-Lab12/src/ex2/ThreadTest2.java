/* 1748022 김유진
 * (예제2) 스레드 정보 얻기 
 * */

package ex2;

class MyThread2 extends Thread {
	
	public MyThread2(String name) {
		super(name);
	}
	
	//Thread를 직접 상속받은 객체는 currentThread를 호출하지 않아도 Thread의 메소드를 직접 호출 가능 
	// 추가로 -> Runnable을 구현한 경우에는 currentThread()로 쓰레드 참조를 리턴받아 사용 가능하다. 
	
	public void run() {
		long id = getId(); //Thread.currentThread().getId();
		String name = getName(); //Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("2.현재 스레드 이름 = "+name);
		System.out.println("2.현재 스레드 ID ="+id);
		System.out.println("2.현재 스레드 우선순위 값 ="+priority);
		System.out.println("2.현재 스레드 상태 ="+s);
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
		
		System.out.println("1.현재 스레드 이름 = "+name);
		System.out.println("1.현재 스레드 ID ="+id);
		System.out.println("1.현재 스레드 우선순위 값 ="+priority);
		System.out.println("1.현재 스레드 상태 ="+s);
	}
}

