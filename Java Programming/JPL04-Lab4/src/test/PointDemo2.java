/* 1748022 ±èÀ¯Áø
 * »ó¼Ó°³³ä
 * */

package test;

public class PointDemo2 {
	
	public static void main (String[] args) {
		Point p = new Point();
		p.set(10, 20);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPrint();
	}

}
