/* 1748022 ������
 * (�ǽ�4) �� �Ǹŷ� ���ϱ� 1
 * */

package pm4;

import java.util.Scanner;

public class PhoneSell1 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int[] sell = new int[5];

		while(true) {
			String input = sc.nextLine();
				if (input.equals("������!!!")) break;
			switch (input) {
			case "������" : sell[0]+=1;
				break;
			case "����": sell[1]+=1;
				break;
			case "��Ƽ�ӽ�": sell[2]+=1;
				break;
			case "��̳�" : sell[3]+=1;
				break;
			case "������" : sell[4]+=1;
				break;
			}	
		}
		
		for (int i = 0; i<sell.length;i++) {
			System.out.println(sell[i]);
		}
		
	}

}
