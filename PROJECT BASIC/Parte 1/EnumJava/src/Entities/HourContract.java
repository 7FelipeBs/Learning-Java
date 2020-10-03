package Entities;

import java.util.Date;

public class HourContract {
	Date DateContract;
	Double ValuePerContract;
	Integer Hours;
	
	public Date getDateContract() {
		return DateContract;
	}
	public void setDateContract(Date dateContract) {
		DateContract = dateContract;
	}
	
	public Double getValuePerContract() {
		return ValuePerContract;
	}
	public void setValuePerContract(Double valuePerContract) {
		ValuePerContract = valuePerContract;
	}
	
	public Integer getHours() {
		return Hours;
	}
	public void setHours(Integer hours) {
		Hours = hours;
	}
	
	public HourContract(Date dateContract, Double valuePerContract, Integer hours) {
		super();
		DateContract = dateContract;
		ValuePerContract = valuePerContract;
		Hours = hours;
	}
	
	public double totalValue() {
		return ValuePerContract * Hours;
	}
}
