/* 1748022 ������
 * (����5) �ڵ��� ����
 * */

package ex5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RaceThread extends Thread {
	
	private JLabel label;
	private int x,y;
	private JFrame frame;
	
	//������
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
			x += 10*Math.random(); //(0~1)���� ���� �߻�
			label.setBounds(x,y,120,100); //���� ���� random�ϰ� ����
			frame.repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //0.1�ʸ��� ����
			
		}
	}

}
