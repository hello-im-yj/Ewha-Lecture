/* 1748022 ������
 * ���ܹ߻�
 * */


package Test;

public class ExceptionTest1 {
	//argument�� �ƹ��͵� �������� �ʰų�, 0�� ������ ��� error (���� �� ����)
	
	public static void main (String[] args)  {
		
		int num = Integer.parseInt(args[0]); //args[0] =24, num =24
		int result = 10/num; //10/24 = 0
		
		System.out.println("result= "+result);
		
		System.out.println("���α׷� ��� ����???");
		
	}
}
