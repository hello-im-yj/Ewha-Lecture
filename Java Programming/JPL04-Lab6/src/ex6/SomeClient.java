/* 1748022 김유진
 * (예제6) Wapper 클래스
 * */


package ex6;

import java.util.Scanner;

public class SomeClient {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		str = sc.nextLine();
		
		int sum =0;
		int i = 0;
		
		while (i<str.length()) {
			if (48<=str.charAt(i) && str.charAt(i)<= 57) 
			//if (Character.isDigit(i))
				sum += Integer.parseInt(str.substring(i,i+1));
			
			i++;
		}
		
		System.out.println("최종 합 :: "+sum);
		sc.close();
		
	}

}
