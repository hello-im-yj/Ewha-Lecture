
/* 1748022 김유진
 * (실습1) Employee 클래스 구현
 * */

package Pm1;

public abstract class PayrollManager {
	
	public void writeEmployessPay(Employee emp) {
		long pay = emp.calculatePay();
		this.writePayment(pay,emp.getName());
	}
	
	protected abstract void writePayment(long amount,String name);

}
