/* 1748022 ������
 * (����7) volatile �׽�Ʈ
 * */

package ex7;

public class ChangeListener extends Thread {
	
	public SharedObject sharedObj;
	
	public void run() {
		int local_value = sharedObj.MY_INT;
		
		while (local_value < 5) {
			if(local_value != sharedObj.MY_INT) {
				String s= String.format("Got Change for MY_INT : %d",sharedObj.MY_INT);
				System.out.println(s);
				local_value = sharedObj.MY_INT;
			}
 		}
	}
	

}
