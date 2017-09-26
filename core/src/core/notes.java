package core;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.math.*;
import javax.swing.JTextArea;
import java.awt.Color;

public class notes extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	JButton btnNewButton;
	JButton btnNewButton_1;
	JTextArea txtarea ;
	



/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					notes frame = new notes();
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
	public notes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Publish");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(61, 228, 124, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(227, 228, 103, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		textField = new JTextField();
		textField.setBounds(152, 14, 255, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTopic = new JLabel("Topic");
		lblTopic.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTopic.setBounds(10, 14, 91, 20);
		contentPane.add(lblTopic);
		
		 txtarea = new JTextArea();
		txtarea.setBackground(Color.WHITE);
		txtarea.setText("Dear Students,");
		txtarea.setForeground(Color.BLACK);
		txtarea.setBounds(10, 59, 414, 158);
		contentPane.add(txtarea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(	e.getSource()==	btnNewButton)
		{	Connection con=dbinfo.con;
	    String query="insert into note values(?,?,?)";
	    String nname=textField.getText();
	    String nmat=txtarea.getText();
	   
	    
	   try
		{
			PreparedStatement ps=con.prepareStatement(query);
	    	ps.setString(1,nname);
	    	ps.setString(2,nmat);
   	        ps.setInt(3,0);
	    int n=ps.executeUpdate();
			System.out.println(n);
		}
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}
	   JOptionPane.showMessageDialog(this, "Successfully Done", "Done", JOptionPane.CLOSED_OPTION);
	   admin ad=new admin();
		ad.setVisible(true);
		dispose();
		}
		if(	e.getSource()==	btnNewButton_1)
			
		{
		int re=  JOptionPane.showConfirmDialog(this, "do you want to cancel", "Sure", JOptionPane.YES_NO_OPTION);
		if(re==JOptionPane.YES_NO_OPTION)
		{admin ad=new admin();
		ad.setVisible(true);
		dispose();}
		
		
		
		}
	
	
	}
}
