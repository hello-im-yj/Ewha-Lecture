/* 1748022 김유진
 * (예제4) 인터페이스
 * */

package Ex4;

public class ShapeDemo {
	
	public static void main (String args[]) {
		Triangle t1 = new Triangle(3,4);
		Rectangle r1 = new Rectangle(4,5);
		ColorTriangle ct1 = new ColorTriangle(6,7,"red");
		Rectangle2 r2 = new Rectangle2(7);
		Rectangle r3 = new Rectangle(10,12);
		
		ShapesInterface s[] = new ShapesInterface[5];
		
		s[0] = t1;
		s[1] = r1;
		s[2] = ct1;
		s[3] = r2;
		s[4] = r3;
		
		for(int i=0;i<s.length;i++) {
			s[i].computeArea();
			s[i].show();
		}
		
		System.out.println("Rectangle만 출력");
		for (int i=0;i<s.length;i++) {
			if (s[i] instanceof Rectangle) s[i].show();
		}
		
		System.out.println("ColorTriangle만 출력");
		for (int i =0; i<s.length;i++) {
			if (s[i] instanceof ColorTriangle) s[i].show();
		}
		
		System.out.println("Triangle만 출력");
		for (int i=0;i<s.length;i++) {
			if (s[i] instanceof Triangle && !(s[i] instanceof ColorTriangle)) s[i].show();
		}
		
		
 	}

}
