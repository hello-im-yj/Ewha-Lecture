/* 1748022 김유진
 * (예제4) 인터페이스
 * */

package Ex4;

public class Triangle implements ShapesInterface {
	
	int width, height;
	double area;
	
	public Triangle (int w,int h) { //생성자
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
