
/* 1748022 김유진
 * (실습2) 다차원배열 Simple문제
 * */


package Pm2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleMultiArrayTest {
	
	public static void main (String args[]) {
		
		try {Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		char[][] multiArr = new char[row][col];
		
		sc.nextLine();
		
		//System.out.println(multiArr.length);
		//System.out.println(multiArr[0].length);
		
		for (int i=0;i<multiArr.length;i++) {
			String input = sc.nextLine();
			for (int j=0;j<multiArr[i].length;j++) {
				multiArr[i][j] = input.charAt(j);
			}
		}
		
		System.out.println();
		//System.out.println(Arrays.toString(multiArr)); -> 주소값출력됨...
		for (int i=0;i<multiArr.length;i++) {
			for (int j=0;j<multiArr[i].length;j++) {
				System.out.print(multiArr[i][j]);
			}System.out.println();
		}
		
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요.");
		}		
		
	}
}
