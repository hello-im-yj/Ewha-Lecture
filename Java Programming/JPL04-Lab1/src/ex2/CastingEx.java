/* 1748022 김유진
 * (예제2) 자료형변환
 * */

package ex2;

public class CastingEx {
	
	public static void main (String args[]) {
		
		byte b = 10;
		int i = (int)b; // int 형변환 없어도 들어가긴 함. -> 자동형변환, 작->큰 type
		System.out.println("i="+i);
		System.out.println("b="+b);
		
		int i2 = 300;
		byte b2 = (byte)i2; //강제 캐스팅 할 수는 있지만 오버플로우
		System.out.println("i2 ="+ i2);
		System.out.println("b2 = " +b2);
		
		
		int a = 10;
		//byte b1 = a; // int를 byte로 옮기지 못함!
		byte b2_1 = 10; 
		//byte b3 = 129; // 오류. byte는 128까지만 담을 수 있음 2^7 !! (8bit 인데 앞의 한자리는 음/양 구별)
		//byte는 따로 접미사 붙이지 않음. short도. long은 L붙여줘야 함.
		//float f1 = 1.2; //실수의 기본 data type은 double임. 큰곳 -> 작은 곳으로 data 옮겨담을 수 없어서 (float) 로 형변환 시켜줘야 함. 
		float f2 = 1.2f; //혹은 이렇게 f를 접미사로 넣든지.
		
		
	}

}
