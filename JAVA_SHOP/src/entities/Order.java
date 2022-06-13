package entities;

import java.util.ArrayList;

public class Order {
	private ArrayList<ProductInOrder> products ;
	private Customer customer;
	private Payment apaymethod;
	private ArrayList<ProductInOrder> prodorder;

	
	public Order(ArrayList<ProductInOrder> product,Customer acustomer,ArrayList<ProductInOrder> prodorder) {
		this.products = product;
		this.customer = acustomer;
		this.prodorder = prodorder;
	}

	public ArrayList<ProductInOrder> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<ProductInOrder> products) {
		this.products = products;
	}
	
	public double getTotalPrice() {
		double TotalPrice = 0;
		for(ProductInOrder a:products) {
			TotalPrice = TotalPrice + a.getTotalPrice();
		}
		return 0;
	}
	
}
