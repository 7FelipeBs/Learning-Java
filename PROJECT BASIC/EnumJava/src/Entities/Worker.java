package Entities;

import Enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import Entities.Department;
import Entities.HourContract;

public class Worker {
	
	String Name;
	WorkerLevel Level;
	Double BaseSalary;
	Department Department;
	List<HourContract> Contract = new ArrayList();
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public WorkerLevel getLevel() {
		return Level;
	}
	private void setLevel(WorkerLevel level) {
		Level = level;
	}
	
	public Double getBaseSalary() {
		return BaseSalary;
	}
	private void setBaseSalary(Double baseSalary) {
		BaseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return Department;
	}
	private void setDepartment(Department department) {
		Department = department;
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Entities.Department department) {
		super();
		Name = name;
		Level = level;
		BaseSalary = baseSalary;
		Department = department;
	}
	
	public void addContract(HourContract contract) {
		Contract.add(contract);
	}
	
	public void removeContract (HourContract contract) {
		Contract.remove(contract);
	}
	
	public double Income(int year, int month) {
		double sum = BaseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : Contract) {
			cal.setTime(c.getDateContract());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
