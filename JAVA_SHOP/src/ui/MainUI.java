package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainUI  extends JFrame{
	
	private JFrame MainFrame;
	private JRadioButton smartPhoneBtn;
	private JRadioButton LaptopBtn;
	private JRadioButton TabletsBtn;
	private ShoppingCart cart;
	private JPanel panel,shoppingPanel,CenterPanel,s1,s2,s3,s4,s5;
	private ButtonGroup group;
	private JLabel Categories,prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9;
	private JButton CartButton;
	
	
	
	
	 public MainUI() {
		MainFrame = new JFrame();
		panel = new JPanel();
		s1 =new JPanel();
		s2 = new JPanel();
		s3 = new JPanel();
		s4 = new JPanel();
		s5 = new JPanel();
		
		shoppingPanel = new JPanel();
		shoppingPanel.setLayout(new BorderLayout());
		shoppingPanel.add(s1,BorderLayout.CENTER);
		shoppingPanel.add(s2,BorderLayout.PAGE_START);
		shoppingPanel.add(s3,BorderLayout.PAGE_END);
		shoppingPanel.add(s4,BorderLayout.LINE_START);
		CenterPanel = new JPanel();
		
		cart = new ShoppingCart(false);
		Categories = new JLabel("Categories");
		prod1 = new JLabel("Title"+"\n"+"Price");
		prod2 = new JLabel("Title"+"\n"+"Price");
		prod3 = new JLabel("Title"+"\n"+"Price");
		prod4 = new JLabel("Title"+"\n"+"Price");
		prod5 = new JLabel("Title"+"\n"+"Price");
		prod6 = new JLabel("Title"+"\n"+"Price");
		prod7 = new JLabel("Title"+"\n"+"Price");
		prod8 = new JLabel("Title"+"\n"+"Price");
		prod9 = new JLabel("Title"+"\n"+"Price");
		
		smartPhoneBtn = new JRadioButton("Smart Phones");  
		LaptopBtn  = new JRadioButton("Laptops"); 
		TabletsBtn = new JRadioButton("Tablets"); 
		CartButton = new JButton("Shopping Cart");
		group = new ButtonGroup();
		group.add(smartPhoneBtn);
		group.add(LaptopBtn);
		group.add(TabletsBtn);
		panel.setLayout(new BorderLayout());
		
		s1.setLayout(new BoxLayout(s1, BoxLayout.PAGE_AXIS));
		s2.add(Categories,BorderLayout.PAGE_START);
		Box.createVerticalStrut(40);
		s1.add(smartPhoneBtn);
		Box.createVerticalStrut(40);
		s1.add(LaptopBtn);
		Box.createVerticalStrut(40);
		s1.add(TabletsBtn);
		Box.createVerticalStrut(40);
		s3.add(CartButton,BorderLayout.PAGE_END);
		 
		
		panel.add(shoppingPanel,BorderLayout.LINE_START);
		panel.add(CenterPanel,BorderLayout.CENTER);
		
		CenterPanel.setLayout(new GridLayout(3, 3,50,50));
		
		CenterPanel.add(prod1,BorderLayout.CENTER);
		CenterPanel.add(prod2,BorderLayout.CENTER);
		CenterPanel.add(prod3,BorderLayout.CENTER);
		CenterPanel.add(prod4,BorderLayout.CENTER);
		CenterPanel.add(prod5,BorderLayout.CENTER);
		CenterPanel.add(prod6,BorderLayout.CENTER);
		CenterPanel.add(prod7,BorderLayout.CENTER);
		CenterPanel.add(prod8,BorderLayout.CENTER);
		CenterPanel.add(prod9,BorderLayout.CENTER);

		

		MainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		MainFrame.setSize(600,400);
		MainFrame.setTitle("EShop");
		MainFrame.setLocationRelativeTo(null);
		MainFrame.getContentPane().add(panel);
		MainFrame.setResizable(false);
		MainFrame.setVisible(true);
	 }
	
}
