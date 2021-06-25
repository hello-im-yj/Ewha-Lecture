/* 1748022 김유진
 * 
 * */

package test;

/*class Rectangle {
	
	public int width;
	public int height;
	public int area;
		
}*/


// class를 여러개 쓰고 싶다면 앞에 public을 지우고 써줘야함.

public class RectangleDemo1 {
	

	public static void main (String[] args) {
		
		Rectangle R1 = new Rectangle();
		Rectangle R2 = new Rectangle();
		
		R1.width = 10;
		R1.height = 20;
		R1.area = R1.width * R1.height;
		
		R2.width = 20;
		R2.height = 30;
		R2.area = R2.width * R2.height;
		
		
	}
	

}

