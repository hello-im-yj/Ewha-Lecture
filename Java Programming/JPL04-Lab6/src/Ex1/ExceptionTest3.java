/* 1748022 김유진
 * 예외처리(try/catch/finally)
 * */

package Ex1;

public class ExceptionTest3 {
	
	public static void main (String[] args) {
		
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10/num;
			System.out.println("result = "+result);
		}
		//argument == null
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인자를 하나 입력해주세요.");
			
		}
		//argument == 32.01
		catch (NumberFormatException e) {
			System.out.println("인자를 정수 타입으로 입력해주세요.");
		}
		//argument ==0
		catch (ArithmeticException e) {
			System.out.println("정수를 0으로 나누면 안돼요.");
		}
		finally {
			System.out.println("반드시 실행될 영역.");
		}
		
	}

}
