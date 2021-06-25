/* 1748022 ������
 * (����4) Ÿ�̸� ������
 * */

package ex4;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

class TimerThread extends Thread {
	private JLabel timerLable;
	
	public TimerThread(JLabel timerLable) {
		this.timerLable=timerLable;
	}
	
	public void run() {
		int n=0;
		while (true) { // n 1�� ����.
			timerLable.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); //1�� ���� �� 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}
}

class MyFrame extends JFrame {
	
	private int cnt = 1;
	
	public MyFrame() {
		//������ ȣ�� �� �� �۾���
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		getContentPane().setLayout(new BorderLayout(0,0));
		
		JLabel timerLabel = new JLabel();
		timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timerLabel.setFont(new Font ("Gothic",Font.ITALIC,80));
		c.add(timerLabel,BorderLayout.CENTER);
		
		//������ ����
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(300,270);
		setVisible(true);
		
		//������ ����
		th.start();
		
		JButton btn = new JButton();
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = String.format("���� %d ��° ��ư�� Ŭ���߽��ϴ�.", cnt++); //format�������� ��µ� string�� ��ȯ
				JOptionPane.showMessageDialog(null, s);
			}
		});
		
		btn.setText("Click me!");
		c.add(btn,BorderLayout.SOUTH);
		
	}//end of MyFrame();

}

public class ThreadTest4 {
	
	public static void main (String args[]) {
		new MyFrame();
	}
}
