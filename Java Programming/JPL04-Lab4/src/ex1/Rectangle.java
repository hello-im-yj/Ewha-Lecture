/* 1748022 ������
 * (����1) 2���� ����
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
