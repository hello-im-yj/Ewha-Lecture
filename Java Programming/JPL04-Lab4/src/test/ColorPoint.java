/* 1748022 김유진
 * 상속개념
 * */
package test;

public class ColorPoint extends Point {
	

		String color; //앞에 color는 이 클래스의 color
		
		void setColor(String color) { 
			this.color = color; //뒤에 color는 여기 매개변수로 들어오는 color
		}
		
		void showColorPrint() {
			System.out.println(color);
			showPoint();
		}
		
}
