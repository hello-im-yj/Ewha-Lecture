/* 1748022 ������
 * (����7) volatile �׽�Ʈ
 * */

package ex7;

public class VolatileTest {
	
	public static void main (String args[]) {
		
		ChangeListener listenerObj = new ChangeListener();
		ChangeMaker makerObj = new ChangeMaker();
		SharedObject obj = new SharedObject();
		
		listenerObj.sharedObj = obj;
		makerObj.sharedObj = obj;
		
		listenerObj.start();
		makerObj.start();
		
	}

}
