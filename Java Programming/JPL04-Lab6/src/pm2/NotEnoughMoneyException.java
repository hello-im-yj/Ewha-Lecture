/* 1748022 김유진
 * (실습2) 예금 관리 시스템
 * */

package pm2;

public class NotEnoughMoneyException extends Exception {
	
	NotEnoughMoneyException (String msg){ 
		super (msg);
	}
	
}
