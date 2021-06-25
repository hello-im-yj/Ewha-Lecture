/* 1748022 김유진
 * 반복문(While, do~ while)을 사용하여 1~10을 더하는 프로그램
 * */


package test;

public class WhileTest {
	
	public static void main (String args[]) {
/*		int sum = 0;
		int i=1; //1선언
		while (i<= 10) { //2조건체크

			sum +=i;
			i +=1; //3조건변경
		}

		System.out.println("sum = " +sum );	
	}
*/
		int i, sum ;
		sum = 0;
		i=1;
		
		do { 
			sum += i;
			i ++;
		} while ( i <=10 );
		
		System.out.println("sum = " +sum );			
	}			
}
