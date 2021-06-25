/* 1748022 김유진
 * 예외발생
 * */


package Test;

public class ExceptionTest1 {
	//argument를 아무것도 전달하지 않거나, 0을 전달할 경우 error (나눌 수 없음)
	
	public static void main (String[] args)  {
		
		int num = Integer.parseInt(args[0]); //args[0] =24, num =24
		int result = 10/num; //10/24 = 0
		
		System.out.println("result= "+result);
		
		System.out.println("프로그램 계속 실행???");
		
	}
}
