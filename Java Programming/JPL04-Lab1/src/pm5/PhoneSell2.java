/* 1748022 ������
 * (�ǽ�5) �� �Ǹŷ� ���ϱ�2
 * */

package pm5;

import java.util.Scanner;

public class PhoneSell2 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int[] sell = new int[5];

		while (true) {
			String type = sc.next();
			String phoneNum = sc.next();
				if (type.equals("���̴�"))
					break;
			int num = Integer.parseInt(phoneNum);

			switch (type) {
			case "������":
				sell[0] += num;
				break;
			case "����":
				sell[1] += num;
				break;
			case "��Ƽ�ӽ�":
				sell[2] += num;
				break;
			case "��̳�":
				sell[3] += num;
				break;
			case "������":
				sell[4] += num;
				break;
			default:
			}
			
		}//while ��
		
		for (int i = 0; i<sell.length;i++) {System.out.println(sell[i]); }
	}
}
