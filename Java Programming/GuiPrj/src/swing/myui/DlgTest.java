package swing.myui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgTest extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textName;

	/**
			 * Launch the application.
			 *//*
				 * public static void main(String[] args) { try { DlgTest dialog = new
				 * DlgTest(); dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				 * dialog.setVisible(true); } catch (Exception e) { e.printStackTrace(); } }
				 */

	/**
	 * Create the dialog.
	 */
	public DlgTest() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		textName = new JTextField();
		textName.setBounds(14, 12, 188, 31);
		contentPanel.add(textName);
		textName.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String s = textName.getText(); //str타입으로 리턴 
						JOptionPane.showMessageDialog(null,"Your name is " + s);
						setVisible(true);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
