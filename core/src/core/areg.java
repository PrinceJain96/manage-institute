package core;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class areg extends JFrame implements ActionListener,ItemListener {
	JComboBox comboBox ;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
int y=0;
int cid,n=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					areg frame = new areg();
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
	public areg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(35, 29, 84, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassw = new JLabel("S.I.D.");
		lblPassw.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassw.setBounds(35, 81, 46, 14);
		contentPane.add(lblPassw);
		
		textField = new JTextField();
		textField.setText("");
		textField.setBounds(182, 26, 211, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(true);
		textField_1.setBounds(182, 81, 211, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCourse.setBounds(35, 131, 66, 14);
		contentPane.add(lblCourse);
		
	    comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select","Core Java", "Advance Java", "Admin 1", "Admin 2", "Admin 3", "SSP", "Jambo"}));
		comboBox.setBounds(182, 131, 211, 20);
		contentPane.add(comboBox);
		comboBox.addItemListener(this);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRegister.setBounds(174, 205, 107, 23);
		contentPane.add(btnRegister);
		btnRegister.addActionListener(this);
	}




	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		y=	comboBox.getSelectedIndex();
		System.out.println("you are"+y);		
		if(y==1)
		{cid=11;
			
		}
		if(y==2)
		{cid=12;
			
		}
		if(y==3)
		{cid=13;
			
		}
		if(y==4)
		{cid=14;
			
		}
		if(y==5)
		{cid=15;
			
		}
		
		if(y==6)
		{cid=16;
			
		}if(y==7)
		{cid=17;
			
		}
		
	}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	Connection con=dbinfo.con;
    String query="insert into stu values(?,?,?,?,?,?,?,?)";
    String sname=textField.getText();
    String sid=textField_1.getText();
	String s1="you@you.com";
	int mob=1111111111;
	String coll="rat";
	String pass="yourpass";
	int fee=1;
	try
	{
		PreparedStatement ps=con.prepareStatement(query);
    	ps.setString(1,sid);
    	ps.setString(2,sname);
    	ps.setInt(4,mob);
    	ps.setString(3,s1);
    	ps.setString(5,coll);
    	ps.setInt(6,cid);
    	ps.setInt(7,fee);
    	ps.setString(8,pass);
	    n=ps.executeUpdate();
		System.out.println(n);
	}
	catch(Exception edb)
	{
		   edb.printStackTrace();
	}
if(n==1)
{admin ad=new admin();
JOptionPane.showMessageDialog(this, "done", "done", JOptionPane.PLAIN_MESSAGE);
ad.setVisible(true);
dispose();
	}
else
{ JOptionPane.showMessageDialog(this, "Something went wrong Plese retry", "Error", JOptionPane.ERROR_MESSAGE);
	}




}


}