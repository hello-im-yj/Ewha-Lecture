/* 1748022 ������
 * (�ǽ�6) ����� ����
 * */

package pm6;

import java.util.Scanner;

public class CommomMultiple {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int count = 0;
		
		for (int i =1; i<=1000; i++) {
			if (i%n1==0 && i%n2==0) count ++;
		}
		
		System.out.println("�� ���� ����� ������ "+count+"�� �Դϴ�.");
		
	}

}
