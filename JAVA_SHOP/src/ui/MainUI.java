package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Data.EshopData;
import entities.Product;

public class MainUI  extends JFrame {
	
	private JFrame MainFrame;
	private JRadioButton smartPhoneBtn;
	private JRadioButton LaptopBtn;
	private JRadioButton TvBtn;
	public static ShoppingCart cart;
	private JPanel panel,shoppingPanel,CenterPanel,s1,s2,s3,s4,s5;
	private ButtonGroup group;
	private JLabel Categories,prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9;
	private JButton CartButton;
	
	
	
	
	 public MainUI(ShoppingCart acart) {
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
		cart = acart;
		cart.changeShoppingCartVisibility(false);
		Categories = new JLabel("Categories");
		smartPhoneBtn = new JRadioButton("Smartphones");  
		LaptopBtn  = new JRadioButton("Laptops"); 
		TvBtn = new JRadioButton("Televisions"); 
		CartButton = new JButton("Shopping Cart");
		CartButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				cart.changeShoppingCartVisibility(true);
				
			}
		});
		group = new ButtonGroup();
		group.add(smartPhoneBtn);
		group.add(LaptopBtn);
		group.add(TvBtn);
		panel.setLayout(new BorderLayout());
		
		s1.setLayout(new BoxLayout(s1, BoxLayout.PAGE_AXIS));
		s2.add(Categories,BorderLayout.PAGE_START);
		Box.createVerticalStrut(40);
		s1.add(smartPhoneBtn);
		Box.createVerticalStrut(40);
		s1.add(LaptopBtn);
		Box.createVerticalStrut(40);
		s1.add(TvBtn);
		Box.createVerticalStrut(40);
		s3.add(CartButton,BorderLayout.PAGE_END);
		 
		
		panel.add(shoppingPanel,BorderLayout.LINE_START);
		panel.add(CenterPanel,BorderLayout.CENTER);
		
		CenterPanel.setLayout(new GridLayout(3, 3,50,50));

		

		MainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		MainFrame.setSize(600,400);
		MainFrame.setTitle("EShop");
		MainFrame.setLocationRelativeTo(null);
		MainFrame.getContentPane().add(panel);
		MainFrame.setResizable(false);
		MainFrame.setVisible(true);
	 }
	 
	 public void generateViewWithProducts(ArrayList<Product>products) {
		 for(Product aproduct:EshopData.getProducts()) {
			 JPanel apanel = new JPanel();
			 JLabel label1,label2;
			 label1= new JLabel();
			 label2 = new JLabel();
			 label1.setText(aproduct.getTitle());
			 label2.setText(aproduct.getPrice()+"");
			 apanel.add(label1);
			 apanel.add(label2);
			 apanel.addMouseListener(new MouseAdapter() {
				 
				 public void mouseClicked(MouseEvent click) {
					 int n = JOptionPane.showConfirmDialog(                              null, 
                             "Add product to shopping cart?", 
                             "Add product", 
                             JOptionPane.YES_NO_OPTION);   
					 if(n==JOptionPane.YES_OPTION){ 
						 cart.addProductToShoppingCart(aproduct);	 
} 
                 }
			});
		 }
	 }
	 
	 
	 public void generateViewForSmartPhones() {
		 ArrayList<Product> itproducts = new ArrayList<Product>();
		 String Smartphones = "Smartphone";
		 for(Product aprod: EshopData.getProducts()) {
			 if(aprod.getCategory().equals(Smartphones)) {
				 itproducts.add(aprod);
			 }	 
		 }
		 
		 generateViewWithProducts(itproducts);
	 }
	 
	 
 public void generateViewForLaptops() {
	 
	 ArrayList<Product> itproducts = new ArrayList<Product>();
	 String Laptop = "Laptop";
	 for(Product aprod: EshopData.getProducts()) {
		 if(aprod.getCategory().equals(Laptop)) {
			 itproducts.add(aprod);
		 }	 
	 } 
	 generateViewWithProducts(itproducts);
}
 
 public void generateViewForTvs() {
	 ArrayList<Product> itproducts = new ArrayList<Product>();
	 String TV = "TV";
	 for(Product aprod: EshopData.getProducts()) {
		 if(aprod.getCategory().equals(TV)) {
			 itproducts.add(aprod);
		 }	 
	 } 
	 generateViewWithProducts(itproducts);
 }
	
		
}
	

