package core;
import core.admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.ComponentOrientation;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class laginpage extends JFrame implements ActionListener , ItemListener {
	public static JComboBox comboBox;
	
public static String usid="11";

	 int y=0;
	 int flag=0;
	
	 private JPanel contentPane;
	 private JPasswordField passwordField;
     public static	laginpage frame;
     public static JTextField textField;
    
/**
	 * Launch the application.
	 */


//void db()
{	}






public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame= new laginpage();
					
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
	@SuppressWarnings("deprecation")
	public laginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserId = new JLabel("User I.D.");
		lblUserId.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblUserId.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserId.setBackground(Color.BLACK);
		lblUserId.setBounds(39, 58, 104, 29);
		contentPane.add(lblUserId);
		
		JLabel lblPassward = new JLabel("Passward");
		lblPassward.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblPassward.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassward.setBackground(Color.BLACK);
		lblPassward.setBounds(39, 106, 130, 29);
		contentPane.add(lblPassward);
		
		JLabel lblType = new JLabel("Type");
		lblType.setHorizontalAlignment(SwingConstants.LEFT);
		lblType.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblType.setBackground(Color.BLACK);
		lblType.setBounds(45, 162, 104, 29);
		contentPane.add(lblType);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(227, 115, 175, 20);
		contentPane.add(passwordField);
		  comboBox = new JComboBox();
		comboBox.setMaximumRowCount(3);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select","Admin", "Student"}));
		comboBox.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		comboBox.setBounds(227, 170, 104, 20);
		contentPane.add(comboBox);
		comboBox.addItemListener(this);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubmit.setBounds(157, 228, 153, 23);
		contentPane.add(btnSubmit);
		
		textField = new JTextField();
		textField.setBounds(224, 66, 178, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		btnSubmit.addActionListener(this);}

	
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		 char ch[]=passwordField.getPassword();
			String  pass=new String(ch);	
		
			y=	comboBox.getSelectedIndex();
		if(y==1&&pass.equalsIgnoreCase("rat")) 
			  {flag=1;}
			  
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		 char ch[]=passwordField.getPassword();
			String  pass=new String(ch);	
		System.out.println(pass);
			if(y==2)
			{		
				Connection con=dbinfo.con;
				    String query="select pass from stu where sid=?";
			        String uid=textField.getText();
					String passdb="";
					
					try
					{
						PreparedStatement ps=con.prepareStatement(query);
			        	ps.setString(1,uid);
						ResultSet res=ps.executeQuery();
						while(res.next())
						{
							//flag=3;
							passdb=res.getString(1);
							System.out.println(passdb);
							break;
						}
					}
					catch(Exception edb)
					{
						   edb.printStackTrace();
					}


					
					
					if(pass.equals(passdb))
					{flag=3;}
					
			}		

		
		
     if(flag==1)
		{
	
	   admin frame1=new admin();
	   frame1.setVisible(true);
	   dispose();}
	 if(flag==2)
		   {
			 JOptionPane.showMessageDialog(this, "Wrong username or password!", "Error", JOptionPane.ERROR_MESSAGE);
		   	}
	if(flag==3)
	    {student frame2=new student();
	     frame2.setVisible(true);
		 dispose();
		}
	
	}

	
}
