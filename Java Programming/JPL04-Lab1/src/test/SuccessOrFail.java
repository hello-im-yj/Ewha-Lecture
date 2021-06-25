/* 1748022 김유진
 * if문 Test
 * */

package test;

import java.util.Scanner;

public class SuccessOrFail {
	
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오: ");
		int score = in.nextInt();
		if (score>= 80)
			System.out.println("축하합니다! 합격입니다.");
		else 
			System.out.println("불합격입니다.");
		
	}
}
