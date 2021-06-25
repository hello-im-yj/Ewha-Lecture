/* 1748022 김유진
 * 단항연산, 비트전환연산, 시프트연산, 조건연산 Test
 * */

package test;

public class OperatorTest {
	
	public static void main (String args[]) {
		
		//비트전환연산자 ~ : 1<->0 전환, 정수의 경우 -(값)-1의 값을 가질 것.
		int a =10;
		System.out.println(~a);
		
		//시프트연산 (>>,<<) 2의 n승을 곱하거나 나눠서 2진수를 n칸 이동시킴.
		int a1 = 8<<2;
		int b1 = 8>>2;
		
		System.out.println(a1);
		System.out.println(b1);
		
		//조건연산(?:) , 대입연산 바로 한단계 앞 우선순위... 각 항 모두 계산한 후 t/f 비교
		int x = -10;
		int absX = x>=0? x:-x;
		System.out.println(absX);
		
		/*//단항연산
		 
		int a = 0;
		System.out.println(a++);  // a=1, return =0
		int b = 0;
		System.out.println(b--); // b=-1, return =0
		int c = 0;
		System.out.println(++c); //c=1, return = 1
		int d = 0;
		System.out.println(--d); //d=-1, return=-1
		
		
		System.out.println("=======");
		
		int i = 0;
		System.out.println(i++); //i=1, return=0
		System.out.println(i--); //i=0, return=1
		System.out.println(++i); //i=1, return=1
		System.out.println(--i); //i=0, return=0
		System.out.println(i); //i=0
		
		* 
		 */
	}

}
