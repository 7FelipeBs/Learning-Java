package Entities;

public class Employee {

	Double GrossSalary, Tax;
	String Name;
	
	public Double getGrossSalary() {
		return GrossSalary;
	}	
	public void setGrossSalary(double GrossSalary) {
		this.GrossSalary = GrossSalary;
	}
	
	public Double getTax() {
		return Tax;
	}
	public void setTax(double Tax) {
		this.Tax = Tax;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public Employee() {
			
	}
	public Employee(double GrossSalary, double Tax, String Name) {
		this.GrossSalary = GrossSalary;
		this.Tax = Tax;
		this.Name = Name;
	}
	
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void increaseSalary(double percentage) {
		GrossSalary = GrossSalary + (GrossSalary / 100 * percentage);
	}
}
