/* 1748022 ������
 * ��������� Overflow Test
 * */

package test;

public class OverflowTest {
	
	public static void main (String args[]) {
		
		
		int a = 1000000;
		int b = 2000000;
		
		long c1 = a*b; //�̹� int*int ���꿡�� �����÷ο� �� ���� long���� �Űܴ���! 
		long c2 = (long)a*b; //�������
		System.out.println(c1);
		
		/*	
		byte a = 10;
		byte b = 20;
		
		//byte c = a+b;
		//byte c = (byte)a + b;  
		 * // byte+byte �����ϸ� int �� ��ȯ�Ǵµ� int�� data type�� ũ�Ⱑ �� ũ�Ƿ� byte�� �Űܴ��� �� ����. 
		byte c = (byte)(a+b);
		System.out.println(c);
		
		*/
				
	
	}

}
