
/* 1748022 ������
 * (�ǽ�1) Employee Ŭ���� ����
 * */

package Pm1;

public class PayLogic2 implements PayManager {
	
	public long calculatePay(Employee emp) {
		long pay = emp.getWorkHours()*10000 + emp.getOverTimeHours()*20000;
		return pay;		
	}

}
