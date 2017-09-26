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

import javax.swing.JTextField;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class avir extends JDialog implements ActionListener{
aview frame1=new aview(); 
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JLabel lblEnterSid;
	private JPanel buttonPane;
	private JButton okButton;
	private JButton cancelButton;
public static String Svid="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			avir dialog = new avir();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public avir() {
		setTitle("View Detalile");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblEnterSid = new JLabel("Enter S.I.D.");
			lblEnterSid.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblEnterSid.setBounds(48, 91, 106, 40);
			contentPanel.add(lblEnterSid);
		}
		{
			textField = new JTextField();
			textField.setBounds(245, 104, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(this);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getContentPane(), contentPanel, lblEnterSid, textField, buttonPane, okButton, cancelButton}));
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==okButton)
		{ Svid=textField.getText();
			System.out.println(Svid);
			dispose();
			aview frame3=new aview();
			frame3.setVisible(true);

		}
		
	}

}
