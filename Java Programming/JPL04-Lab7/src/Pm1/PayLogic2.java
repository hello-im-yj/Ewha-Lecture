
/* 1748022 김유진
 * (실습1) Employee 클래스 구현
 * */

package Pm1;

public class PayLogic2 implements PayManager {
	
	public long calculatePay(Employee emp) {
		long pay = emp.getWorkHours()*10000 + emp.getOverTimeHours()*20000;
		return pay;		
	}

}
