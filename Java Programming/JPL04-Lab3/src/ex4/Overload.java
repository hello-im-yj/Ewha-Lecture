/* 1748022 김유진
 * (예제4) 평균 구하는 매소드 오버로딩
 * */

package ex4;

public class Overload {
	
	public static double getAverage (double a, double b) {
		return (a+b)/2;
	}
	public static double getAverate (double a, double b, double c) {
		return (a+b+c)/3;
	}
	public static char getAverage (char a, char b) {
		return (char)((a+b)/2);
	}
	
	public static void main (String args[]) {
		
		double average1 = Overload.getAverage(40.0, 50.0);
		double average2 = Overload.getAverate(1.0, 2.0, 3.0);
		char average3 = Overload.getAverage('a', 'c');
		
		System.out.println(average1);
		System.out.println(average2);
		System.out.println(average3);
		
	}

}
