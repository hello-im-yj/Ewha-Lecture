/* 1748022 ������
 * (����7) volatile �׽�Ʈ
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
			
			try { //sleep�� Thread�� static method
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
