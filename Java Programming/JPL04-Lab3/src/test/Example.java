/* 1748022 김유진
 * Math Class 활용
 * */

package test;

//math는 모든 class 필드/매소드가 static으로 정의. 클래스명.매소드명()으로 접근가능!
public class Example {
	
	public static void main (String args[]) {
		System.out.println(Math.pow(5.0, 2.0));
		System.out.println(Math.sqrt(25.0));
		System.out.println(Math.cbrt(27.0));
		
		System.out.println(Math.log(10.0));
		System.out.println(Math.log(Math.E));
		System.out.println(Math.log10(10.0));
		
		System.out.println(Math.sin(getRadian(60.0)));
		System.out.println(Math.cos(getRadian(60.0)));
		System.out.println(Math.tan(getRadian(60.0)));
		
		System.out.println(Math.abs(-10));
		System.out.println(Math.max(100,50));
		System.out.println(Math.min(100, 50));
		
	}
	
	//math는 삼각함수에 radian값을 받음. 
	public static double getRadian(double num) {
		return num*Math.PI/180.0;
	}

}
