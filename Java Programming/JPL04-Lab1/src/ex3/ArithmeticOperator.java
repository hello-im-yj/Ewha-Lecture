/* 1748022 김유진
 * (예제3) 산술연산 : 500초는 몇시간, 몇분, 몇초인가?  
 * */

package ex3;

import java.util.Scanner;

public class ArithmeticOperator {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		
		int time = sc.nextInt(); 
		int hour = time/60/60; 
		int min = (time - hour*3600)/60; //=time/60%60
		int sec = (time - hour*3600 - min*60) %60; //=time%60
		
		System.out.println(time+ "초는 " + hour + "시간 " + min + "분 " + sec + "초 입니다.");
		
		
		
		
		
	}

}
