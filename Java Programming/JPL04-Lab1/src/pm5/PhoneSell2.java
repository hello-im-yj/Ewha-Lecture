/* 1748022 김유진
 * (실습5) 폰 판매량 구하기2
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
				if (type.equals("끝이다"))
					break;
			int num = Integer.parseInt(phoneNum);

			switch (type) {
			case "갤럭시":
				sell[0] += num;
				break;
			case "베가":
				sell[1] += num;
				break;
			case "옵티머스":
				sell[2] += num;
				break;
			case "루미나":
				sell[3] += num;
				break;
			case "아이폰":
				sell[4] += num;
				break;
			default:
			}
			
		}//while 끝
		
		for (int i = 0; i<sell.length;i++) {System.out.println(sell[i]); }
	}
}
