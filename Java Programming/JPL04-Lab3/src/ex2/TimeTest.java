/* 1748022 ±èÀ¯Áø
 * (¿¹Á¦2) Time °´Ã¼¹è¿­
 * */

package ex2;

import java.util.Scanner;

public class TimeTest {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many times do yo want to generate?");
		int n=sc.nextInt();
		Time[] t =new Time[n];
		
		for (int i=0;i<t.length;i++)	{
			t[i] = new Time(); //°´Ã¼ »ý¼º Áß¿ä!
 			t[i].hour = (int)(Math.random()*24);
			t[i].minute =(int)(Math.random()*60);
			t[i].second = (int)(Math.random()*60);
			
			System.out.println("<time"+(i+1)+"> "+" Hour :"+t[i].hour+" Min : "+t[i].minute+"sec : "+t[i].second);
		}
		
		
		/*int num = sc.nextInt();
		int TimeArr[][] = new int[num][3];
		
		for (int i =0; i<TimeArr.length;i++) {
			TimeArr[i][0] = (int)(Math.random()*24);
			TimeArr[i][1] = (int)(Math.random()*60);
			TimeArr[i][2] = (int)(Math.random()*60);
			System.out.println("<time"+i+"> "+" Hour :"+TimeArr[i][0]+" Min : "+TimeArr[i][1]+"sec : "+TimeArr[i][2]);
		}
		*/
	}

}
