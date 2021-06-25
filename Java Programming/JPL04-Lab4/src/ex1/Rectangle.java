/* 1748022 김유진
 * (예제1) 2차원 도형
 * */

package ex1;

public class Rectangle extends TwoDShape {
	
	public double area() {
		return width*height;		
	}
	
	public boolean isSquare() {
		
		if (width == height) {
			return true;
		} else return false;
		
	}

}
