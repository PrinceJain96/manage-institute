package core;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class upfeed extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	JButton okButton ;
	JButton cancelButton ;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			upfeed dialog = new upfeed();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public upfeed() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblEnterSid = new JLabel("Enter SI.D.");
			lblEnterSid.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblEnterSid.setBounds(33, 31, 125, 30);
			contentPanel.add(lblEnterSid);
		}
		{
			textField = new JTextField();
			textField.setBounds(211, 39, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		
		JCheckBox chckbxFirst = new JCheckBox("First");
		chckbxFirst.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxFirst.setBounds(40, 115, 97, 23);
		contentPanel.add(chckbxFirst);
		
		JCheckBox chckbxSecond = new JCheckBox("Second");
		chckbxSecond.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxSecond.setBounds(183, 115, 97, 23);
		contentPanel.add(chckbxSecond);
		
		JCheckBox chckbxThird = new JCheckBox("Third");
		chckbxThird.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxThird.setBounds(331, 115, 97, 23);
		contentPanel.add(chckbxThird);
		
		JLabel lblFee = new JLabel("Fee");
		lblFee.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFee.setBounds(33, 83, 46, 14);
		contentPanel.add(lblFee);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(211, 70, 86, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==okButton)
		{
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
	
	
	
	}
}
