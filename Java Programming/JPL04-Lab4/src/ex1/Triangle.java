/* 1748022 ������
 * (����1) 2���� ����
 * */

package ex1;

public class Triangle extends TwoDShape {
	
	public String style;
	public double area() {
		return width * height/2;
	}
	
	public void showStyle() {
		System.out.println("Triangle is" + style);
		
	}

}
