
/* 1748022 ������
 * (�ǽ�1) Employee Ŭ���� ����
 * */

package Pm1;

public class PayLogic1 implements PayManager {

	
	public long calculatePay(Employee emp) {
		long pay = emp.getWorkHours()*10000 + emp.getOverTimeHours()*15000;
		return pay;
	}

}
