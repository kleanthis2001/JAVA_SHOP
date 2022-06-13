package entities;

public class ProductInOrder {
	private Product product;
	private int quantity = 1 ;
	private double totalPrice ;
	
	public ProductInOrder(Product aProd) {
		product = aProd;
		this.totalPrice =  aProd.getPrice();
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setTotalPrice() {
		this.totalPrice =  quantity * product.getPrice();
		
	}
	
	public double getTotalPrice() {
		return  totalPrice;
	}
	
}
