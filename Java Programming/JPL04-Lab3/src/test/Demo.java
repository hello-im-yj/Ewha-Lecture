/* 1748022 김유진
 * 메서드 오버로딩
 * */

package test;

public class Demo {
	
	public static void main (String args[]) {
		
		Calculation calc = new Calculation();
		
		int r1 = calc.sum(10, 10, 20);
		int r2 = calc.sum(10, 20);
		double r3 = calc.sum(10.0,20.0);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
	}

}
