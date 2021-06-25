/* 1748022 김유진
 * (실습1) 성적처리
 * */
package pm1;

import java.util.Scanner;

public class GradeTest {
	
	public static void main (String args[] ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = sc.nextInt();
		int sci = sc.nextInt();
		int eng = sc.nextInt();
		
		Grade me = new Grade (math,sci,eng);
		System.out.println("평균은 "+me.average());
		sc.close();
		
	}

}
