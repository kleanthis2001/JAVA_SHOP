package ui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import entities.ProductInOrder;
public class ProductInOrderPanel extends JPanel{
	private JPanel panel;
	private JLabel label1,label2,label3,label4;
	private ProductInOrder product;
	private String title;
	private String quantity;
	private String Price;
	private String finalPrice;
	private JButton plusbtn ,minusbtn,removebtn;
	

	
	public ProductInOrderPanel(ProductInOrder aProduct) {
		super();
		this.product = aProduct;
		title = product.getProduct().getTitle();
		Price=Double.toString(product.getProduct().getPrice());
		quantity=Integer.toString(product.getQuantity());
		finalPrice = Double.toString(product.getTotalPrice());
		label1 = new JLabel(title,SwingConstants.CENTER);
		label2 = new JLabel(Price,SwingConstants.CENTER);
		label3 = new JLabel(quantity,SwingConstants.CENTER);
		label4 = new JLabel(finalPrice,SwingConstants.CENTER);
		plusbtn = new  JButton("+1");
		minusbtn = new JButton("-1");
		removebtn = new JButton("remove");
		
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(plusbtn);
		this.add(minusbtn);
		this.add(removebtn);
		
		plusbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int currentQuantity = aProduct.getQuantity();
				aProduct.setQuantity(currentQuantity +1 );
				aProduct.setTotalPrice();
			}
		});
		
		minusbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int currentQuantity = aProduct.getQuantity();
				aProduct.setQuantity(currentQuantity -1 );
				aProduct.setTotalPrice();
			}
		});
		
		removebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				MainUI.cart.removeProductFromShoppingCart(ProductInOrderPanel.this);
			}
		});
		this.setLayout(new FlowLayout());
		
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(plusbtn);
		this.add(minusbtn);
		this.add(removebtn);
		this.setVisible(true);
		
		
	}
}

