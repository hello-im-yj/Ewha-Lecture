/* 1748022 ������
 * (����1) 2���� ����
 * */


package ex1;
/* ����ڿ��� ����, ������ ���̸� �Է� �޾� Rectangle ��ü�� ����
�ϰ�, �� ������ ����, ������ ���� ���(showDim ȣ��), ���� ���
(area ȣ���ؼ� ��ȯ���� ���� ���), ���簢�������� ���(isSquare
�� ȣ���ؼ� ��ȯ���� ���� ���)�ϴ� ��� ���� ���α׷�
*/

import java.util.Scanner;

public class Shapes2 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);		
		while (true) {
						
			Rectangle r1 = new Rectangle();
			System.out.println("���� ����>>");
			r1.width = sc.nextDouble();
			System.out.println("���� ����>>");
			r1.height = sc.nextDouble();
			
			if (r1.width <=0 || r1.height <=0) break;
			
			r1.showDim();
			System.out.println("������"+r1.area());
			System.out.println("���簢���ΰ���?" + r1.isSquare());
			
		}
		
		sc.close();
		System.out.println("����");
	}
	

}
