package test;

import java.util.*;


public class ScannerTest {

	public static void main (String args[]) {
		
		System.out.println("�̸�, �ּ�, ����, �����Ը� �������� �����Ͽ� ���ʷ� �Է��ϼ���. ");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next(); //��ĭ���� �о��, nextLine()�� /n�� ������ ���� ��ü�� �о��.
		String addr = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		
		System.out.println("�̸�: " + name + " �ּ�:" + addr + " ����:" + age + " ������: " + weight);
		
	}
		
}
