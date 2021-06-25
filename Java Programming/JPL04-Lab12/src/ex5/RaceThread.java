/* 1748022 김유진
 * (예제5) 자동차 경주
 * */

package ex5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RaceThread extends Thread {
	
	private JLabel label;
	private int x,y;
	private JFrame frame;
	
	//생성자
	public RaceThread(JFrame frame, String fname, int x, int y) {

		this.frame = frame;
		this.x=x;
		this.y=y;

		label = new JLabel();
		label.setIcon(new ImageIcon(fname));
		label.setBounds(x,y,120,100);
		this.frame.add(label);
		
	}
	
	public void run () {
		for (int i=0;i<200;i++) {
			x += 10*Math.random(); //(0~1)사이 난수 발생
			label.setBounds(x,y,120,100); //가로 길이 random하게 증가
			frame.repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //0.1초마다 변함
			
		}
	}

}
