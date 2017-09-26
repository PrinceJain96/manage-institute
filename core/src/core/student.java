package core;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class student extends JFrame implements ActionListener {
	public static JButton btnLogout;
	public static JButton btnViewFess;
	public static JButton btnUpdateInfo;
	public static JButton btnNotes;
	private JPanel contentPane;
	public static student frame;  
	JButton btnDaout;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				frame = new student();
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
	public student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
 btnUpdateInfo = new JButton("Update Info");
		btnUpdateInfo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdateInfo.setBounds(48, 54, 153, 23);
		contentPane.add(btnUpdateInfo);
		
		btnDaout = new JButton("Daout");
		btnDaout.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDaout.setBounds(48, 139, 153, 23);
		contentPane.add(btnDaout);
		
		 btnNotes = new JButton("Notes");
		btnNotes.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNotes.setBounds(279, 54, 122, 23);
		contentPane.add(btnNotes);
		
		 btnViewFess = new JButton("View Fess");
		btnViewFess.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnViewFess.setBounds(279, 142, 122, 23);
		contentPane.add(btnViewFess);
		
		 btnLogout = new JButton("LogOut ");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogout.setBounds(162, 206, 116, 23);
		contentPane.add(btnLogout);
	btnLogout.addActionListener(this);
	btnNotes.addActionListener(this);
	btnUpdateInfo.addActionListener(this);
	btnViewFess.addActionListener(this);
	btnDaout.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub


	    

		if(e.getSource()==btnDaout)
		{sdou frame4=new sdou();
		dispose();
		frame4.setVisible(true);}
		
	    
		
		if(e.getSource()==btnLogout)
		{laginpage frame4=new laginpage();
		dispose();
		frame4.setVisible(true);}
		if(e.getSource()==btnNotes)
		{dispose();
		snotes frame2=new snotes();frame2.setVisible(true);}
		if(e.getSource()==btnUpdateInfo)
		{supdate frame3=new supdate();
			dispose();frame3.setVisible(true);}
		if(e.getSource()==btnViewFess)
		{		sfee frame1=new sfee();
		frame1.setVisible(true);}
		dispose();}

}
