/* 1748022 김유진
 * (실습4) 폰 판매량 구하기 1
 * */

package pm4;

import java.util.Scanner;

public class PhoneSell1 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int[] sell = new int[5];

		while(true) {
			String input = sc.nextLine();
				if (input.equals("끝났다!!!")) break;
			switch (input) {
			case "갤럭시" : sell[0]+=1;
				break;
			case "베가": sell[1]+=1;
				break;
			case "옵티머스": sell[2]+=1;
				break;
			case "루미나" : sell[3]+=1;
				break;
			case "아이폰" : sell[4]+=1;
				break;
			}	
		}
		
		for (int i = 0; i<sell.length;i++) {
			System.out.println(sell[i]);
		}
		
	}

}
