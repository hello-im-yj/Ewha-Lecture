/* 1748022 김유진
 * (실습1) parlindrome 식별하기
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

			// # 이전
			while (afterCenter == false) {
				z.push(a);
				count++;
				continue;
			}

			// # 이후
			b = z.pop();
			// 짝이 맞으면 다음 작업 실행
			if (a.equals(b))
				continue;
			// 짝이 맞지 않는 경우
			else {
				check = 2;
				break;
			}
		}

		switch (check) {
		case 0:
			System.out.println("대칭입니다.");
		case 1:
			System.out.println("Empty String");
		case 2:
			System.out.println("대칭이 아닙니다.");

		}

	}// end of main

}
