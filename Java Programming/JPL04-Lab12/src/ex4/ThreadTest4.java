/* 1748022 김유진
 * (예제4) 타이머 스레드
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
		while (true) { // n 1씩 증가.
			timerLable.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); //1초 지연 후 
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
		//생성자 호출 시 할 작업들
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		getContentPane().setLayout(new BorderLayout(0,0));
		
		JLabel timerLabel = new JLabel();
		timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timerLabel.setFont(new Font ("Gothic",Font.ITALIC,80));
		c.add(timerLabel,BorderLayout.CENTER);
		
		//쓰레드 생성
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(300,270);
		setVisible(true);
		
		//쓰레드 시작
		th.start();
		
		JButton btn = new JButton();
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = String.format("현재 %d 번째 버튼을 클릭했습니다.", cnt++); //format형식으로 출력된 string을 반환
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
