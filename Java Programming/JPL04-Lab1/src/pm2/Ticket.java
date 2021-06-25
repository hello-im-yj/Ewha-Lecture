/* 1748022 김유진
 * (실습2) 극장 표 구매
 * */

package pm2;

import java.util.Scanner;

public class Ticket {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("어른?청소년?어린이?");
		String type = sc.nextLine();
		
		switch (type) {
		case "어른" :
			System.out.println("어른 요금 적용합니다.");
			break;
		case "청소년" : 
			System.out.println("청소년 요금 적용합니다.");
			break;
		case "어린이" : 
			System.out.println("어린이 요금 적용합니다.");
			break;
		default : System.out.println("잘못 입력하셨습니다.");
		}

	}

}
