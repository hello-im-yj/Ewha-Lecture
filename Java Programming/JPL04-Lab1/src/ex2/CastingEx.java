/* 1748022 ������
 * (����2) �ڷ�����ȯ
 * */

package ex2;

public class CastingEx {
	
	public static void main (String args[]) {
		
		byte b = 10;
		int i = (int)b; // int ����ȯ ��� ���� ��. -> �ڵ�����ȯ, ��->ū type
		System.out.println("i="+i);
		System.out.println("b="+b);
		
		int i2 = 300;
		byte b2 = (byte)i2; //���� ĳ���� �� ���� ������ �����÷ο�
		System.out.println("i2 ="+ i2);
		System.out.println("b2 = " +b2);
		
		
		int a = 10;
		//byte b1 = a; // int�� byte�� �ű��� ����!
		byte b2_1 = 10; 
		//byte b3 = 129; // ����. byte�� 128������ ���� �� ���� 2^7 !! (8bit �ε� ���� ���ڸ��� ��/�� ����)
		//byte�� ���� ���̻� ������ ����. short��. long�� L�ٿ���� ��.
		//float f1 = 1.2; //�Ǽ��� �⺻ data type�� double��. ū�� -> ���� ������ data �Űܴ��� �� ��� (float) �� ����ȯ ������� ��. 
		float f2 = 1.2f; //Ȥ�� �̷��� f�� ���̻�� �ֵ���.
		
		
	}

}
