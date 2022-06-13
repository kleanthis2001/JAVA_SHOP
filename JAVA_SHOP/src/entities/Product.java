package entities;

public class Product {
	private double price,tax;
	private String title,category,description;
	
	public Product(double aprice,double atax,String atitle,String aCategory,String aDescription) {
		this.price = aprice;
		this.tax = atax;
		this.title = atitle;
		this.category = aCategory;
		this.description = aDescription;
	}
	
	public double getPrice() {
		return price = price + price * tax;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
