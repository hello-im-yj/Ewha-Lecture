/* 1748022 ������
 * (����3) �� ����, ���� ���ϴ� Ŭ����(static Ȱ��)
 * */

package ex3;

import java.util.Scanner;

public class CircleDemo {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		double r =sc.nextDouble();
		System.out.println("������ "+Circle.area(r)+ " ���ִ� "+Circle.circum(r));
		
		
	}

}
