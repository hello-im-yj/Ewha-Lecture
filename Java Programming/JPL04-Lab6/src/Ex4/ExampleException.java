/* 1748022 ������
 * ����ó��(����� ���� ���� Ŭ����)
 * */


package Ex4;

public class ExampleException {
	
	public static void main (String args[]) {
		ExceptionTest obj = new ExceptionTest();
		try {
			obj.foo(-10);
		}catch (MyException e) {
			System.out.println((e.getMessage()));
		}
		
		try {
			obj.goo(-1);
		}catch (MyRuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		//obj.foo(-1);
		obj.goo(-1);
	}

}
