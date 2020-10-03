package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UserProduct extends Product {
	private static final SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
	private Date ManufactureDate;
	
	public Date getManufactureDate() {
		return ManufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		ManufactureDate = manufactureDate;
	}

	public UserProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		ManufactureDate = manufactureDate;
	}
	@Override
	public String PriceTag() {
		return getName() 
				+ " (used) $" 
				+ String.format("%.2f", getPrice()) 
				+ " (Manufacture date: " 
				+ simpleFormat.format(ManufactureDate)  
				+ ")";
	}
	
	
}
