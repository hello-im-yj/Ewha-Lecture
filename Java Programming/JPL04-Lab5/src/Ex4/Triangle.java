/* 1748022 ������
 * (����4) �������̽�
 * */

package Ex4;

public class Triangle implements ShapesInterface {
	
	int width, height;
	double area;
	
	public Triangle (int w,int h) { //������
		width = w; height = h;
	}

	@Override
	public void computeArea() {
		// TODO Auto-generated method stub
		area = (width*height)/2.0;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.print("Triangle : ");
		System.out.println(width + " " + height + " " +area+" " );
				
		
	}

}
