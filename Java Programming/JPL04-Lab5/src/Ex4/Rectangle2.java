/* 1748022 김유진
 * (예제4) 인터페이스
 * */

package Ex4;

public class Rectangle2 implements ShapesInterface {
	
	int width, height;
	double area;
	
	public Rectangle2(int w) {
		width = w;
		height = w;
	}

	@Override
	public void computeArea() {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle2: ");
		System.out.println(width +" "+height+" "+area+" " );
		
	}
	
	

}
