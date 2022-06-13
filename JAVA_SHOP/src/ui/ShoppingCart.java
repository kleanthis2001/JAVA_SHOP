package ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import entities.Product;
import entities.ProductInOrder;


public class ShoppingCart {
	private JFrame ShoppingCart;
	private JScrollPane scroll;
	private ProductInOrderPanel product;
	private JButton ProceedBtn,RemoveBtn;
	private JPanel apanel,secondpanel;
	private ArrayList<ProductInOrder> prodorder;
	
	public ShoppingCart() {
		apanel = new JPanel(new GridLayout(1,1,60,60));
		secondpanel = new JPanel();
		/* secondpanel.setLayout(new BoxLayout(target, axis)); */
		ShoppingCart = new JFrame("ShoppingCart");
		ProceedBtn = new JButton("Procced Order");
		RemoveBtn = new JButton("Remove All");
		scroll = new JScrollPane();
		ShoppingCart.setLayout(new BorderLayout());
		scroll.getViewport().add(secondpanel);
		ShoppingCart.add(scroll,BorderLayout.CENTER);
		apanel.add(ProceedBtn);
		apanel.add(RemoveBtn);
		ShoppingCart.add(apanel,BorderLayout.PAGE_END);
		
		ShoppingCart.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ShoppingCart.setSize(400,200);
		ShoppingCart.setTitle("ShoppingCart");
		ShoppingCart.setResizable(false);
		ShoppingCart.setLocationRelativeTo(null);	    
		ShoppingCart.setVisible(true);
	}
	
	public void changeShoppingCartVisibility(boolean abool) {
		ShoppingCart.setVisible(abool);
	}

	public void addProductToShoppingCart(Product aproduct) {
		// TODO Auto-generated method stub
		ProductInOrder prodinorder = new ProductInOrder(aproduct);
		ProductInOrderPanel ProdInOrderPanel = new ProductInOrderPanel(prodinorder);
		secondpanel.add(ProdInOrderPanel);
	}
	
	public void removeProductFromShoppingCart(ProductInOrderPanel p) {
		secondpanel.remove(p);
		secondpanel.revalidate();
	}
}
