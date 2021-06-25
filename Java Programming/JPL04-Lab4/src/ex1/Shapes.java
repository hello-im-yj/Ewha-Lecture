/* 1748022 김유진
 * (예제1) 2차원 도형
 * */

package ex1;

public class Shapes {
	
	public static void main (String args[]) {
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "isosceles"; //이등변삼각형
		
		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "right"; //직각삼각형
		
		System.out.println("Info for t1:");
		t1.showStyle();
		t1.showDim();
		
		System.out.println("\nInfo for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is "+t2.area());
		
	}

}
