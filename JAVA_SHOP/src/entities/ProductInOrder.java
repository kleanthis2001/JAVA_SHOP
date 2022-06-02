package entities;

public class ProductInOrder {
	private Product product;
	private int quantity;
	
	public ProductInOrder(Product aProd,int aquntity) {
		product = aProd;
		quantity = aquntity;
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
	
	public float getTotalPrice() {
		return quantity * product.getPrice();
		
	}
	
}
