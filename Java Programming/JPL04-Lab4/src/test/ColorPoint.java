/* 1748022 ������
 * ��Ӱ���
 * */
package test;

public class ColorPoint extends Point {
	

		String color; //�տ� color�� �� Ŭ������ color
		
		void setColor(String color) { 
			this.color = color; //�ڿ� color�� ���� �Ű������� ������ color
		}
		
		void showColorPrint() {
			System.out.println(color);
			showPoint();
		}
		
}
