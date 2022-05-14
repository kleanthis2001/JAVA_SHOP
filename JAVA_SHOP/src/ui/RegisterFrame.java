package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Data.EshopData;
import entities.Customer;
import eshop.Eshop;


public class RegisterFrame extends JFrame {
	private JLabel Name,email,Username,Password,Birthday,Address,telephone;
	private JTextField  name_field,email_field,Username_field,Password_field,
			Birthday_field,Address_field,telephone_field ;
	private JCheckBox Newsletter ;
	private JButton RegisterButton;
	private JFrame RegisterFrame;
	private JPanel panel,center_panel,panel1,panel2,panel3,panel4;
	
	public  RegisterFrame() {
		//JLabel initialize
		RegisterFrame = new JFrame();
		Name = new JLabel("Name");
		email = new JLabel("email");
		Username = new JLabel("Username");
		Password = new JLabel("Password");
		Birthday = new JLabel("Birthdate");
		Address = new JLabel("Address");
		telephone = new JLabel("Telephone");
		
		//JTextField initilize 
		name_field = new JTextField();
		email_field = new JTextField();
		Username_field = new JTextField();
		Password_field = new JTextField();
		Birthday_field = new JTextField();
		Address_field = new JTextField();
		telephone_field = new JTextField();
		
		//JButton initilize 
		RegisterButton = new JButton("Register");
		
		
		//JCheckbox initilize
		Newsletter = new JCheckBox("Newsletter update");
		
	RegisterButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String  aname = name_field.getText();
				String  aemail = email_field.getText();
				String 	aUsername = Username_field.getText();
				String  aPassword = Password_field.getText();
				Date  aDate = new Date();
				String aAddress = Address_field.getText();
				String aPhone = telephone_field.getText();
				Boolean Newsletter ;
	
				if(RegisterFrame.this.Newsletter.isSelected()) {
					Newsletter = true;
				}else
					Newsletter = false;
				
				Customer aCustomer = new  Customer(aAddress, aAddress, aDate, Newsletter, aname, aUsername,
													aPhone, aemail, aPassword, aDate);
				System.out.println(aAddress+aAddress+ aDate+Newsletter.toString()+ aname+ aUsername+
						aPhone+ aemail+ aPassword+ aDate);
				EshopData.getUsers().add(aCustomer);
				
			}
		});
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(50, 50));
		panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(50, 50));
		panel3 = new JPanel();
		panel3.setPreferredSize(new Dimension(50, 50));
		panel4 = new JPanel();
		panel4.setPreferredSize(new Dimension(50, 50));
		center_panel = new JPanel();
		center_panel.setLayout(new GridLayout(8, 2,40,40));
		
		panel.add(center_panel,BorderLayout.CENTER);
		panel.add(panel1,BorderLayout.WEST);
		panel.add(panel2,BorderLayout.EAST);
		panel.add(panel3,BorderLayout.SOUTH);
		panel.add(panel4,BorderLayout.NORTH);
		
		center_panel.add(Name);
		center_panel.add(name_field);
		center_panel.add(email);
		center_panel.add(email_field);
		center_panel.add(Username);
		center_panel.add(Username_field);
		center_panel.add(Password);
		center_panel.add(Password_field);
		center_panel.add(Birthday);
		center_panel.add(Birthday_field);
		center_panel.add(Address);
		center_panel.add(Address_field);
		center_panel.add(telephone);
		center_panel.add(telephone_field);
		center_panel.add(Newsletter);
		center_panel.add(RegisterButton);
		
		RegisterFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		RegisterFrame.setSize(600,600);
		RegisterFrame.setTitle("RegisterFrame");
		
		RegisterFrame.setLocationRelativeTo(null);
		RegisterFrame.getContentPane().add(panel);
	    
		RegisterFrame.setVisible(true);
	}
}
