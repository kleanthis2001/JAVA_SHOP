package ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class ShoppingCart {
	private JFrame ShoppingCart;
	private JScrollPane scroll;
	private ProductInOrderPanel product;
	private JButton ProceedBtn,RemoveBtn;
	private JPanel apanel;
	
	public ShoppingCart(boolean abool) {
		apanel = new JPanel(new GridLayout(1,1,60,60));
		ShoppingCart = new JFrame("ShoppingCart");
		ProceedBtn = new JButton("Procced Order");
		RemoveBtn = new JButton("Remove All");
		scroll = new JScrollPane();
		ShoppingCart.setLayout(new BorderLayout());
		scroll.getViewport().add(product);
		ShoppingCart.add(scroll,BorderLayout.CENTER);
		apanel.add(ProceedBtn);
		apanel.add(RemoveBtn);
		ShoppingCart.add(apanel,BorderLayout.PAGE_END);
		
		ShoppingCart.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ShoppingCart.setSize(400,200);
		ShoppingCart.setTitle("ShoppingCart");
		ShoppingCart.setResizable(false);
		ShoppingCart.setLocationRelativeTo(null);	    
		ShoppingCart.setVisible(abool);
	}
}
