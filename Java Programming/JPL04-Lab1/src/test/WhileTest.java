/* 1748022 ������
 * �ݺ���(While, do~ while)�� ����Ͽ� 1~10�� ���ϴ� ���α׷�
 * */


package test;

public class WhileTest {
	
	public static void main (String args[]) {
/*		int sum = 0;
		int i=1; //1����
		while (i<= 10) { //2����üũ

			sum +=i;
			i +=1; //3���Ǻ���
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
