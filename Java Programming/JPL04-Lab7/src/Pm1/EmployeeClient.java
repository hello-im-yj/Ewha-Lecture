
/* 1748022 김유진
 * (실습1) Employee 클래스 구현
 * */

package Pm1;

import java.util.Scanner;

public class EmployeeClient {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력>> ");
		String name = sc.nextLine();
		System.out.print("아이디 입력>> ");
		String id = sc.nextLine();
		System.out.print("정상 근무 시간 입력>> ");
		int workHours = Integer.parseInt(sc.nextLine());
		System.out.print("초과 근무 시간 입력>> ");
		int overTimeHours = Integer.parseInt(sc.nextLine());
		
		
		Employee emp = new Employee(id,name,workHours,overTimeHours);
		/*
		PayManager pl1 = new PayLogic1();
		emp.setPayManaget(pl1);
		System.out.println();
		System.out.println(emp.getName()+"의 월급은 "+emp.calculatePay()+"원 입니다.");
		
		PayManager pl2= new PayLogic2();
		emp.setPayManaget(pl2);
		System.out.println();
		System.out.println(emp.getName()+"의 월급은 "+emp.calculatePay()+"원 입니다.");
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
