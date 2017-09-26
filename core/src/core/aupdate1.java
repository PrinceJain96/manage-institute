package core;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class aupdate1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aupdate1 frame = new aupdate1();
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
	public aupdate1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdmin = new JLabel("Name");
		lblAdmin.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdmin.setBounds(33, 11, 85, 14);
		contentPane.add(lblAdmin);
		
		JLabel lblSid = new JLabel("S.I.D.");
		lblSid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSid.setBounds(33, 36, 63, 14);
		contentPane.add(lblSid);
		
		JLabel lblCollage = new JLabel("Collage");
		lblCollage.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCollage.setBounds(33, 61, 85, 14);
		contentPane.add(lblCollage);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCourse.setBounds(33, 86, 73, 14);
		contentPane.add(lblCourse);
		
		JLabel lblEmailId = new JLabel("Email I.D.");
		lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmailId.setBounds(33, 111, 97, 28);
		contentPane.add(lblEmailId);
		
		JLabel lblContact = new JLabel("Date");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContact.setBounds(33, 175, 85, 14);
		contentPane.add(lblContact);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("First");
		//chckbxNewCheckBox.setEnabled(false);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxNewCheckBox.setBounds(43, 196, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(148, 228, 89, 23);
		contentPane.add(btnBack);
		
		JCheckBox chckbxThird = new JCheckBox("Third");
		chckbxThird.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxThird.setBounds(319, 196, 97, 23);
		contentPane.add(chckbxThird);
		
		JCheckBox chckbxSecond = new JCheckBox("Second");
		chckbxSecond.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxSecond.setBounds(172, 196, 97, 23);
		contentPane.add(chckbxSecond);
		
		JLabel label = new JLabel("Contact");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(33, 150, 85, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(164, 11, 205, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(164, 36, 205, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(164, 61, 205, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(164, 86, 205, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(164, 118, 205, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(164, 150, 205, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(164, 175, 205, 20);
		contentPane.add(textField_6);
	}
}
