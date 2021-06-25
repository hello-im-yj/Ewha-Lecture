/* 1748022 김유진
 * 예외처리(try/catch/finally)
 * */

package Ex1;

public class ExceptionTest2 {
	
	public static void main (String args[]) {
		int num = Integer.parseInt(args[0]);
		try {
			int result = 10/num;
			System.out.println("result = "+result);
			
		}
		catch(ArithmeticException e) {
			System.out.println("정수를 0으로 나누면 안돼요.");
		}
		
		System.out.println("프로그램 계속 실행됨.");
	}

}
