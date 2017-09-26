package core;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class supdate extends JFrame implements ActionListener {
static String sid=laginpage.textField.getText();
 static String sname;
//static int fee,cid;
private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	JButton btnBack ;JButton btnReset;JButton btnNewButton ; 
private JTextField textField_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		
		
		
		System.out.println("nnnnnnnnnnn");
						
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supdate frame = new supdate();
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
	public supdate() {
		
		
		
		
		
		
		Connection con=dbinfo.con;
	    String query="select sname from stu where sid=?";

        
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
        	ps.setString(1,sid);
			ResultSet res=ps.executeQuery();
			while(res.next())
			{System.out.println("yyyyyyyyyyyyy");
			
				sname=res.getString(1);
				//fee=res.getInt(2);
				//cid=res.getInt(3);
			
				break;
			}
		}
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}
		

		
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSid = new JLabel("S.I.D.");
		lblSid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSid.setBounds(10, 11, 80, 14);
		contentPane.add(lblSid);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(10, 48, 109, 14);
		contentPane.add(lblName);
		
		JLabel lblColloge = new JLabel("Colloge");
		lblColloge.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblColloge.setBounds(10, 88, 109, 14);
		contentPane.add(lblColloge);
		
		JLabel lblEmailId = new JLabel("Email I.D.");
		lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmailId.setBounds(10, 123, 109, 14);
		contentPane.add(lblEmailId);
		
		JLabel lblMobileNo = new JLabel("Mobile N.O.");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMobileNo.setBounds(10, 166, 109, 14);
		contentPane.add(lblMobileNo);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(150, 11, 195, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText(sid);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(150, 48, 195, 20);
		contentPane.add(textField_1);
		textField_1.setText(sname);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(150, 88, 195, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(150, 123, 195, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(150, 154, 195, 20);
		contentPane.add(textField_4);
		
		 btnNewButton = new JButton("Update");
		btnNewButton.setBounds(41, 216, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		btnReset = new JButton("Reset");
		btnReset.setBounds(181, 216, 89, 23);
		contentPane.add(btnReset);
		btnReset.addActionListener(this);
		 btnBack = new JButton("Back");
		btnBack.setBounds(319, 216, 89, 23);
		contentPane.add(btnBack);
		
		textField_5 = new JTextField();
		textField_5.setBounds(150, 185, 199, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewPssward = new JLabel("New Passward");
		lblNewPssward.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewPssward.setBounds(10, 191, 133, 14);
		contentPane.add(lblNewPssward);btnBack.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==btnNewButton)
	{String col =textField_2.getText();
	String email=textField_3.getText();
	String mob=textField_4.getText();
	String pass=textField_5.getText();
	Connection con=dbinfo.con;
    String query="update stu SET emailid=? ,mob=?, collage=? ,pass=? where sid=?";
   
    
   try
	{
		PreparedStatement ps=con.prepareStatement(query);
    	ps.setString(3,col);
    	ps.setString(1,email);
	        ps.setInt(2,1111222212);
	        ps.setString(4,pass);
	        ps.setString(5,sid);
	        //ps.setString(9,sid);
	        //ps.setString(2,sname);
	        //ps.setInt(7,fee);
	        //ps.setInt(6,cid);
    int n=ps.executeUpdate();
		System.out.println(n);
	}
	catch(Exception edb)
	{
		   edb.printStackTrace();
	}
   JOptionPane.showMessageDialog(this, "Successfully Done", "Done", JOptionPane.CLOSED_OPTION);
   student ad=new student();
	ad.setVisible(true);
	dispose();
	}
	
	
	
	
	if(e.getSource()==btnReset)
	{textField_2.setText(null);
		textField_3.setText(null);
		textField_4.setText(null);
	}
	if(e.getSource()==btnBack)
	{student s1=new student();
	s1.setVisible(true);
	dispose();
		
	}
	}
}
