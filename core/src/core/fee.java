package core;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class fee extends JFrame implements ActionListener {

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
					fee frame = new fee();
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
	public fee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCoreJava = new JLabel("Core Java");
		lblCoreJava.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCoreJava.setBounds(41, 22, 95, 14);
		contentPane.add(lblCoreJava);
		
		JLabel lblAdvanceJava = new JLabel("Advance Java");
		lblAdvanceJava.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdvanceJava.setBounds(41, 63, 123, 14);
		contentPane.add(lblAdvanceJava);
		
		JLabel lblAdmin = new JLabel("Admin 1");
		lblAdmin.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdmin.setBounds(41, 104, 95, 14);
		contentPane.add(lblAdmin);
		
		JLabel lblAdmin_1 = new JLabel("Admin 2");
		lblAdmin_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdmin_1.setBounds(41, 143, 95, 14);
		contentPane.add(lblAdmin_1);
		
		JLabel lblAdmin_2 = new JLabel("Admin 3");
		lblAdmin_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdmin_2.setBounds(41, 182, 95, 14);
		contentPane.add(lblAdmin_2);
		
		JLabel lblSsp = new JLabel("SSP");
		lblSsp.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSsp.setBounds(41, 217, 82, 14);
		contentPane.add(lblSsp);
		
		JLabel lblJambo = new JLabel("Jambo");
		lblJambo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblJambo.setBounds(41, 242, 82, 14);
		contentPane.add(lblJambo);
		
		textField = new JTextField();
		textField.setBounds(228, 22, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(228, 53, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(228, 98, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(228, 129, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(228, 182, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(228, 217, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(228, 242, 86, 20);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("update");
		btnNewButton.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(335, 101, 89, 76);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String s1=textField.getText();
		String s2=textField_1.getText();
		String s3=textField_2.getText();
		String s4=textField_3.getText();
		String s5=textField_4.getText();
		String s6=textField_5.getText();
		String s7=textField_6.getText();
		
		Connection con=dbinfo.con;
	    String query="update course SET fee=? where cid=11";
	   
	   try
		{
			PreparedStatement ps=con.prepareStatement(query);
	    	ps.setString(1,s1);
	    	
	    int n=ps.executeUpdate();
			
		}	catch(Exception edb)
		{
			   edb.printStackTrace();
		}
	
   query="update course SET fee=? where cid=12";
	   
	   try
		{
			PreparedStatement ps=con.prepareStatement(query);
	    	ps.setString(1,s2);
	    	
	    int n=ps.executeUpdate();
			
		}
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}
	
	   
	   query="update course SET fee=? where cid=13";
		   
		   try
			{
				PreparedStatement ps=con.prepareStatement(query);
		    	ps.setString(1,s3);
		    	
		    int n=ps.executeUpdate();
				
			}
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}

		   query="update course SET fee=? where cid=14";
			   
			   try
				{
					PreparedStatement ps=con.prepareStatement(query);
			    	ps.setString(1,s4);
			    	
			    int n=ps.executeUpdate();
					
				}
			catch(Exception edb)
			{
				   edb.printStackTrace();
			}

			   query="update course SET fee=? where cid=15";
				   
				   try
					{
						PreparedStatement ps=con.prepareStatement(query);
				    	ps.setString(1,s5);
				    	
				    int n=ps.executeUpdate();
						
					}
				catch(Exception edb)
				{
					   edb.printStackTrace();
				}

				   query="update course SET fee=? where cid=16";
					   
					   try
						{
							PreparedStatement ps=con.prepareStatement(query);
					    	ps.setString(1,s6);
					    	
					    int n=ps.executeUpdate();
							
						}
					catch(Exception edb)
					{
						   edb.printStackTrace();
					}

					   query="update course SET fee=? where cid=17";
						   
						   try
							{
								PreparedStatement ps=con.prepareStatement(query);
						    	ps.setString(1,s7);
						    	
						    int n=ps.executeUpdate();
								
							}
						catch(Exception edb)
						{
							   edb.printStackTrace();
						}
					   
		
	}
}
