/* 1748022 ������
 * (����4) �������̽�
 * */

package Ex4;

public class Rectangle implements ShapesInterface {
	
	int width, height;
	double area;
	
	public Rectangle (int w, int h) {
		width = w; height = h;		
		
	}

	@Override
	public void computeArea() {
		// TODO Auto-generated method stub
		area = width*height;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.print("Rectangle : ");
		System.out.println(width + " "+height+" " + area);
	}

}
