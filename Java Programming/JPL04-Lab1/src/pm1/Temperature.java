/* 1748022 ±èÀ¯Áø
 * (½Ç½À1) ¼·¾¾ <-> È­¾¾ ¿Âµµ º¯È¯
 * */

package pm1;

import java.util.Scanner;

public class Temperature {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		double inputTemp = sc.nextDouble();
		
		switch (s) {
		
			case "¼·¾¾" : double F_temp = inputTemp*9.0/5.0+32.0; 
				System.out.println("È­¾¾ ¿Âµµ´Â "+F_temp);
				break;
			case "È­¾¾" : double C_temp = (inputTemp-32.0)*5.0/9.0; 
				System.out.println("¼·¾¾ ¿Âµµ´Â "+C_temp);
				break;
			default : System.out.println("Wrong Input");
		}
		
	}

}
