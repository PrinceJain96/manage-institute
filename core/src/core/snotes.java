package core;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class snotes extends JFrame implements ActionListener, ItemListener{
	JTextArea textArea;
	private JPanel contentPane;
	JComboBox comboBox ;
	Vector vname=new Vector();
	Vector vnid=new Vector();
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					snotes frame = new snotes();
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
	public snotes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTopic = new JLabel("Topic");
		lblTopic.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTopic.setBounds(21, 21, 79, 20);
		contentPane.add(lblTopic);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {student s1=new student();
				s1.setVisible(true);
			dispose();
			}
		});
		btnNewButton.setBounds(193, 213, 89, 23);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(21, 73, 385, 133);
		contentPane.add(textArea);
		System.out.println("---------------------------------------");
		
		

		Connection con=dbinfo.con;
	    String query="select nid,nname from note ";
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

		

		System.out.println(vname);
		System.out.println(vnid);
		
		
		comboBox = new JComboBox(vname);
		comboBox.setBounds(110, 24, 274, 20);
		contentPane.add(comboBox);
		
		comboBox.addItemListener(this);
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub

		int x=comboBox.getSelectedIndex();
		int nid=(int)vnid.get(--x);
		System.out.println(nid);
		
		
		
		
		
		
		
		Connection con=dbinfo.con;
	 String    query="select nmat from note where nid=?";
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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
