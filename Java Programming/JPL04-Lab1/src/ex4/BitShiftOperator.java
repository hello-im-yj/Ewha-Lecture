/* 1748022 김유진
 * (예제4) 비트 연산자와 시프트 연산자
 * */

package ex4;

public class BitShiftOperator {
	
	public static void main (String args[]) {
		short a = (short)0x55ff;
		short b = 0x00ff;
		//비트연산
		System.out.printf("%x\n", a&b); //ff
		System.out.printf("%x\n", a|b); //55ff
		System.out.printf("%x\n", a^b); //5500
		
		byte c = 20; //0x14
		byte d = -8; //0xf8
		//시프트연산
		System.out.println(c<<2); //80
		System.out.println(c>>2); //5
		System.out.println(d>>2); //-2
		System.out.printf("%x\n",d>>>2); //unsigned 연산자, 원본 데이터에 상관없이 오른쪽으로 이동 후 빈공간 무조건 0으로 채움.
		//3ffffffe
	}

}
