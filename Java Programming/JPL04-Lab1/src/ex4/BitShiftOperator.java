/* 1748022 ������
 * (����4) ��Ʈ �����ڿ� ����Ʈ ������
 * */

package ex4;

public class BitShiftOperator {
	
	public static void main (String args[]) {
		short a = (short)0x55ff;
		short b = 0x00ff;
		//��Ʈ����
		System.out.printf("%x\n", a&b); //ff
		System.out.printf("%x\n", a|b); //55ff
		System.out.printf("%x\n", a^b); //5500
		
		byte c = 20; //0x14
		byte d = -8; //0xf8
		//����Ʈ����
		System.out.println(c<<2); //80
		System.out.println(c>>2); //5
		System.out.println(d>>2); //-2
		System.out.printf("%x\n",d>>>2); //unsigned ������, ���� �����Ϳ� ������� ���������� �̵� �� ����� ������ 0���� ä��.
		//3ffffffe
	}

}
