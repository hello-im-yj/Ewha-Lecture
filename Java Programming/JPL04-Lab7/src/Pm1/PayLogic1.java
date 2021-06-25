
/* 1748022 김유진
 * (실습1) Employee 클래스 구현
 * */

package Pm1;

public class PayLogic1 implements PayManager {

	
	public long calculatePay(Employee emp) {
		long pay = emp.getWorkHours()*10000 + emp.getOverTimeHours()*15000;
		return pay;
	}

}
