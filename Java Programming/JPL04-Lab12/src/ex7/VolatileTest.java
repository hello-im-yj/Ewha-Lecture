/* 1748022 김유진
 * (예제7) volatile 테스트
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
