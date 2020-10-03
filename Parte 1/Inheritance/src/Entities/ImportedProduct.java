package Entities;

public final class ImportedProduct extends Product{
	
	private double CustomFee;
	
	public double getCustomFee() {
		return CustomFee;
	}
	public void setCustomFee(double customFee) {
		CustomFee = customFee;
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		CustomFee = customFee;
	}
	
	public double TotalPrice() {
		return getPrice() + CustomFee;
	}
	
	@Override
	public String PriceTag() {
		return getName() 
				+ " $ " + String.format("%.2f", TotalPrice())
				+ " (Customs fee: $ " + String.format("%.2f", CustomFee)+ ")";
	}
}
