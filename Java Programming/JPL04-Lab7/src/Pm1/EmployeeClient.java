
/* 1748022 ������
 * (�ǽ�1) Employee Ŭ���� ����
 * */

package Pm1;

import java.util.Scanner;

public class EmployeeClient {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է�>> ");
		String name = sc.nextLine();
		System.out.print("���̵� �Է�>> ");
		String id = sc.nextLine();
		System.out.print("���� �ٹ� �ð� �Է�>> ");
		int workHours = Integer.parseInt(sc.nextLine());
		System.out.print("�ʰ� �ٹ� �ð� �Է�>> ");
		int overTimeHours = Integer.parseInt(sc.nextLine());
		
		
		Employee emp = new Employee(id,name,workHours,overTimeHours);
		/*
		PayManager pl1 = new PayLogic1();
		emp.setPayManaget(pl1);
		System.out.println();
		System.out.println(emp.getName()+"�� ������ "+emp.calculatePay()+"�� �Դϴ�.");
		
		PayManager pl2= new PayLogic2();
		emp.setPayManaget(pl2);
		System.out.println();
		System.out.println(emp.getName()+"�� ������ "+emp.calculatePay()+"�� �Դϴ�.");
		*/
		
		PayManager pl1 = new PayLogic1();
		emp.setPayManaget(pl1);
		PayrollManager prm1 = new PaymentOnConsole();
		prm1.writeEmployessPay(emp);
		
		PayManager pl2 = new PayLogic2();
		emp.setPayManaget(pl2);
		PayrollManager prm2 = new PaymentOnFile();
		prm2.writeEmployessPay(emp);
		
		
		
	}
}
