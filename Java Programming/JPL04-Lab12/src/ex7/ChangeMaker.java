/* 1748022 김유진
 * (예제7) volatile 테스트
 * */

package ex7;

public class ChangeMaker extends Thread {
	
	public SharedObject sharedObj;
	
	public void run() {
		
		int local_value = sharedObj.MY_INT;
		
		while(sharedObj.MY_INT < 5 ) {
			String s = String.format("Incrementing MY_INT to %d",local_value +1 );
			System.out.println(s);
			local_value = ++sharedObj.MY_INT;
			
			try { //sleep은 Thread의 static method
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
