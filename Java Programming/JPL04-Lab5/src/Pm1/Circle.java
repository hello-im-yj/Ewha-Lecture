
/* 1748022 ������
 * (�ǽ�1) ���� ����/�ѷ� ���ϱ�
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
