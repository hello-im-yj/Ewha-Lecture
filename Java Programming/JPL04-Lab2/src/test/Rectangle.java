/* 1748022 ±èÀ¯Áø
 * 
 * */

package test;

public class Rectangle {

	private int width;
	private int height;
	private int area;

	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}

	public void computeArea() {
		area = width * height;
	}
	
	public int showWidth() {
		return width;
	}
	
	public int showHeight() {
		return height;
	}
	
	public int showArea() {
		return area;
	}

	
}
