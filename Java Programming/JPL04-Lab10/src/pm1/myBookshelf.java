package pm1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class myBookshelf extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myBookshelf frame = new myBookshelf();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public myBookshelf() {
		setTitle("\uB098\uC758 \uC11C\uC7AC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList bookList = new JList();
		bookList.setBounds(14, 62, 210, 193);
		contentPane.add(bookList);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("Book Information");
		lblNewLabel.setBounds(14, 24, 234, 26);
		contentPane.add(lblNewLabel);
		btnAdd.setBounds(258, 62, 105, 33);
		contentPane.add(btnAdd);
		
		JButton btnSelectAll = new JButton("Select All");
		btnSelectAll.setBounds(258, 102, 105, 33);
		contentPane.add(btnSelectAll);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setBounds(258, 142, 105, 33);
		contentPane.add(btnSelect);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(258, 182, 105, 33);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(258, 222, 105, 33);
		contentPane.add(btnDelete);
	}
}
