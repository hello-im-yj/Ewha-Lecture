/* 1748022 ������
 * (����3) �� ����, ���� ���ϴ� Ŭ����(static Ȱ��)
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
