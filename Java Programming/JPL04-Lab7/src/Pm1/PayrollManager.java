
/* 1748022 ������
 * (�ǽ�1) Employee Ŭ���� ����
 * */

package Pm1;

public abstract class PayrollManager {
	
	public void writeEmployessPay(Employee emp) {
		long pay = emp.calculatePay();
		this.writePayment(pay,emp.getName());
	}
	
	protected abstract void writePayment(long amount,String name);

}
