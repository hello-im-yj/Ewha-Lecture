/* 1748022 ������
 * ����ó��(try/catch/finally)
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
			System.out.println("���ڸ� �ϳ� �Է����ּ���.");
			
		}
		//argument == 32.01
		catch (NumberFormatException e) {
			System.out.println("���ڸ� ���� Ÿ������ �Է����ּ���.");
		}
		//argument ==0
		catch (ArithmeticException e) {
			System.out.println("������ 0���� ������ �ȵſ�.");
		}
		finally {
			System.out.println("�ݵ�� ����� ����.");
		}
		
	}

}
