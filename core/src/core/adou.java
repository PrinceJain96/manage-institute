package core;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class adou extends JFrame implements ActionListener,ItemListener{

	private JPanel contentPane;
	JButton btnSolve; JButton btnBack ;
	Vector vname=new Vector();
	Vector vnid=new Vector();
	JTextArea textArea ;	JTextArea textArea_1 ;
	JComboBox comboBox ;
	int nid;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adou frame = new adou();
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
	public adou() {
		
		
		
		
		
		
		Connection con=dbinfo.con;
	    String query="select did,dname from dou ";
       String nname;
       int nid;
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
        //	ps.setString(1,nid);
			ResultSet res=ps.executeQuery();
			while(res.next())
			{
				//flag=3;
				nname=res.getString(2);
				nid=res.getInt(1);
			vname.addElement(nname);
			vnid.addElement(nid);
				
			}
		}
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox = new JComboBox(vname);
		comboBox.setBounds(111, 11, 305, 20);
		contentPane.add(comboBox);
		
		JLabel lblTopic = new JLabel("Topic");
		lblTopic.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTopic.setBounds(10, 11, 74, 14);
		contentPane.add(lblTopic);
		
	textArea = new JTextArea();
		textArea.setCaretColor(Color.BLUE);
		textArea.setBounds(10, 42, 406, 85);
		contentPane.add(textArea);
		
	textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 138, 405, 85);
		contentPane.add(textArea_1);
		
btnSolve = new JButton("Solve");
		btnSolve.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSolve.setBounds(63, 228, 89, 23);
		contentPane.add(btnSolve);
		btnSolve.addActionListener(this);
btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(251, 228, 89, 23);
		contentPane.add(btnBack);
		btnBack.addActionListener(this);
		comboBox.addItemListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSolve)
		{// JOptionPane.INFORMATION_MESSAGE(this, "Solved Successfully", "Done", JOptionPane.OK_OPTION);
			
			
			
			
			
			
			
			
			Connection con=dbinfo.con;
			 String    query="update dou set dsol=? where did=?";
		       
				try
				{String s1=textArea_1.getText();
					PreparedStatement ps=con.prepareStatement(query);
		        	ps.setInt(2,++nid);
		        	ps.setString(1,s1);
					int x=ps.executeUpdate();
					}
				catch(Exception edb)
				{
					   edb.printStackTrace();
				}

			

			
			
			
			
			
		}
		if(e.getSource()==btnBack)
		{
			int re=  JOptionPane.showConfirmDialog(this, "do you want to cancel", "Sure", JOptionPane.YES_NO_OPTION);
			if(re==JOptionPane.YES_NO_OPTION)
			{admin ad=new admin();
			ad.setVisible(true);
			dispose();}
			
			
			
			}

		}
		// TODO Auto-generated method stub

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub

		int x=comboBox.getSelectedIndex();
		nid=(int)vnid.get(--x);
		System.out.println(nid);
		
		
		
		
		
		
		
		Connection con=dbinfo.con;
	 String    query="select dmat from dou where did=?";
       String nmat="aaaaaaaaaa";
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
        	ps.setInt(1,nid);
			ResultSet res=ps.executeQuery();
			while(res.next())
			{
				//flag=3;
				nmat=res.getString(1);
			
				break;
			}
		}
		catch(Exception edb)
		{
			   edb.printStackTrace();
		}

		textArea.setText(nmat);

	}
		
	}

