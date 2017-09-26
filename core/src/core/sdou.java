package core;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class sdou extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	JButton btnSubmit ;
	JButton btnBack ;
	JTextArea textArea ;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sdou frame = new sdou();
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
	public sdou() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTopic = new JLabel("Topic");
		lblTopic.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTopic.setBounds(27, 28, 57, 32);
		contentPane.add(lblTopic);
		
		textField = new JTextField();
		textField.setBounds(154, 37, 270, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(37, 79, 387, 144);
		contentPane.add(textArea);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubmit.setBounds(47, 228, 147, 23);
		contentPane.add(btnSubmit);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(254, 228, 89, 23);
		contentPane.add(btnBack);
		btnSubmit.addActionListener(this);
btnBack.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnSubmit)
		{
			
			Connection con=dbinfo.con;
		    String query="insert into dou values(?,?,?,?,?)";
		    String nname=textField.getText();
		    String nmat=textArea.getText();
		   		    
		   try
			{
				PreparedStatement ps=con.prepareStatement(query);
		    	ps.setString(2,nname);
		    	ps.setString(3,nmat);
	   	        ps.setInt(1,0);
	   	     ps.setString(5,laginpage.usid);
	   	     ps.setString(4,null);
	   	        int n=ps.executeUpdate();
				System.out.println(n);
			}
			catch(Exception edb)
			{
				   edb.printStackTrace();
			}
		   
			
			
			
			
			
			
			
		//	JOptionPane.INFORMATION_MESSAGE(this, "Solved Successfully", "Done", JOptionPane.OK_OPTION);
		}
			
		
		if(e.getSource()==btnBack)
		{
			int re=  JOptionPane.showConfirmDialog(this, "do you want to cancel", "Sure", JOptionPane.YES_NO_OPTION);
			if(re==JOptionPane.YES_NO_OPTION)
			{student ad=new student();
			ad.setVisible(true);
			dispose();}
			
			
			
	}
	}}
