/* 1748022 ������
 * if~ else if~ else Test
 * */


package test;

import java.util.Scanner;

public class Grading {
	
	public static void main (String args[]) {
		char grade;
		Scanner a = new Scanner(System.in);
		
		while (a.hasNext()) { //bool type return. ����ڰ� enter ������ �۾� ó����. ������ ����� �����ϸ� ����� �ѹ��� ����. 
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
			
			System.out.println("������" + grade + "�Դϴ�");
						
		}
		
		
	}

}
