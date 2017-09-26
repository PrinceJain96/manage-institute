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
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class aview extends JFrame implements ActionListener {
	JButton btnBack;
	JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	public static aview frame;
	String sname,email,mob,col,cou;
	int cid,fee;
	admin frame1=new admin() ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new aview();
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
	public aview() {
		
		
		
		
		Connection con=dbinfo.con;
	    String query="select * from stu where sid=?";
        
		
		
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
        	ps.setString(1,avir.Svid);
			ResultSet res=ps.executeQuery();
			while(res.next())
			{
				//flag=3;
			sname=res.getString(2);
				 mob=res.getString(4);
				email=res.getString(3);
				col=res.getString(5);
				fee=res.getInt(7);
				cid=res.getInt(6);
				
			
			}
		}
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}


		 query="select cname from course where cid=?";
	        
			
			
			try
			{
				PreparedStatement ps=con.prepareStatement(query);
	        	ps.setInt(1,cid);
				ResultSet res=ps.executeQuery();
				while(res.next())
				{
					//flag=3;
				cou=res.getString(1);
					
					
				
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
		chckbxNewCheckBox.setEnabled(false);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxNewCheckBox.setBounds(43, 196, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
	  btnBack = new JButton("Back");
		btnBack.addActionListener( this);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(182, 228, 89, 23);
		contentPane.add(btnBack);
		
		JCheckBox chckbxThird = new JCheckBox("Third");
		chckbxThird.setEnabled(false);
		chckbxThird.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxThird.setBounds(319, 196, 97, 23);
		contentPane.add(chckbxThird);
		
		JCheckBox chckbxSecond = new JCheckBox("Second");
		chckbxSecond.setEnabled(false);
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
		textField.setText(sname);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(164, 36, 205, 20);
		contentPane.add(textField_1);
		textField_1.setText(avir.Svid);
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(164, 61, 205, 20);
		contentPane.add(textField_2);
		textField_2.setText(col);
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(164, 86, 205, 20);
		contentPane.add(textField_3);
		textField_3.setText(cou);
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(164, 118, 205, 20);
		contentPane.add(textField_4);
		textField_4.setText(email);
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(164, 150, 205, 20);
		contentPane.add(textField_5);
		textField_5.setText(mob);
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(164, 175, 205, 20);
		contentPane.add(textField_6);
		textField_6.setText(sname);
	    System.out.println(fee);
		if (fee==1)
	    {chckbxNewCheckBox.setSelected(true);
	    	
	    }
	    if (fee==2)
	    {chckbxSecond.setSelected(true);
	    	
	    }
	    if (fee==3)
	    {chckbxThird.setSelected(true);
	    	
	    }
	    
	   
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		frame1.setVisible(true);
		// TODO Auto-generated method stub
		
	}
}
