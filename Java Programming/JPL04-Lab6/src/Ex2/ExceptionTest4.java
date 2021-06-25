/* 1748022 김유진
 * 예외처리 (throws/throw)
 * */

package Ex2;

import java.util.Scanner;

public class ExceptionTest4 {
	
	public int inputData () throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100사이의 값을 입력하세요!");
		int val = sc.nextInt();
		if(val<1 || val>100) {
			throw new Exception();
		}
		
		return val;
	}
	//throws Test
	public static void main (String[] agrs) {
		ExceptionTest4 et = new ExceptionTest4();
		try {
			int val = et.inputData();
			System.out.println("입력값: "+val);
		}
		catch (Exception e){
			System.out.println("입력값이 범위를 벗어났습니다. ");
		}
		
	}

}
