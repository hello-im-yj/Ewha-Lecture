/* 1748022 김유진
 * (실습5) 자동차 경주
 * */

package ex5;

import javax.swing.JFrame;

public class CarGame extends JFrame {
	
	//construct.
	public CarGame() {
		setTitle("CarRace");
		setSize(1600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		RaceThread car1 = new RaceThread(this,"car1.png",100,0);
		RaceThread car2 = new RaceThread(this,"car2.png",100,80);
		RaceThread car3 = new RaceThread(this,"car3.png",100,160);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
		
	}
	
	public static void main (String args[]) {
		CarGame t = new CarGame();
	}

}
