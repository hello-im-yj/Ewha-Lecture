package test;


public class RectangleDemo2 {
	
	public static void main (String[] args) {
		
		Rectangle R1 = new Rectangle (10,20);
		Rectangle R2 = new Rectangle (20,30);
		
		//R1.area = R1.width * R1.height;
		//R2.area = R2.width * R2.height;
		
		R1.computeArea();
		R2.computeArea();
		
		System.out.println("R1 면적은 " + R1.area);
		System.out.println("R2 면적은 " + R2.area);
		
	}

}
