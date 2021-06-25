/* 1748022 ������
 * ����ó��(����� ���� ���� Ŭ����)
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
		if (n<0) throw new MyRuntimeException("������ �Ű������� ���� �� ����.");
		else System.out.println("goo(int) : "+n);
	}
	
}