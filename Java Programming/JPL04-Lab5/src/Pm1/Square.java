/* 1748022 ������
 * (�ǽ�1) ���� ����/�ѷ� ���ϱ�
 * */

package Pm1;

public class Square implements Geometry {
	
	Double side;
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}
	
	

}
