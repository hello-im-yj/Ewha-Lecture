/* 1748022 ������
 * (����5) �� �����ڿ� �� ������
 * */


package ex5;

public class LogicalOperator {
	
	public static void main (String args[]) {
		System.out.println('a'>'b'); //f
		System.out.println(3>=2); //t
		System.out.println(-1<0); //t
		System.out.println(3.45<=2); //f
		System.out.println(3==2); //f
		System.out.println(3!=2); //t
		System.out.println(!(3!=2)); //f
		System.out.println((3>2)&&(3>4)); //t&&f == f
		System.out.println((3!=2)||(-1>0)); //t||f == t
		System.out.println((3!=2)^(-1>0)); //t^f == t
		
		
		
	}

}
