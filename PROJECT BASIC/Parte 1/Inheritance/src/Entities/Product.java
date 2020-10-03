package Entities;

public class Product {
	public String Name;
	protected Double Price;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}

	public Product(String name, Double price) {
		super();
		Name = name;
		Price = price;
	}
	
	public String PriceTag() {
		return Name + ", $" + String.format("%.2f", Price);
		//return Name + ", $" + String.format("%.2f", Price);
	}
}
