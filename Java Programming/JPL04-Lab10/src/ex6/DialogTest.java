package ex6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyDialog extends JDialog {
	
	JTextField txtName = new JTextField(10);
	JButton btnOk = new JButton("OK");
	
	public MyDialog(JFrame frame, String title) {
		super(frame,title);
		setLayout(new FlowLayout());
		add(txtName);
		add(btnOk);
		setSize(200,100);
		
		btnOk.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s = txtName.getText();
				JOptionPane.showMessageDialog(frame,"Your name is " + s);
				setVisible(true);
			}
			
		});
		
	}
}

public class DialogTest extends JFrame {
	
	MyDialog dlg;
	
	public DialogTest() {
		super("DialogEX 예제프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Show Dialog");
		dlg = new MyDialog(this,"Test Dialog");
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dlg.setVisible(true);
			}
		});
		
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
		
	}
	
	public static void main (String args[]) {
		DialogTest dtest = new DialogTest();
	}

}
