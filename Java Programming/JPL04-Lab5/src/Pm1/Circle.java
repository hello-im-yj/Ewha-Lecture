
/* 1748022 김유진
 * (실습1) 도형 면적/둘레 구하기
 * */

package Pm1;

public class Circle implements Geometry {
	
	double radius;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return radius*radius*PI;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*radius*PI;
	}

}
