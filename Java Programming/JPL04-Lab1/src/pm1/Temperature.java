/* 1748022 ������
 * (�ǽ�1) ���� <-> ȭ�� �µ� ��ȯ
 * */

package pm1;

import java.util.Scanner;

public class Temperature {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		double inputTemp = sc.nextDouble();
		
		switch (s) {
		
			case "����" : double F_temp = inputTemp*9.0/5.0+32.0; 
				System.out.println("ȭ�� �µ��� "+F_temp);
				break;
			case "ȭ��" : double C_temp = (inputTemp-32.0)*5.0/9.0; 
				System.out.println("���� �µ��� "+C_temp);
				break;
			default : System.out.println("Wrong Input");
		}
		
	}

}
