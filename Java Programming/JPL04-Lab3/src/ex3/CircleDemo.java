/* 1748022 김유진
 * (예제3) 원 면적, 원주 구하는 클래스(static 활용)
 * */

package ex3;

import java.util.Scanner;

public class CircleDemo {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		double r =sc.nextDouble();
		System.out.println("면적은 "+Circle.area(r)+ " 원주는 "+Circle.circum(r));
		
		
	}

}
