/* 1748022 ������
 * (�ǽ�2) �ѿ�����
 * */

package pm2;

import java.util.Scanner;

public class DictionaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Dictionary dc = new Dictionary();
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		
		while (true) {
			System.out.print("�ѱ� �ܾ�?");
			String input = sc.nextLine();
			if (input.equals("�׸�") ) break;
			String engWord = dc.korToEngWord(input);
			if (engWord != null) System.out.println(input+"�� "+engWord);
		}

	}

}
