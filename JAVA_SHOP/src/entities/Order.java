package entities;

import java.util.ArrayList;

public class Order {
	private ArrayList<ProductInOrder> products ;

	public ArrayList<ProductInOrder> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<ProductInOrder> products) {
		this.products = products;
	}
	
	public float getTotalPrice() {
		float TotalPrice = 0;
		for(ProductInOrder a:products) {
			TotalPrice = TotalPrice + a.getTotalPrice();
		}
		return 0;
	}
	
}
