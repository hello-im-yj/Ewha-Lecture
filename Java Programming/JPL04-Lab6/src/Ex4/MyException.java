/* 1748022 김유진
 * 예외처리(사용자 정의 예외 클래스)
 * */

package Ex4;

public class MyException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Negative Integer!!!";
	}
	
}

class MyRuntimeException extends RuntimeException {
	
	public MyRuntimeException (String errmsg) {
		super(errmsg);
	}
}

class ExceptionTest {
	
	public void foo(int n) throws MyException {
		if(n<0) throw new MyException();
		else System.out.println(("foo (int) : "+n));
	}
	
	public void goo(int n) throws MyRuntimeException {
		if (n<0) throw new MyRuntimeException("음수가 매개변수로 들어올 수 없다.");
		else System.out.println("goo(int) : "+n);
	}
	
}