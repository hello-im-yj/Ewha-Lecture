/* 1748022 김유진
 * if~ else if~ else Test
 * */


package test;

import java.util.Scanner;

public class Grading {
	
	public static void main (String args[]) {
		char grade;
		Scanner a = new Scanner(System.in);
		
		while (a.hasNext()) { //bool type return. 사용자가 enter 누르면 작업 처리함. 여러개 띄어쓰기로 구분하면 결과값 한번에 리턴. 
			int score = a.nextInt();
			if (score >= 90.0)
				grade = 'A';
			else if (score >= 80.0)
				grade = 'B';
			else if (score >= 70.0)
				grade = 'C';
			else if (score >= 60.0)
				grade = 'D';
			else 
				grade = 'F';
			
			System.out.println("학점은" + grade + "입니다");
						
		}
		
		
	}

}
