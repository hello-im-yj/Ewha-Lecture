/* 1748022 ������
 * (����3) ������� : 500�ʴ� ��ð�, ���, �����ΰ�?  
 * */

package ex3;

import java.util.Scanner;

public class ArithmeticOperator {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		
		int time = sc.nextInt(); 
		int hour = time/60/60; 
		int min = (time - hour*3600)/60; //=time/60%60
		int sec = (time - hour*3600 - min*60) %60; //=time%60
		
		System.out.println(time+ "�ʴ� " + hour + "�ð� " + min + "�� " + sec + "�� �Դϴ�.");
		
		
		
		
		
	}

}
