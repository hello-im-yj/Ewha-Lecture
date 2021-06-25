/* 1748022 김유진
 * (예제1) 2차원 도형
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
