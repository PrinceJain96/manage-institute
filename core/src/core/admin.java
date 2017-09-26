package core;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class admin extends JFrame implements ActionListener{
	login frame1=new login();
	//public static admin frame;
	private JPanel contentPane;
	public static JButton btnUpdateStructure;
	public static JButton  btnRegister ;
	public static JButton  btnViewFee ;
	public static JButton btnUpdateF;
	public static JButton  btnNote ;
	public static JButton  btnShowDueFees ;
	public static JButton  	btnLogout ;	
	private JDialog dia=new JDialog();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame=new admin();
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
	public admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnUpdateStructure = new JButton("Update Fee Structure");
		btnUpdateStructure.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		
		btnUpdateStructure.setBounds(35, 26, 232, 23);
		contentPane.add(btnUpdateStructure);
		
	 btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRegister.setBounds(302, 26, 108, 23);
		contentPane.add(btnRegister);
		
		 btnViewFee = new JButton("View");
		btnViewFee.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnViewFee.setBounds(302, 185, 113, 23);
		contentPane.add(btnViewFee);
		
	btnUpdateF = new JButton("Reply Dout");
		btnUpdateF.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdateF.setBounds(291, 113, 133, 23);
		contentPane.add(btnUpdateF);
		
		 btnNote = new JButton("Add New Notes");
		btnNote.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNote.setBounds(46, 185, 232, 23);
		contentPane.add(btnNote);
		
	  btnShowDueFees = new JButton("Update Student Fees");
		btnShowDueFees.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnShowDueFees.setBounds(35, 113, 232, 23);
		contentPane.add(btnShowDueFees);
		
 btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogout.setBounds(182, 219, 125, 23);
		contentPane.add(btnLogout);
		btnLogout.addActionListener(this);
		btnShowDueFees.addActionListener(this);
		btnNote.addActionListener(this);
		btnUpdateF.addActionListener(this);
		btnViewFee.addActionListener(this);
		btnRegister.addActionListener(this);
		btnUpdateStructure.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==btnLogout)
		{
 
		frame1.setVisible(true);
			dispose();
		}
		if(e.getSource()==btnShowDueFees)
		{dispose();
		upfee a1=new upfee();
		a1.setVisible(true);
			
		}
		if(e.getSource()==btnNote)
		{			dispose();
	
		notes frame4=new notes();
		frame4.setVisible(true);
}
		if(e.getSource()==	btnUpdateF)
		{
			
			adou s1=new adou();
			s1.setVisible(true);
			dispose();
				
		}
		if(e.getSource()==btnViewFee)
		{  dispose();
			avir frame3=new avir();
			frame3.setVisible(true);

		}
		if(e.getSource()==btnRegister)
		{	dispose();
			areg frame2=new areg();
		frame2.setVisible(true);}
		if(e.getSource()==btnUpdateStructure)
		{dispose();
		fee frame5=new fee();
		frame5.setVisible(true);}// TODO Auto-generated method stub
		
	}
}
