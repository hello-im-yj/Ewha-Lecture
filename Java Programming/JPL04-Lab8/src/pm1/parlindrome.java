/* 1748022 ������
 * (�ǽ�1) parlindrome �ĺ��ϱ�
 * */

package pm1;

import java.util.Stack;
import java.util.StringTokenizer;

public class parlindrome {

	public static void main(String args[]) {

		String s = "a b a a a b # b a a a b a";
		StringTokenizer st = new StringTokenizer(s);
		Stack<String> z = new Stack<String>();
		int check = 0;
		String a, b;

		while (st.hasMoreTokens()) {
			int tkcnt = st.countTokens();
			int count = 0;
			a = st.nextToken();
			boolean afterCenter = false;
			if (a.equals("#")) {
				afterCenter = true;

				if (((!(count == tkcnt / 2)) && (tkcnt % 2 != 0)) || (tkcnt % 2 == 0)) {
					check = 2;
					break;
				}

				if (z.isEmpty()) {
					check = 1;
					break;
				}

				continue;

			}

			// # ����
			while (afterCenter == false) {
				z.push(a);
				count++;
				continue;
			}

			// # ����
			b = z.pop();
			// ¦�� ������ ���� �۾� ����
			if (a.equals(b))
				continue;
			// ¦�� ���� �ʴ� ���
			else {
				check = 2;
				break;
			}
		}

		switch (check) {
		case 0:
			System.out.println("��Ī�Դϴ�.");
		case 1:
			System.out.println("Empty String");
		case 2:
			System.out.println("��Ī�� �ƴմϴ�.");

		}

	}// end of main

}
