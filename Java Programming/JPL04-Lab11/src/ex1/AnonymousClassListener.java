/* 1748022 ������
 * (���� 1-2) ��ư �ؽ�Ʈ �ٲٱ�
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
		setTitle("Action  �̺�Ʈ ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if (b.getText().equals("Action")) {
					b.setText("�׼�");
				}
				else if (b.getText().equals("�׼�")) {
					b.setText("Action");
				}
				setTitle(b.getText()); //JFrame����� �����Ӱ� ȣ�� ����
			}
		});
		
		setSize(350,150);
		setVisible(true);
	}
	
	public static void main (String[] agrs) {
		new AnonymousClassListener();
	}

}
