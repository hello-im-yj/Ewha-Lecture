/* 1748022 김유진
 * (예제 1-2) 버튼 텍스트 바꾸기
 * */

package ex1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame {
	
	public AnonymousClassListener() {
		setTitle("Action  이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if (b.getText().equals("Action")) {
					b.setText("액션");
				}
				else if (b.getText().equals("액션")) {
					b.setText("Action");
				}
				setTitle(b.getText()); //JFrame멤버도 자유롭게 호출 가능
			}
		});
		
		setSize(350,150);
		setVisible(true);
	}
	
	public static void main (String[] agrs) {
		new AnonymousClassListener();
	}

}
