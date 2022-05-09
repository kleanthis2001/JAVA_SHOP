import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.*;


public class LogIn_Frame  extends JFrame{
	private JLabel Username,Password;
	private TextField Username_Field,Password_Field;
	private JButton Register_Button,LogIn_Button;
	private JFrame LogInFrame;
	
	public LogIn_Frame() {
		JPanel panel = new JPanel();
		JPanel panel_upper = new JPanel();
		panel_upper.setPreferredSize(new Dimension(30, 30));
		JPanel panel_end = new JPanel();
		panel_end.setPreferredSize(new Dimension(30, 30));
		JPanel panel_center = new JPanel();
		panel_center.setLayout(new GridLayout(3, 2, 40, 50));
		JPanel panel_left = new JPanel();
		panel_left.setPreferredSize(new Dimension(30, 30));
		JPanel panel_right = new JPanel();
		panel_right.setPreferredSize(new Dimension(30, 30));
		
		Username = new JLabel("Username");
		Username_Field = new TextField();
		Password = new JLabel("Password");
		Password_Field = new TextField();
		Register_Button = new JButton();
		LogIn_Button = new JButton();
		
		panel.setLayout(new BorderLayout());
		panel.add(panel_upper,BorderLayout.PAGE_START);
		panel.add(panel_end,BorderLayout.PAGE_END);
		panel.add(panel_center,BorderLayout.CENTER);
		panel.add(panel_left,BorderLayout.LINE_START);
		panel.add(panel_right,BorderLayout.LINE_END);
		
		
		Username_Field.setSize(40,10);
		Password_Field.setSize(40,10);
		Register_Button.setText("Register");
		LogIn_Button.setText("Login");
		
		panel_center.add(Username);
		panel_center.add(Username_Field);
		panel_center.add(Password);
		panel_center.add(Password_Field);
		panel_center.add(Register_Button);
		panel_center.add(LogIn_Button);

		
		LogInFrame = new JFrame();
		LogInFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		LogInFrame.setSize(300,300);
		LogInFrame.setTitle("Login");
		
		LogInFrame.setLocationRelativeTo(null);
	    LogInFrame.getContentPane().add(panel);
	    LogInFrame.setVisible(true);
	}
}
