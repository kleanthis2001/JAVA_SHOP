package ui;

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
	
	public ProductInOrderPanel(ProductInOrder aProduct) {
		super();
		this.product = aProduct;
	}
	
	public ProductInOrderPanel() {
		title = product.getProduct().getTitle();
		Price=Float.toString(product.getProduct().getPrice());
		quantity=Integer.toString(product.getQuantity());
		finalPrice = Float.toString(product.getTotalPrice());
		label1 = new JLabel(title,SwingConstants.CENTER);
		label2 = new JLabel(Price,SwingConstants.CENTER);
		label3 = new JLabel(quantity,SwingConstants.CENTER);
		label4 = new JLabel(finalPrice,SwingConstants.CENTER);
		
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		
		this.setVisible(true);
		
		
	}
}

