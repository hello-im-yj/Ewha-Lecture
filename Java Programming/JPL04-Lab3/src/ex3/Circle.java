/* 1748022 김유진
 * (예제3) 원 면적, 원주 구하는 클래스(static 활용)
 * */

package ex3;

public class Circle {
	
	final static double PI = 3.14159;
	
	static double area(double radius) {
		return radius*radius*PI;
	}
	
	static double circum(double radius) {
		return radius*PI*2;
	}
}
