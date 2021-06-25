/* 1748022 김유진
 * 예외처리(throw)
 * */

package Ex3;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main (String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		
		try {
			System.out.println("Enter number of dounuts : ");
			int dounutCount = keyboard.nextInt();
			
			System.out.println("Enter number of glasses of milk:" );
			int milkCount = keyboard.nextInt();
			
			if (milkCount<1) throw new Exception("Exception : no milk!" );
			
			double dounutsPerGlass = dounutCount/(double)milkCount;
			System.out.println(dounutCount + " dounuts");
			System.out.println(milkCount+" glass of milk");
			System.out.println("you have "+dounutsPerGlass+" dounuts for each glass of milk." );

		}
		
		catch (Exception e){
			System.out.println( e.getMessage());
			System.out.println("Go buy some milk.");
		
		}
	
		System.out.println("End of Program");
	}

}
