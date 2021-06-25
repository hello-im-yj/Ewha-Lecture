package test;

public class RectangleDemo3 {
	
	public static void main (String[] args) {
		
		Rectangle R1 = new Rectangle (10,20);
		Rectangle R2 = new Rectangle (20,30);
		
		R1.computeArea();
		R2.computeArea();
		
		System.out.println("R1 면적은 " + R1.showArea());
		System.out.println("R2 면적은 " + R2.showArea());
		
	}

}
