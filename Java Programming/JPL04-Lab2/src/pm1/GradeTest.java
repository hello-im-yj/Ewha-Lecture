/* 1748022 ������
 * (�ǽ�1) ����ó��
 * */
package pm1;

import java.util.Scanner;

public class GradeTest {
	
	public static void main (String args[] ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ 3���� ���� �Է� >> ");
		int math = sc.nextInt();
		int sci = sc.nextInt();
		int eng = sc.nextInt();
		
		Grade me = new Grade (math,sci,eng);
		System.out.println("����� "+me.average());
		sc.close();
		
	}

}
