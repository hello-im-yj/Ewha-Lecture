/* 1748022 ������
 * (�ǽ�2) ���� ǥ ����
 * */

package pm2;

import java.util.Scanner;

public class Ticket {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�?û�ҳ�?���?");
		String type = sc.nextLine();
		
		switch (type) {
		case "�" :
			System.out.println("� ��� �����մϴ�.");
			break;
		case "û�ҳ�" : 
			System.out.println("û�ҳ� ��� �����մϴ�.");
			break;
		case "���" : 
			System.out.println("��� ��� �����մϴ�.");
			break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

}
