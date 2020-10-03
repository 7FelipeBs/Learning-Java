package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	
	private static SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");
	private Date dueDate;
	private Double amount;
	
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Installment(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return DateFormat.format(dueDate) + " - " + String.format("%.2f", amount);
 	}
}
