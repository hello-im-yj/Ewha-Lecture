/* 1748022 김유진
 * (예제6) 대입 연산자와 증감 연산자
 * */

package ex6;

public class UnaryOperator {
	
	public static void main (String args[]) {
		
		int opr = 0;
		opr +=3; //3
		System.out.println(opr++); //3, opr==4
		System.out.println(opr); //4
		System.out.println(++opr); //5
		System.out.println(opr); //5
		System.out.println(opr--); //5
		System.out.println(opr); //4
		System.out.println(--opr); //3
		System.out.println(opr);//3
	}

}
