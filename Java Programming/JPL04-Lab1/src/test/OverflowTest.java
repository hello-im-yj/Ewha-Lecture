/* 1748022 김유진
 * 산술연산자 Overflow Test
 * */

package test;

public class OverflowTest {
	
	public static void main (String args[]) {
		
		
		int a = 1000000;
		int b = 2000000;
		
		long c1 = a*b; //이미 int*int 연산에서 오버플로우 난 것을 long으로 옮겨담음! 
		long c2 = (long)a*b; //정상출력
		System.out.println(c1);
		
		/*	
		byte a = 10;
		byte b = 20;
		
		//byte c = a+b;
		//byte c = (byte)a + b;  
		 * // byte+byte 연산하면 int 로 변환되는데 int의 data type의 크기가 더 크므로 byte에 옮겨담을 수 없다. 
		byte c = (byte)(a+b);
		System.out.println(c);
		
		*/
				
	
	}

}
