package Entities;

public class Fileswork {
	public String Name;
	public Integer Quantity;
	private Double Price;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	
	public Fileswork(String name, Integer quantity, Double price) {
		super();
		Name = name;
		Quantity = quantity;
		Price = price;
	}
	
	public double totalValue() {
		return Price * Quantity;
	}
	@Override
	public String toString() {
		return Name + ", " + totalValue();
	}
	
	
}
