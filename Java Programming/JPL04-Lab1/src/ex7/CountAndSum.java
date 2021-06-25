/* 1748022 김유진
 * (예제7) 입력되는 숫자들의 합과 개수 구하기
 * */

package ex7;

import java.util.Scanner;

public class CountAndSum {
	
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int count = 0, sum=0;
		int num;
		/*
		while (true) {
			num = in.nextInt();
			if(num ==0) break;
			else {
				count++;
				sum += num;
			}
		}*/
		
		for (;;) {
			num = in.nextInt();
			if (num ==0) break;
			else {
				count++;
				sum+=num;
			}
		}
		System.out.println("count = "+count);
		System.out.println("sum = "+sum);
	}

}
