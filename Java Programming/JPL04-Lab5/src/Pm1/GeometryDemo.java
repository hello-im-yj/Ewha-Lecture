/* 1748022 김유진
 * (실습1) 도형 면적/둘레 구하기
 * */

package Pm1;

import java.util.Scanner;

public class GeometryDemo {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Triangle t1 = new Triangle();
		Square s1 = new Square();
		Circle c1 = new Circle();
		
		System.out.println("Input radius for a circle");
		c1.radius= sc.nextDouble();
		
		System.out.println("Input length for a square");
		s1.side = sc.nextDouble();

		System.out.println("Input a for a triangle");
		t1.a = sc.nextDouble();
		
		System.out.println("Input b for a triangle");
		t1.b = sc.nextDouble();

		System.out.println("Input c for a triangle");
		t1.c = sc.nextDouble();

		System.out.println("<Circle>");
		System.out.println("Area:"+c1.area());
		System.out.println("Circumference:"+c1.perimeter());
		
		System.out.println("<Square>");
		System.out.println("Area:"+s1.area());
		System.out.println("Circumference:"+s1.perimeter());
		
		System.out.println("<Triangle>");
		System.out.println("Area:"+t1.area());
		System.out.println("Circumference:"+t1.perimeter());
		
		
		
				
				
	}
	

}
